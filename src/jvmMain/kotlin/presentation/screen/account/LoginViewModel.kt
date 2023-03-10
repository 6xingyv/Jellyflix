package presentation.screen.account

import data.repository.JellyfinRepository
import data.source.remote.JellyfinApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import presentation.utils.ViewModel

class LoginViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<UiState>(UiState.Loading)
    val uiState = _uiState.asStateFlow()

    private lateinit var repository: JellyfinRepository
    private lateinit var api: JellyfinApi

    sealed class UiState {
        data class Normal(
            val server: String = "http://localhost:8096",
            val username: String = "阿睿",
            val password: String = "123456zzr"
        ) : UiState()

        object Loading : UiState()
        object Logged : UiState()
        data class Error(val error: Exception) : UiState()
    }

    fun init(viewModelScope: CoroutineScope, jellyfinRepository: JellyfinRepository, jellyfinApi: JellyfinApi) {
        super.init(viewModelScope)
        this.repository = jellyfinRepository
        this.api = jellyfinApi
        viewModelScope.launch {
            _uiState.emit(UiState.Normal())
        }
    }

    fun loginByPassword(server: String, username: String, password: String) {
        viewModelScope.launch {
            try {
                repository.loginByPassword(server, username, password)
                _uiState.emit(UiState.Logged)
            } catch (e: Exception) {
                _uiState.emit(UiState.Error(e))
            }
        }
    }

//    fun loginByPIN(server: String, secret: String) {
//        viewModelScope.launch {
//            try {
//                repository.loginByPIN(server = server, pin = secret)
//                _uiState.emit(UiState.Logged)
//            } catch (e: Exception) {
//                _uiState.emit(UiState.Error(e))
//            }
//        }
//    }
}


package presentation.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import presentation.icons.Icons
import presentation.icons.fluentIcon
import presentation.icons.fluentPath

public val Icons.Filled.TaskListLtr: ImageVector
    get() {
        if (_taskListLtr != null) {
            return _taskListLtr!!
        }
        _taskListLtr = fluentIcon(name = "Filled.TaskListLtr") {
            fluentPath {
                moveTo(6.7f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineTo(4.0f, 4.58f)
                lineToRelative(-0.3f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.42f)
                lineToRelative(1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(9.88f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.12f, 2.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(0.12f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, -2.0f)
                close()
                moveTo(21.0f, 11.0f)
                lineTo(9.88f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.12f, 2.0f)
                horizontalLineToRelative(11.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, -2.0f)
                close()
                moveTo(21.0f, 5.0f)
                lineTo(9.88f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 7.0f)
                horizontalLineToRelative(11.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 5.0f)
                close()
                moveTo(6.7f, 16.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineTo(4.0f, 17.58f)
                lineToRelative(-0.3f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.42f)
                lineToRelative(1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
                moveTo(5.3f, 9.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.4f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, -1.4f)
                lineToRelative(0.3f, 0.29f)
                lineToRelative(1.3f, -1.3f)
                close()
            }
        }
        return _taskListLtr!!
    }

private var _taskListLtr: ImageVector? = null

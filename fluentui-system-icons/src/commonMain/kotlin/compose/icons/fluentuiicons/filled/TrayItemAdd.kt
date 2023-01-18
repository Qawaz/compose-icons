package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.TrayItemAdd: ImageVector
    get() {
        if (_trayItemAdd != null) {
            return _trayItemAdd!!
        }
        _trayItemAdd = Builder(name = "TrayItemAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
                curveTo(13.0596f, 2.0f, 12.5f, 2.5596f, 12.5f, 3.25f)
                verticalLineTo(5.75f)
                curveTo(12.5f, 6.4404f, 13.0596f, 7.0f, 13.75f, 7.0f)
                horizontalLineTo(17.75f)
                curveTo(18.4404f, 7.0f, 19.0f, 6.4404f, 19.0f, 5.75f)
                verticalLineTo(3.25f)
                curveTo(19.0f, 2.5596f, 18.4404f, 2.0f, 17.75f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(16.5f, 9.25f)
                curveTo(16.5f, 8.8358f, 16.1642f, 8.5f, 15.75f, 8.5f)
                curveTo(15.3358f, 8.5f, 15.0f, 8.8358f, 15.0f, 9.25f)
                verticalLineTo(15.9393f)
                lineTo(13.7803f, 14.7197f)
                curveTo(13.4874f, 14.4268f, 13.0126f, 14.4268f, 12.7197f, 14.7197f)
                curveTo(12.4268f, 15.0126f, 12.4268f, 15.4874f, 12.7197f, 15.7803f)
                lineTo(15.2197f, 18.2803f)
                curveTo(15.5126f, 18.5732f, 15.9874f, 18.5732f, 16.2803f, 18.2803f)
                lineTo(18.7803f, 15.7803f)
                curveTo(19.0732f, 15.4874f, 19.0732f, 15.0126f, 18.7803f, 14.7197f)
                curveTo(18.4874f, 14.4268f, 18.0126f, 14.4268f, 17.7197f, 14.7197f)
                lineTo(16.5f, 15.9393f)
                verticalLineTo(9.25f)
                close()
                moveTo(6.25f, 13.5f)
                curveTo(5.5596f, 13.5f, 5.0f, 14.0596f, 5.0f, 14.75f)
                verticalLineTo(17.25f)
                curveTo(5.0f, 17.9404f, 5.5596f, 18.5f, 6.25f, 18.5f)
                horizontalLineTo(10.25f)
                curveTo(10.9404f, 18.5f, 11.5f, 17.9404f, 11.5f, 17.25f)
                verticalLineTo(14.75f)
                curveTo(11.5f, 14.0596f, 10.9404f, 13.5f, 10.25f, 13.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(3.5f, 16.75f)
                curveTo(3.5f, 16.3358f, 3.1642f, 16.0f, 2.75f, 16.0f)
                curveTo(2.3358f, 16.0f, 2.0f, 16.3358f, 2.0f, 16.75f)
                verticalLineTo(18.75f)
                curveTo(2.0f, 20.2688f, 3.2312f, 21.5f, 4.75f, 21.5f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 21.5f, 22.0f, 20.2688f, 22.0f, 18.75f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 16.3358f, 21.6642f, 16.0f, 21.25f, 16.0f)
                curveTo(20.8358f, 16.0f, 20.5f, 16.3358f, 20.5f, 16.75f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.4404f, 19.9404f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(4.0596f, 20.0f, 3.5f, 19.4404f, 3.5f, 18.75f)
                verticalLineTo(16.75f)
                close()
            }
        }
        .build()
        return _trayItemAdd!!
    }

private var _trayItemAdd: ImageVector? = null

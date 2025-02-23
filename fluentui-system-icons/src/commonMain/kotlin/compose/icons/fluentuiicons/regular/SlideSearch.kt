package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.SlideSearch: ImageVector
    get() {
        if (_slideSearch != null) {
            return _slideSearch!!
        }
        _slideSearch = Builder(name = "SlideSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 4.0f)
                curveTo(3.2312f, 4.0f, 2.0f, 5.2312f, 2.0f, 6.75f)
                verticalLineTo(11.2572f)
                curveTo(2.4463f, 10.8886f, 2.9518f, 10.589f, 3.5f, 10.3749f)
                verticalLineTo(6.75f)
                curveTo(3.5f, 6.0596f, 4.0596f, 5.5f, 4.75f, 5.5f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 5.5f, 20.5f, 6.0596f, 20.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(20.5f, 17.9404f, 19.9404f, 18.5f, 19.25f, 18.5f)
                horizontalLineTo(10.9749f)
                lineTo(12.4749f, 20.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 20.0f, 22.0f, 18.7688f, 22.0f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 5.2312f, 20.7688f, 4.0f, 19.25f, 4.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(8.6631f, 11.0f)
                curveTo(9.2355f, 11.4031f, 9.7276f, 11.9127f, 10.1105f, 12.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 12.5f, 18.0f, 12.1642f, 18.0f, 11.75f)
                curveTo(18.0f, 11.3358f, 17.6642f, 11.0f, 17.25f, 11.0f)
                horizontalLineTo(8.6631f)
                close()
                moveTo(15.25f, 15.5f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 14.98f, 10.9278f, 14.4768f, 10.793f, 14.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 14.0f, 16.0f, 14.3358f, 16.0f, 14.75f)
                curveTo(16.0f, 15.1642f, 15.6642f, 15.5f, 15.25f, 15.5f)
                close()
                moveTo(6.75f, 8.0f)
                curveTo(6.3358f, 8.0f, 6.0f, 8.3358f, 6.0f, 8.75f)
                curveTo(6.0f, 9.1642f, 6.3358f, 9.5f, 6.75f, 9.5f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 9.5f, 14.0f, 9.1642f, 14.0f, 8.75f)
                curveTo(14.0f, 8.3358f, 13.6642f, 8.0f, 13.25f, 8.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(5.5f, 20.0f)
                curveTo(6.4719f, 20.0f, 7.3718f, 19.6919f, 8.1074f, 19.1681f)
                lineTo(10.7197f, 21.7803f)
                curveTo(11.0126f, 22.0732f, 11.4874f, 22.0732f, 11.7803f, 21.7803f)
                curveTo(12.0732f, 21.4874f, 12.0732f, 21.0126f, 11.7803f, 20.7197f)
                lineTo(9.1681f, 18.1074f)
                curveTo(9.6919f, 17.3718f, 10.0f, 16.4719f, 10.0f, 15.5f)
                curveTo(10.0f, 13.0147f, 7.9853f, 11.0f, 5.5f, 11.0f)
                curveTo(3.0147f, 11.0f, 1.0f, 13.0147f, 1.0f, 15.5f)
                curveTo(1.0f, 17.9853f, 3.0147f, 20.0f, 5.5f, 20.0f)
                close()
                moveTo(5.5f, 18.5f)
                curveTo(3.8431f, 18.5f, 2.5f, 17.1569f, 2.5f, 15.5f)
                curveTo(2.5f, 13.8431f, 3.8431f, 12.5f, 5.5f, 12.5f)
                curveTo(7.1568f, 12.5f, 8.5f, 13.8431f, 8.5f, 15.5f)
                curveTo(8.5f, 17.1569f, 7.1568f, 18.5f, 5.5f, 18.5f)
                close()
            }
        }
        .build()
        return _slideSearch!!
    }

private var _slideSearch: ImageVector? = null

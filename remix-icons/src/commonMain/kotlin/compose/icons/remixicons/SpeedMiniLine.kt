package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SpeedMiniLine: ImageVector
    get() {
        if (_speedMiniLine != null) {
            return _speedMiniLine!!
        }
        _speedMiniLine = Builder(name = "SpeedMiniLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.032f, 12.0f)
                lineTo(6.0f, 9.86f)
                verticalLineToRelative(4.28f)
                lineTo(9.032f, 12.0f)
                close()
                moveTo(4.788f, 17.444f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 17.035f)
                lineTo(4.0f, 6.965f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.788f, -0.409f)
                lineToRelative(7.133f, 5.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.816f)
                lineToRelative(-7.133f, 5.036f)
                close()
                moveTo(15.0f, 14.14f)
                lineTo(18.032f, 12.0f)
                lineTo(15.0f, 9.86f)
                verticalLineToRelative(4.28f)
                close()
                moveTo(13.0f, 6.965f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.788f, -0.409f)
                lineToRelative(7.133f, 5.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.816f)
                lineToRelative(-7.133f, 5.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.788f, -0.409f)
                lineTo(13.0f, 6.965f)
                close()
            }
        }
        .build()
        return _speedMiniLine!!
    }

private var _speedMiniLine: ImageVector? = null

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

public val RemixIcons.ShutDownLine: ImageVector
    get() {
        if (_shutDownLine != null) {
            return _shutDownLine!!
        }
        _shutDownLine = Builder(name = "ShutDownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.265f, 3.807f)
                lineToRelative(1.147f, 1.639f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.176f, 0.0f)
                lineToRelative(1.147f, -1.639f)
                arcTo(9.988f, 9.988f, 0.0f, false, true, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                arcToRelative(9.988f, 9.988f, 0.0f, false, true, 4.265f, -8.193f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _shutDownLine!!
    }

private var _shutDownLine: ImageVector? = null

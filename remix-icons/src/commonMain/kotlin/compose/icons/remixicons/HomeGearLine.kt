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

public val RemixIcons.HomeGearLine: ImageVector
    get() {
        if (_homeGearLine != null) {
            return _homeGearLine!!
        }
        _homeGearLine = Builder(name = "HomeGearLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                lineTo(1.0f, 11.0f)
                lineToRelative(10.327f, -9.388f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.346f, 0.0f)
                lineTo(23.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 9.157f)
                lineToRelative(-6.0f, -5.454f)
                lineToRelative(-6.0f, 5.454f)
                lineTo(6.0f, 19.0f)
                close()
                moveTo(8.591f, 13.809f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, true, 0.0f, -1.622f)
                lineToRelative(-0.991f, -0.572f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(0.991f, 0.573f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, true, 1.404f, -0.812f)
                lineTo(10.995f, 8.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.144f)
                curveToRelative(0.532f, 0.159f, 1.01f, 0.44f, 1.404f, 0.812f)
                lineToRelative(0.991f, -0.573f)
                lineToRelative(1.0f, 1.731f)
                lineToRelative(-0.991f, 0.573f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, true, 0.0f, 1.622f)
                lineToRelative(0.991f, 0.572f)
                lineToRelative(-1.0f, 1.731f)
                lineToRelative(-0.991f, -0.572f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, true, -1.404f, 0.811f)
                verticalLineToRelative(1.145f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.995f, 16.35f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, true, -1.404f, -0.811f)
                lineToRelative(-0.991f, 0.572f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(0.991f, -0.573f)
                close()
                moveTo(11.995f, 14.497f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -2.998f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 2.998f)
                close()
            }
        }
        .build()
        return _homeGearLine!!
    }

private var _homeGearLine: ImageVector? = null

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

public val RemixIcons.MindMap: ImageVector
    get() {
        if (_mindMap != null) {
            return _mindMap!!
        }
        _mindMap = Builder(name = "MindMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.306f, 0.0f, -2.417f, -0.834f, -2.829f, -2.0f)
                lineTo(11.0f, 7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(0.171f)
                curveToRelative(1.166f, 0.412f, 2.0f, 1.523f, 2.0f, 2.829f)
                curveToRelative(0.0f, 1.306f, -0.834f, 2.417f, -2.0f, 2.829f)
                lineTo(9.0f, 15.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.17f)
                curveToRelative(0.412f, -1.165f, 1.524f, -2.0f, 2.83f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.306f, 0.0f, -2.417f, -0.834f, -2.829f, -2.0f)
                lineTo(11.0f, 19.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                lineTo(5.0f, 15.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(1.17f)
                curveToRelative(0.412f, -1.165f, 1.524f, -2.0f, 2.83f, -2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(8.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(18.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _mindMap!!
    }

private var _mindMap: ImageVector? = null

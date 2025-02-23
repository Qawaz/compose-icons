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

public val RemixIcons.BubbleChartLine: ImageVector
    get() {
        if (_bubbleChartLine != null) {
            return _bubbleChartLine!!
        }
        _bubbleChartLine = Builder(name = "BubbleChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(6.0f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.5f, 2.0f)
                curveTo(17.538f, 2.0f, 20.0f, 4.462f, 20.0f, 7.5f)
                reflectiveCurveTo(17.538f, 13.0f, 14.5f, 13.0f)
                reflectiveCurveTo(9.0f, 10.538f, 9.0f, 7.5f)
                reflectiveCurveTo(11.462f, 2.0f, 14.5f, 2.0f)
                close()
                moveTo(14.5f, 4.0f)
                curveTo(12.567f, 4.0f, 11.0f, 5.567f, 11.0f, 7.5f)
                reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveTo(18.0f, 9.433f, 18.0f, 7.5f)
                reflectiveCurveTo(16.433f, 4.0f, 14.5f, 4.0f)
                close()
            }
        }
        .build()
        return _bubbleChartLine!!
    }

private var _bubbleChartLine: ImageVector? = null

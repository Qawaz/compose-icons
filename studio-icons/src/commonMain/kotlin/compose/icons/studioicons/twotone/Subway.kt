package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.67f, 18.5f)
                lineTo(9.17f, 20.0f)
                horizontalLineToRelative(5.66f)
                lineToRelative(-1.5f, -1.5f)
                close()
                moveTo(17.07f, 4.66f)
                curveTo(15.59f, 4.08f, 13.68f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-3.59f, 0.08f, -5.07f, 0.66f)
                curveTo(5.01f, 5.41f, 4.0f, 6.86f, 4.0f, 8.86f)
                lineTo(4.0f, 20.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.38f)
                lineToRelative(1.15f, -1.16f)
                curveTo(7.16f, 18.29f, 6.0f, 17.04f, 6.0f, 15.5f)
                lineTo(6.0f, 9.0f)
                curveToRelative(0.0f, -2.63f, 3.0f, -3.0f, 6.0f, -3.0f)
                reflectiveCurveToRelative(6.0f, 0.37f, 6.0f, 3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.54f, -1.16f, 2.79f, -2.65f, 2.96f)
                lineToRelative(1.15f, 1.16f)
                lineTo(16.5f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(20.0f, 8.86f)
                curveToRelative(0.0f, -2.0f, -1.01f, -3.45f, -2.93f, -4.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8f, 2.8f)
                curveTo(16.0f, 2.09f, 13.86f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-4.0f, 0.09f, -5.8f, 0.8f)
                curveTo(3.53f, 3.84f, 2.0f, 6.05f, 2.0f, 8.86f)
                lineTo(2.0f, 22.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 8.86f)
                curveToRelative(0.0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f)
                close()
                moveTo(9.17f, 20.0f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(2.66f)
                lineToRelative(1.5f, 1.5f)
                lineTo(9.17f, 20.0f)
                close()
                moveTo(7.01f, 14.0f)
                lineTo(7.01f, 9.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(16.5f, 16.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(8.5f, 15.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-0.38f)
                lineToRelative(-1.15f, -1.16f)
                curveToRelative(1.49f, -0.17f, 2.65f, -1.42f, 2.65f, -2.96f)
                lineTo(18.0f, 9.0f)
                curveToRelative(0.0f, -2.63f, -3.0f, -3.0f, -6.0f, -3.0f)
                reflectiveCurveToRelative(-6.0f, 0.37f, -6.0f, 3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.54f, 1.16f, 2.79f, 2.65f, 2.96f)
                lineTo(7.5f, 19.62f)
                lineTo(7.5f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 8.86f)
                curveToRelative(0.0f, -2.0f, 1.01f, -3.45f, 2.93f, -4.2f)
                curveTo(8.41f, 4.08f, 10.32f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(3.59f, 0.08f, 5.07f, 0.66f)
                curveToRelative(1.92f, 0.75f, 2.93f, 2.2f, 2.93f, 4.2f)
                lineTo(20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null

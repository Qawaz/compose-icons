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

public val TwotoneGroup.DeviceUnknown: ImageVector
    get() {
        if (_deviceUnknown != null) {
            return _deviceUnknown!!
        }
        _deviceUnknown = Builder(name = "DeviceUnknown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 6.72f)
                curveToRelative(1.96f, 0.0f, 3.5f, 1.51f, 3.5f, 3.47f)
                curveToRelative(0.0f, 2.26f, -2.62f, 2.49f, -2.62f, 4.45f)
                horizontalLineToRelative(-1.76f)
                curveToRelative(0.0f, -2.88f, 2.63f, -2.7f, 2.63f, -4.45f)
                curveToRelative(0.0f, -0.93f, -0.82f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.82f, -1.75f, 1.75f)
                lineTo(8.5f, 10.19f)
                curveToRelative(0.0f, -1.95f, 1.54f, -3.47f, 3.5f, -3.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 1.0f)
                lineTo(7.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(19.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 8.44f)
                curveToRelative(0.93f, 0.0f, 1.75f, 0.82f, 1.75f, 1.75f)
                curveToRelative(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f)
                curveToRelative(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f)
                reflectiveCurveToRelative(-3.5f, 1.52f, -3.5f, 3.47f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f)
                close()
            }
        }
        .build()
        return _deviceUnknown!!
    }

private var _deviceUnknown: ImageVector? = null

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

public val RemixIcons.UsbLine: ImageVector
    get() {
        if (_usbLine != null) {
            return _usbLine!!
        }
        _usbLine = Builder(name = "UsbLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineToRelative(3.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.381f)
                lineToRelative(3.0f, -1.499f)
                lineToRelative(-0.001f, -0.882f)
                lineTo(15.0f, 11.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.001f)
                lineTo(18.0f, 13.118f)
                lineToRelative(-5.0f, 2.5f)
                verticalLineToRelative(1.553f)
                curveToRelative(1.166f, 0.412f, 2.0f, 1.523f, 2.0f, 2.829f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.187f, 0.69f, -2.213f, 1.69f, -2.7f)
                lineTo(6.0f, 14.0f)
                lineToRelative(-0.001f, -2.268f)
                curveTo(5.402f, 11.386f, 5.0f, 10.74f, 5.0f, 10.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.74f, -0.402f, 1.387f, -1.0f, 1.732f)
                lineTo(8.0f, 13.0f)
                lineToRelative(3.0f, 2.086f)
                lineTo(11.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineToRelative(3.0f, -5.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _usbLine!!
    }

private var _usbLine: ImageVector? = null

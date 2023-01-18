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

public val RemixIcons.SecurePaymentLine: ImageVector
    get() {
        if (_securePaymentLine != null) {
            return _securePaymentLine!!
        }
        _securePaymentLine = Builder(name = "SecurePaymentLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                lineToRelative(7.298f, 2.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.702f, 0.955f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineToRelative(-3.22f, 0.001f)
                curveToRelative(-0.387f, 0.51f, -0.857f, 0.96f, -1.4f, 1.33f)
                lineTo(11.0f, 22.0f)
                lineToRelative(-5.38f, -3.668f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 3.0f, 13.374f)
                lineTo(3.0f, 5.235f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.702f, -0.954f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(11.0f, 4.094f)
                lineTo(5.0f, 5.97f)
                verticalLineToRelative(7.404f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.558f, 3.169f)
                lineToRelative(0.189f, 0.136f)
                lineTo(11.0f, 19.58f)
                lineTo(14.782f, 17.0f)
                lineTo(10.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                lineTo(17.0f, 5.97f)
                lineToRelative(-6.0f, -1.876f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(9.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _securePaymentLine!!
    }

private var _securePaymentLine: ImageVector? = null

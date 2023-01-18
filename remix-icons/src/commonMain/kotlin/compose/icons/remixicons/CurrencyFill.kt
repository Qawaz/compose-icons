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

public val RemixIcons.CurrencyFill: ImageVector
    get() {
        if (_currencyFill != null) {
            return _currencyFill!!
        }
        _currencyFill = Builder(name = "CurrencyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(17.0f, 18.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.45f, 1.0f, -1.007f, 1.0f)
                lineTo(4.007f, 22.0f)
                arcTo(1.001f, 1.001f, 0.0f, false, true, 3.0f, 21.0f)
                lineToRelative(0.003f, -14.0f)
                curveToRelative(0.0f, -0.552f, 0.45f, -1.0f, 1.007f, -1.0f)
                lineTo(7.0f, 6.0f)
                lineTo(7.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(7.0f, 16.0f)
                close()
            }
        }
        .build()
        return _currencyFill!!
    }

private var _currencyFill: ImageVector? = null

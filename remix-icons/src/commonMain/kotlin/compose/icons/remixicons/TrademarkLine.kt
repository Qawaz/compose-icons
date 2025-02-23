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

public val RemixIcons.TrademarkLine: ImageVector
    get() {
        if (_trademarkLine != null) {
            return _trademarkLine!!
        }
        _trademarkLine = Builder(name = "TrademarkLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(10.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(12.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(3.0f, 5.196f)
                lineTo(20.5f, 6.0f)
                lineTo(23.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 9.133f)
                lineToRelative(-3.5f, 6.063f)
                lineTo(14.0f, 9.135f)
                lineTo(14.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _trademarkLine!!
    }

private var _trademarkLine: ImageVector? = null

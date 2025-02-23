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

public val RemixIcons.PriceTag2Fill: ImageVector
    get() {
        if (_priceTag2Fill != null) {
            return _priceTag2Fill!!
        }
        _priceTag2Fill = Builder(name = "PriceTag2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                lineToRelative(8.445f, -5.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, 0.0f)
                lineTo(21.0f, 7.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 7.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 16.0f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _priceTag2Fill!!
    }

private var _priceTag2Fill: ImageVector? = null

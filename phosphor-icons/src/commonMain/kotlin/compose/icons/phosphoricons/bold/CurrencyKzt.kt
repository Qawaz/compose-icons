package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) {
            return _currencyKzt!!
        }
        _currencyKzt = Builder(name = "CurrencyKzt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(112.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(200.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 100.0f)
                close()
                moveTo(56.0f, 64.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
            }
        }
        .build()
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null

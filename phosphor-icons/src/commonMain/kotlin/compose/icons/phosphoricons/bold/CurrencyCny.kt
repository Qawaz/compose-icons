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

public val BoldGroup.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) {
            return _currencyCny!!
        }
        _currencyCny = Builder(name = "CurrencyCny", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 52.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 52.0f, 64.0f)
                close()
                moveTo(216.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(92.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, 76.0f, -76.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 164.0f)
                close()
            }
        }
        .build()
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null

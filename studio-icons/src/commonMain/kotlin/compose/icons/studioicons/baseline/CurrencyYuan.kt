package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CurrencyYuan: ImageVector
    get() {
        if (_currencyYuan != null) {
            return _currencyYuan!!
        }
        _currencyYuan = Builder(name = "CurrencyYuan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.28f, 12.0f)
                lineToRelative(4.72f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 7.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -7.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(4.72f, 0.0f)
                lineToRelative(-5.72f, -9.0f)
                lineToRelative(2.37f, 0.0f)
                lineToRelative(4.63f, 7.29f)
                lineToRelative(4.63f, -7.29f)
                lineToRelative(2.37f, 0.0f)
                close()
            }
        }
        .build()
        return _currencyYuan!!
    }

private var _currencyYuan: ImageVector? = null

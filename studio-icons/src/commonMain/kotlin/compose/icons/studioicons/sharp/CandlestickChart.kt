package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CandlestickChart: ImageVector
    get() {
        if (_candlestickChart != null) {
            return _candlestickChart!!
        }
        _candlestickChart = Builder(name = "CandlestickChart", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 12.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 7.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _candlestickChart!!
    }

private var _candlestickChart: ImageVector? = null

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

public val BoldGroup.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) {
            return _numberSeven!!
        }
        _numberSeven = Builder(name = "NumberSeven", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.4f, 43.8f)
                lineToRelative(-64.0f, 192.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 112.0f, 244.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -3.8f, -0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.6f, -15.2f)
                lineTo(159.4f, 52.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 11.4f, 15.8f)
                close()
            }
        }
        .build()
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null

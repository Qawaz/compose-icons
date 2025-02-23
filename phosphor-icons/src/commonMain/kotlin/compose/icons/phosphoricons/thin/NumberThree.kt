package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.NumberThree: ImageVector
    get() {
        if (_numberThree != null) {
            return _numberThree!!
        }
        _numberThree = Builder(name = "NumberThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 168.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 77.6f, 210.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 120.0f, 116.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -3.5f, -2.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.2f, -4.2f)
                lineTo(168.3f, 36.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 3.5f, 2.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.2f, 4.1f)
                lineToRelative(-51.9f, 74.2f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 180.0f, 168.0f)
                close()
            }
        }
        .build()
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null

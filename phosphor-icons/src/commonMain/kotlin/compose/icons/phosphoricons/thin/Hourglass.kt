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

public val ThinGroup.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 75.6f)
                lineTo(196.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(72.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 40.0f)
                lineTo(60.0f, 76.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 4.8f, 9.6f)
                lineTo(121.3f, 128.0f)
                lineTo(64.8f, 170.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 60.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(184.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(196.0f, 180.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -4.8f, -9.6f)
                lineTo(134.6f, 128.0f)
                lineToRelative(56.6f, -42.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 196.0f, 75.6f)
                close()
                moveTo(188.0f, 180.4f)
                lineTo(188.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(68.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, -3.2f)
                lineTo(128.0f, 133.0f)
                lineToRelative(58.4f, 44.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 188.0f, 180.4f)
                close()
                moveTo(188.0f, 75.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.6f, 3.2f)
                lineTo(128.0f, 123.0f)
                lineTo(69.6f, 79.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 68.0f, 76.0f)
                lineTo(68.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(184.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null

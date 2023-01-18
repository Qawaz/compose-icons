package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.8f, 160.2f)
                lineToRelative(-1.1f, 1.6f)
                arcTo(72.2f, 72.2f, 0.0f, false, true, 55.1f, 192.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(55.1f, 176.0f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, false, 45.5f, -23.5f)
                lineToRelative(1.2f, -1.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.0f, 9.3f)
                close()
                moveTo(143.0f, 107.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.2f, -1.9f)
                lineToRelative(1.2f, -1.6f)
                arcTo(55.9f, 55.9f, 0.0f, false, true, 200.0f, 80.0f)
                lineTo(200.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.9f, 7.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, 0.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, -1.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 48.0f)
                lineTo(200.0f, 64.0f)
                arcToRelative(72.2f, 72.2f, 0.0f, false, false, -57.7f, 30.2f)
                lineToRelative(-1.1f, 1.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 143.0f, 107.0f)
                close()
                moveTo(213.7f, 154.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, -1.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(55.9f, 55.9f, 0.0f, false, true, -44.6f, -23.5f)
                lineTo(113.7f, 94.2f)
                arcTo(72.2f, 72.2f, 0.0f, false, false, 55.1f, 64.0f)
                lineTo(32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(55.1f, 80.0f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, 45.5f, 23.5f)
                lineToRelative(41.7f, 58.3f)
                arcTo(72.2f, 72.2f, 0.0f, false, false, 200.0f, 192.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.9f, 7.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, 0.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null

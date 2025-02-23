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

public val FillGroup.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 128.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 96.0f, 56.0f)
                horizontalLineToRelative(96.0f)
                lineTo(192.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.9f, -7.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 8.8f, 1.7f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(8.3f, 8.3f, 0.0f, false, true, 200.0f, 96.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.1f, -0.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 88.0f)
                lineTo(192.0f, 72.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(224.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, 56.0f)
                lineTo(64.0f, 184.0f)
                lineTo(64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.9f, -7.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, 1.7f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                lineToRelative(24.0f, 24.0f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 56.0f, 224.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, -0.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 216.0f)
                lineTo(64.0f, 200.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, 72.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 120.0f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null

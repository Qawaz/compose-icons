package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Playlist: ImageVector
    get() {
        if (_playlist != null) {
            return _playlist!!
        }
        _playlist = Builder(name = "Playlist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(216.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 64.0f)
                close()
                moveTo(40.0f, 136.0f)
                lineTo(160.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(112.0f, 184.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(247.7f, 126.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -10.0f, 5.4f)
                lineTo(208.0f, 122.8f)
                lineTo(208.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -16.0f, -27.7f)
                lineTo(192.0f, 112.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 3.2f, -6.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 7.1f, -1.3f)
                lineToRelative(40.0f, 12.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 247.7f, 126.3f)
                close()
                moveTo(192.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 192.0f)
                close()
            }
        }
        .build()
        return _playlist!!
    }

private var _playlist: ImageVector? = null

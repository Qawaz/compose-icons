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

public val FillGroup.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) {
            return _bookmarks!!
        }
        _bookmarks = Builder(name = "Bookmarks", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 24.0f)
                lineTo(96.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 40.0f)
                lineTo(80.0f, 56.0f)
                lineTo(64.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 72.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.7f, -1.5f)
                lineTo(112.0f, 193.8f)
                lineToRelative(51.4f, 36.7f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 8.3f, 0.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 176.0f, 224.0f)
                lineTo(176.0f, 184.7f)
                lineToRelative(19.4f, 13.8f)
                arcTo(7.7f, 7.7f, 0.0f, false, false, 200.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(208.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 24.0f)
                close()
                moveTo(192.0f, 176.5f)
                lineTo(176.0f, 165.0f)
                lineTo(176.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(96.0f, 56.0f)
                lineTo(96.0f, 40.0f)
                horizontalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null

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

public val RegularGroup.ArchiveBox: ImageVector
    get() {
        if (_archiveBox != null) {
            return _archiveBox!!
        }
        _archiveBox = Builder(name = "ArchiveBox", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.2f, 68.4f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 200.0f, 32.0f)
                lineTo(56.0f, 32.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.2f, 4.4f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 32.0f, 72.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 72.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 223.2f, 68.4f)
                close()
                moveTo(60.9f, 48.0f)
                lineTo(195.1f, 48.0f)
                lineToRelative(8.0f, 16.0f)
                lineTo(52.9f, 64.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 80.0f)
                lineTo(208.0f, 80.0f)
                lineTo(208.0f, 208.0f)
                close()
                moveTo(167.6f, 144.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                lineToRelative(-33.9f, 34.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-33.9f, -34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.3f)
                lineTo(120.0f, 164.7f)
                lineTo(120.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(60.7f)
                lineToRelative(20.3f, -20.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 167.6f, 144.4f)
                close()
            }
        }
        .build()
        return _archiveBox!!
    }

private var _archiveBox: ImageVector? = null

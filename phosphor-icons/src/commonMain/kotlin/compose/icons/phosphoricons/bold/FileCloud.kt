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

public val BoldGroup.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.5f, 79.5f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                lineTo(180.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 216.5f, 79.5f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(160.0f, 80.0f)
                close()
                moveTo(108.0f, 124.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -50.6f, 32.1f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 60.0f, 236.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -112.0f)
                close()
                moveTo(108.0f, 212.0f)
                lineTo(60.0f, 212.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -7.8f, -30.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 180.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null

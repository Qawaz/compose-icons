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

public val FillGroup.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.7f, 82.3f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                lineTo(200.0f, 216.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 213.7f, 82.3f)
                close()
                moveTo(160.0f, 80.0f)
                lineTo(160.0f, 51.3f)
                lineTo(188.7f, 80.0f)
                close()
                moveTo(158.7f, 219.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 0.4f, 8.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 232.0f)
                lineTo(24.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.0f, -4.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.3f, -8.1f)
                lineToRelative(32.6f, -50.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.2f, 0.0f)
                lineToRelative(6.4f, 10.0f)
                lineTo(94.0f, 152.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null

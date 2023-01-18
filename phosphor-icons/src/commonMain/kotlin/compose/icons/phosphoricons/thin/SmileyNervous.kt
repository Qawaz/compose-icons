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

public val ThinGroup.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) {
            return _smileyNervous!!
        }
        _smileyNervous = Builder(name = "SmileyNervous", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(179.1f, 169.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.6f, 5.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.5f, 0.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.1f, -1.5f)
                lineTo(160.0f, 158.4f)
                lineToRelative(-12.9f, 16.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.2f, 0.0f)
                lineTo(128.0f, 158.4f)
                lineToRelative(-12.9f, 16.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.2f, 0.0f)
                lineTo(96.0f, 158.4f)
                lineTo(83.1f, 174.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.2f, -5.0f)
                lineToRelative(16.0f, -20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.2f, 0.0f)
                lineTo(112.0f, 165.6f)
                lineToRelative(12.9f, -16.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.2f, 0.0f)
                lineTo(144.0f, 165.6f)
                lineToRelative(12.9f, -16.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.2f, 0.0f)
                close()
                moveTo(84.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 84.0f, 108.0f)
                close()
                moveTo(156.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 108.0f)
                close()
            }
        }
        .build()
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null

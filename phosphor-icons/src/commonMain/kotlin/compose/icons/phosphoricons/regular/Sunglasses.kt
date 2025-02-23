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

public val RegularGroup.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(60.0f)
                lineTo(40.0f, 132.0f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 24.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                lineTo(112.0f, 148.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                lineTo(232.0f, 72.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(213.9f, 174.6f)
                lineTo(187.3f, 148.0f)
                lineTo(216.0f, 148.0f)
                verticalLineToRelative(16.0f)
                arcTo(27.1f, 27.1f, 0.0f, false, true, 213.9f, 174.6f)
                close()
                moveTo(40.0f, 164.0f)
                lineTo(40.0f, 148.0f)
                horizontalLineToRelative(4.7f)
                lineToRelative(39.1f, 39.1f)
                arcTo(27.6f, 27.6f, 0.0f, false, true, 68.0f, 192.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 40.0f, 164.0f)
                close()
                moveTo(96.0f, 164.0f)
                arcToRelative(27.1f, 27.1f, 0.0f, false, true, -2.1f, 10.6f)
                lineTo(67.3f, 148.0f)
                lineTo(96.0f, 148.0f)
                close()
                moveTo(160.0f, 164.0f)
                lineTo(160.0f, 148.0f)
                horizontalLineToRelative(4.7f)
                lineToRelative(39.1f, 39.1f)
                arcTo(27.6f, 27.6f, 0.0f, false, true, 188.0f, 192.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 160.0f, 164.0f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null

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

public val BoldGroup.Barbell: ImageVector
    get() {
        if (_barbell != null) {
            return _barbell!!
        }
        _barbell = Builder(name = "Barbell", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 116.0f)
                lineTo(244.0f, 88.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(208.0f, 68.0f)
                lineTo(208.0f, 64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(164.0f, 44.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(52.0f)
                lineTo(112.0f, 116.0f)
                lineTo(112.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 92.0f, 44.0f)
                lineTo(68.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 48.0f, 64.0f)
                verticalLineToRelative(4.0f)
                lineTo(32.0f, 68.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 12.0f, 88.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(48.0f, 188.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(92.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(112.0f, 140.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(36.0f, 164.0f)
                lineTo(36.0f, 92.0f)
                lineTo(48.0f, 92.0f)
                verticalLineToRelative(72.0f)
                close()
                moveTo(88.0f, 188.0f)
                lineTo(72.0f, 188.0f)
                lineTo(72.0f, 68.0f)
                lineTo(88.0f, 68.0f)
                close()
                moveTo(184.0f, 188.0f)
                lineTo(168.0f, 188.0f)
                lineTo(168.0f, 68.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(220.0f, 164.0f)
                lineTo(208.0f, 164.0f)
                lineTo(208.0f, 92.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _barbell!!
    }

private var _barbell: ImageVector? = null

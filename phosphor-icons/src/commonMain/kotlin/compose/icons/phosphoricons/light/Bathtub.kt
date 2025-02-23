package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Bathtub: ImageVector
    get() {
        if (_bathtub != null) {
            return _bathtub!!
        }
        _bathtub = Builder(name = "Bathtub", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 98.0f)
                lineTo(206.0f, 98.0f)
                lineTo(206.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(136.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(62.0f, 98.0f)
                lineTo(62.0f, 52.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                lineTo(50.0f, 98.0f)
                lineTo(24.0f, 98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 54.0f, 54.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(78.0f, 198.0f)
                lineTo(178.0f, 198.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(190.0f, 198.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 54.0f, -54.0f)
                lineTo(246.0f, 112.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 98.0f)
                close()
                moveTo(142.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(36.0f)
                lineTo(142.0f, 138.0f)
                close()
                moveTo(234.0f, 144.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                lineTo(64.0f, 186.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, -42.0f)
                lineTo(22.0f, 112.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(130.0f, 110.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(206.0f, 110.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null

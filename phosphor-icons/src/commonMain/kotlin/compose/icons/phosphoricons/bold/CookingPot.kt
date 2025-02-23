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

public val BoldGroup.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) {
            return _cookingPot!!
        }
        _cookingPot = Builder(name = "CookingPot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 40.0f)
                lineTo(76.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(100.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(128.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(140.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 52.0f)
                close()
                moveTo(168.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(180.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(156.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 52.0f)
                close()
                moveTo(251.2f, 105.6f)
                lineTo(224.0f, 126.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineTo(68.0f, 220.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(32.0f, 126.0f)
                lineTo(4.8f, 105.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 19.2f, 86.4f)
                lineTo(32.0f, 96.0f)
                lineTo(32.0f, 88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 52.0f, 68.0f)
                lineTo(204.0f, 68.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(12.8f, -9.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.4f, 19.2f)
                close()
                moveTo(200.0f, 92.0f)
                lineTo(56.0f, 92.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(188.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null

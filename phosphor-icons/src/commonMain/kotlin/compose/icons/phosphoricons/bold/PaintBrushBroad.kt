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

public val BoldGroup.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) {
            return _paintBrushBroad!!
        }
        _paintBrushBroad = Builder(name = "PaintBrushBroad", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 28.0f, 64.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(95.1f, 164.0f)
                lineTo(92.0f, 207.1f)
                verticalLineToRelative(0.9f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                verticalLineToRelative(-0.9f)
                lineTo(160.9f, 164.0f)
                lineTo(200.0f, 164.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(228.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 20.0f)
                close()
                moveTo(72.0f, 44.0f)
                horizontalLineToRelative(92.0f)
                lineTo(164.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(188.0f, 44.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(56.0f)
                lineTo(52.0f, 100.0f)
                lineTo(52.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 72.0f, 44.0f)
                close()
                moveTo(200.0f, 140.0f)
                lineTo(156.6f, 140.0f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, -20.0f, 21.4f)
                lineToRelative(3.4f, 47.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineToRelative(3.4f, -47.0f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, -20.0f, -21.4f)
                lineTo(56.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 124.0f)
                lineTo(204.0f, 124.0f)
                verticalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 140.0f)
                close()
            }
        }
        .build()
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null

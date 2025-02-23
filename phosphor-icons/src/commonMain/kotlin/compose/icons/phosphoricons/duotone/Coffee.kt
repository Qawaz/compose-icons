package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(83.3f, 216.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 32.0f, 136.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -51.3f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 56.0f)
                lineTo(80.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(128.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(112.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 64.0f)
                close()
                moveTo(152.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(160.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(144.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 64.0f)
                close()
                moveTo(248.0f, 120.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -37.5f, 39.9f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, true, -27.0f, 40.1f)
                lineTo(208.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(32.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(56.5f, 208.0f)
                arcTo(96.4f, 96.4f, 0.0f, false, true, 24.0f, 136.0f)
                lineTo(24.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(208.0f, 80.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 120.0f)
                close()
                moveTo(196.8f, 158.1f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 0.2f, -0.6f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, false, 3.0f, -21.5f)
                lineTo(200.0f, 96.0f)
                lineTo(40.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(80.3f, 80.3f, 0.0f, false, false, 45.1f, 72.0f)
                horizontalLineToRelative(69.8f)
                arcTo(80.3f, 80.3f, 0.0f, false, false, 196.8f, 158.1f)
                close()
                moveTo(232.0f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -16.0f, -22.6f)
                lineTo(216.0f, 136.0f)
                arcToRelative(92.9f, 92.9f, 0.0f, false, true, -1.2f, 15.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null

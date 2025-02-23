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

public val DuotoneGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 56.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.5f, 72.0f)
                curveTo(87.8f, 183.7f, 56.0f, 150.8f, 56.0f, 111.1f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 64.0f)
                lineTo(208.0f, 64.0f)
                lineTo(208.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(64.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 56.0f)
                verticalLineToRelative(8.0f)
                lineTo(23.9f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(7.9f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(9.7f, 29.9f, 36.2f, 52.3f, 68.1f, 55.6f)
                lineTo(120.0f, 216.0f)
                lineTo(96.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 216.0f)
                lineTo(136.0f, 191.6f)
                arcTo(79.7f, 79.7f, 0.0f, false, false, 204.3f, 136.0f)
                lineTo(208.0f, 136.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(248.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 64.0f)
                close()
                moveTo(47.9f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(23.9f, 80.0f)
                lineTo(48.0f, 80.0f)
                verticalLineToRelative(31.1f)
                arcToRelative(86.9f, 86.9f, 0.0f, false, false, 0.5f, 8.9f)
                close()
                moveTo(173.1f, 157.4f)
                arcTo(63.6f, 63.6f, 0.0f, false, true, 128.0f, 176.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-35.0f, -0.3f, -63.5f, -29.4f, -63.5f, -64.9f)
                lineTo(64.0f, 56.0f)
                lineTo(192.0f, 56.0f)
                verticalLineToRelative(56.0f)
                arcTo(63.4f, 63.4f, 0.0f, false, true, 173.1f, 157.4f)
                close()
                moveTo(232.0f, 96.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, false, 0.4f, -8.0f)
                lineTo(208.0f, 80.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null

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

public val DuotoneGroup.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) {
            return _thermometerSimple!!
        }
        _thermometerSimple = Builder(name = "ThermometerSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 147.0f)
                horizontalLineToRelative(0.0f)
                lineTo(160.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(99.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 143.3f)
                lineTo(168.0f, 48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                verticalLineToRelative(95.3f)
                arcTo(59.4f, 59.4f, 0.0f, false, false, 68.0f, 188.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 120.0f, 0.0f)
                arcTo(59.4f, 59.4f, 0.0f, false, false, 168.0f, 143.3f)
                close()
                moveTo(128.0f, 232.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, -44.0f)
                arcToRelative(43.5f, 43.5f, 0.0f, false, true, 16.6f, -34.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 104.0f, 147.0f)
                lineTo(104.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineToRelative(99.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 3.3f, 6.5f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 232.0f)
                close()
                moveTo(136.0f, 161.2f)
                lineTo(136.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(73.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null

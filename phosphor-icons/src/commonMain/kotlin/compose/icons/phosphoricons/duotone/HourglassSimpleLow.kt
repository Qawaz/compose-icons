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

public val DuotoneGroup.HourglassSimpleLow: ImageVector
    get() {
        if (_hourglassSimpleLow != null) {
            return _hourglassSimpleLow!!
        }
        _hourglassSimpleLow = Builder(name = "HourglassSimpleLow", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(53.7f, 202.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 59.3f, 216.0f)
                horizontalLineTo(196.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, -13.7f)
                lineTo(176.0f, 176.0f)
                horizontalLineTo(80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.3f, 128.0f)
                lineTo(208.0f, 59.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.7f, 32.0f)
                lineTo(59.3f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 59.3f)
                lineTo(116.7f, 128.0f)
                lineTo(48.0f, 196.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 59.3f, 224.0f)
                lineTo(196.7f, 224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 196.7f)
                close()
                moveTo(59.3f, 48.0f)
                lineTo(196.7f, 48.0f)
                lineTo(128.0f, 116.7f)
                close()
                moveTo(128.0f, 139.3f)
                lineTo(156.7f, 168.0f)
                lineTo(99.3f, 168.0f)
                close()
                moveTo(59.3f, 208.0f)
                lineToRelative(24.0f, -24.0f)
                horizontalLineToRelative(89.4f)
                lineToRelative(24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _hourglassSimpleLow!!
    }

private var _hourglassSimpleLow: ImageVector? = null

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

public val DuotoneGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 52.0f)
                verticalLineTo(36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineTo(68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f)
                curveToRelative(-44.2f, 0.0f, -64.0f, -24.0f, -96.6f, -92.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.7f, -20.0f)
                lineToRelative(21.9f, 38.0f)
                verticalLineTo(52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 40.0f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, false, -12.0f, 2.7f)
                lineTo(176.0f, 36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -54.6f, -8.6f)
                arcTo(27.8f, 27.8f, 0.0f, false, false, 108.0f, 24.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 80.0f, 52.0f)
                verticalLineToRelative(75.4f)
                lineToRelative(-7.0f, -12.1f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 24.3f, 143.0f)
                curveToRelative(32.5f, 68.4f, 54.1f, 97.0f, 103.7f, 97.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f)
                lineTo(216.0f, 68.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 188.0f, 40.0f)
                close()
                moveTo(200.0f, 152.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, 72.0f)
                curveToRelative(-20.2f, 0.0f, -34.2f, -5.5f, -47.0f, -18.2f)
                reflectiveCurveTo(56.3f, 173.0f, 38.7f, 135.9f)
                lineToRelative(-0.3f, -0.6f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -1.2f, -9.1f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 5.6f, -7.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.1f, -1.2f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 7.2f, 5.6f)
                lineToRelative(22.0f, 38.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 9.0f, 3.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.9f, -7.7f)
                lineTo(96.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(176.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null

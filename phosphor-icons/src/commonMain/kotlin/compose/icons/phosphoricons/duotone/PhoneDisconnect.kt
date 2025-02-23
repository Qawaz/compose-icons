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

public val DuotoneGroup.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) {
            return _phoneDisconnect!!
        }
        _phoneDisconnect = Builder(name = "PhoneDisconnect", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(155.4f, 101.3f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, false, -55.1f, 0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.2f, 5.9f)
                lineToRelative(-5.8f, 29.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -4.9f, 5.9f)
                lineTo(37.1f, 161.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -9.3f, -2.5f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 4.0f, -63.3f)
                arcToRelative(136.1f, 136.1f, 0.0f, false, true, 192.4f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 4.0f, 63.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -9.3f, 2.5f)
                lineToRelative(-47.3f, -18.9f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -4.9f, -5.8f)
                lineToRelative(-6.2f, -29.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 155.4f, 101.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.8f, 90.2f)
                curveTo(173.7f, 34.0f, 82.3f, 34.0f, 26.2f, 90.2f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, false, -4.7f, 73.9f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 12.6f, 6.1f)
                arcToRelative(17.1f, 17.1f, 0.0f, false, false, 5.9f, -1.1f)
                lineToRelative(47.4f, -19.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.7f, -11.7f)
                lineToRelative(5.9f, -29.5f)
                arcToRelative(76.3f, 76.3f, 0.0f, false, true, 49.7f, -0.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(6.2f, 29.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 9.7f, 11.6f)
                lineToRelative(47.4f, 19.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 18.5f, -5.0f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 229.8f, 90.2f)
                close()
                moveTo(221.9f, 154.2f)
                lineTo(174.6f, 135.3f)
                lineTo(168.3f, 105.5f)
                arcTo(15.8f, 15.8f, 0.0f, false, false, 158.0f, 93.7f)
                arcToRelative(92.6f, 92.6f, 0.0f, false, false, -60.4f, 0.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -10.3f, 12.0f)
                lineToRelative(-5.9f, 29.5f)
                lineTo(34.1f, 154.2f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 3.4f, -52.7f)
                arcToRelative(128.2f, 128.2f, 0.0f, false, true, 181.0f, 0.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 221.9f, 154.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 192.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null

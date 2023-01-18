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

public val DuotoneGroup.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) {
            return _bluetoothX!!
        }
        _bluetoothX = Builder(name = "BluetoothX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 32.0f)
                lineToRelative(64.0f, 48.0f)
                lineToRelative(-64.0f, 48.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 128.0f)
                lineToRelative(64.0f, 48.0f)
                lineToRelative(-64.0f, 48.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.8f, 169.6f)
                lineTo(133.4f, 128.0f)
                lineToRelative(23.4f, -17.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 1.6f, -11.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.2f, -1.6f)
                lineTo(128.0f, 112.0f)
                verticalLineTo(48.0f)
                lineToRelative(19.2f, 14.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.6f, -12.8f)
                lineToRelative(-32.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 32.0f)
                verticalLineToRelative(80.0f)
                lineTo(60.8f, 73.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, 12.8f)
                lineTo(106.7f, 128.0f)
                lineTo(51.2f, 169.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 184.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                lineTo(112.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.5f, 7.2f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.5f, 0.8f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f)
                close()
                moveTo(128.0f, 208.0f)
                verticalLineTo(144.0f)
                lineToRelative(42.7f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.3f, 80.0f)
                lineToRelative(18.4f, -18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.0f)
                lineTo(208.0f, 68.7f)
                lineTo(189.7f, 50.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 11.4f)
                lineTo(196.7f, 80.0f)
                lineTo(178.4f, 98.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 112.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineTo(208.0f, 91.3f)
                lineToRelative(18.4f, 18.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 112.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                close()
            }
        }
        .build()
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null

package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) {
            return _batteryChargingVertical!!
        }
        _batteryChargingVertical = Builder(name = "BatteryChargingVertical", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 8.0f)
                close()
                moveTo(204.0f, 56.0f)
                lineTo(204.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(72.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(52.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 72.0f, 36.0f)
                lineTo(184.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 204.0f, 56.0f)
                close()
                moveTo(196.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(72.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 56.0f)
                lineTo(60.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(184.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
                moveTo(144.0f, 128.0f)
                lineTo(117.9f, 128.0f)
                lineToRelative(13.8f, -34.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.4f, -3.0f)
                lineToRelative(-16.0f, 40.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.4f, 3.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 136.0f)
                horizontalLineToRelative(26.1f)
                lineToRelative(-13.8f, 34.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.4f, 3.0f)
                lineToRelative(16.0f, -40.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.4f, -3.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 144.0f, 128.0f)
                close()
            }
        }
        .build()
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null

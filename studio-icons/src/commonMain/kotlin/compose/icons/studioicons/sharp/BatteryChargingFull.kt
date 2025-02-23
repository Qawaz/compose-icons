package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BatteryChargingFull: ImageVector
    get() {
        if (_batteryChargingFull != null) {
            return _batteryChargingFull!!
        }
        _batteryChargingFull = Builder(name = "BatteryChargingFull", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(11.0f, 20.0f)
                verticalLineToRelative(-5.5f)
                lineTo(9.0f, 14.5f)
                lineTo(13.0f, 7.0f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 20.0f)
                close()
            }
        }
        .build()
        return _batteryChargingFull!!
    }

private var _batteryChargingFull: ImageVector? = null

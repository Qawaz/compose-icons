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

public val ThinGroup.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) {
            return _batteryPlus!!
        }
        _batteryPlus = Builder(name = "BatteryPlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(244.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(220.0f, 72.0f)
                lineTo(220.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 52.0f)
                lineTo(200.0f, 52.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 220.0f, 72.0f)
                close()
                moveTo(212.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(48.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 72.0f)
                lineTo(36.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
                moveTo(148.0f, 124.0f)
                lineTo(128.0f, 124.0f)
                lineTo(128.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                lineTo(100.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(128.0f, 132.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null

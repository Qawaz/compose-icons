package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 136.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(67.7f)
                lineTo(81.3f, 99.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.4f, 0.0f)
                lineToRelative(25.3f, 38.0f)
                lineToRelative(9.3f, -14.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 136.0f, 120.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(140.3f)
                lineToRelative(-13.6f, 20.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.4f, 0.0f)
                lineTo(88.0f, 118.4f)
                lineToRelative(-9.3f, 14.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 72.0f, 136.0f)
                close()
                moveTo(176.0f, 32.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -48.0f, 24.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 20.0f, 92.0f)
                curveToRelative(0.0f, 1.5f, 0.0f, 3.0f, 0.1f, 4.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 8.5f, 7.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.5f, -8.5f)
                curveTo(36.0f, 94.4f, 36.0f, 93.2f, 36.0f, 92.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 84.6f, -17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 0.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 220.0f, 92.0f)
                curveToRelative(0.0f, 55.2f, -74.0f, 103.7f, -92.0f, 114.7f)
                curveToRelative(-10.6f, -6.4f, -40.5f, -25.8f, -63.3f, -52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.1f, 10.6f)
                curveToRelative(30.0f, 34.2f, 69.8f, 56.7f, 71.5f, 57.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.8f, 0.0f)
                arcToRelative(314.3f, 314.3f, 0.0f, false, false, 51.5f, -37.6f)
                curveTo(218.3f, 154.0f, 236.0f, 122.6f, 236.0f, 92.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 176.0f, 32.0f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null

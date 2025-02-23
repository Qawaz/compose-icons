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

public val ThinGroup.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) {
            return _phoneOutgoing!!
        }
        _phoneOutgoing = Builder(name = "PhoneOutgoing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.4f, 162.1f)
                lineTo(173.6f, 142.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -11.4f, 1.1f)
                lineToRelative(-25.1f, 16.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.8f, 0.3f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, true, -37.2f, -37.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.3f, -3.9f)
                lineTo(113.0f, 93.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.0f, -11.3f)
                lineTo(93.9f, 35.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -12.5f, -7.2f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 36.0f, 80.0f)
                curveToRelative(0.0f, 77.2f, 62.8f, 140.0f, 140.0f, 140.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, 51.6f, -45.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 220.4f, 162.1f)
                close()
                moveTo(219.7f, 173.6f)
                arcTo(44.1f, 44.1f, 0.0f, false, true, 176.0f, 212.0f)
                arcTo(132.1f, 132.1f, 0.0f, false, true, 44.0f, 80.0f)
                arcTo(44.1f, 44.1f, 0.0f, false, true, 82.4f, 36.3f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.6f, 2.5f)
                lineToRelative(20.1f, 46.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -0.3f, 3.8f)
                lineTo(89.7f, 114.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -0.8f, 11.8f)
                arcToRelative(88.6f, 88.6f, 0.0f, false, false, 40.9f, 40.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.8f, -0.9f)
                lineToRelative(25.0f, -16.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.8f, -0.3f)
                lineToRelative(46.8f, 20.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.7f, 173.6f)
                close()
                moveTo(157.2f, 98.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(198.3f, 52.0f)
                lineTo(168.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(212.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 57.7f)
                lineTo(162.8f, 98.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                close()
            }
        }
        .build()
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null

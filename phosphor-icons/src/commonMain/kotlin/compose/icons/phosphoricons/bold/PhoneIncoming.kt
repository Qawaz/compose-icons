package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) {
            return _phoneIncoming!!
        }
        _phoneIncoming = Builder(name = "PhoneIncoming", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.5f, 154.8f)
                lineToRelative(-46.8f, -20.1f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -19.0f, 1.7f)
                lineToRelative(-23.1f, 15.4f)
                arcToRelative(72.3f, 72.3f, 0.0f, false, true, -30.3f, -30.2f)
                lineToRelative(15.4f, -23.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 1.6f, -18.9f)
                lineTo(101.2f, 32.5f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -20.8f, -12.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 28.0f, 80.0f)
                curveToRelative(0.0f, 81.6f, 66.4f, 148.0f, 148.0f, 148.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 59.5f, -52.4f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 223.5f, 154.8f)
                close()
                moveTo(176.0f, 204.0f)
                arcTo(124.1f, 124.1f, 0.0f, false, true, 52.0f, 80.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 80.4f, 44.8f)
                lineToRelative(18.0f, 42.0f)
                lineTo(83.0f, 110.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -1.3f, 19.7f)
                arcToRelative(96.5f, 96.5f, 0.0f, false, false, 44.6f, 44.4f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 19.7f, -1.4f)
                lineToRelative(23.2f, -15.5f)
                lineToRelative(42.0f, 18.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 176.0f, 204.0f)
                close()
                moveTo(148.0f, 96.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(67.0f)
                lineToRelative(27.5f, -27.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(189.0f, 84.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(157.7f)
                lineToRelative(-0.6f, -0.2f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.5f, -0.2f)
                lineToRelative(-0.6f, -0.2f)
                lineToRelative(-0.5f, -0.2f)
                lineToRelative(-0.6f, -0.3f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-0.6f, -0.3f)
                lineToRelative(-0.4f, -0.4f)
                lineToRelative(-0.5f, -0.3f)
                lineToRelative(-0.8f, -0.7f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.7f, -0.8f)
                lineToRelative(-0.3f, -0.5f)
                lineToRelative(-0.4f, -0.4f)
                lineToRelative(-0.3f, -0.6f)
                lineToRelative(-0.3f, -0.4f)
                lineToRelative(-0.3f, -0.6f)
                curveToRelative(0.0f, -0.2f, -0.1f, -0.3f, -0.2f, -0.5f)
                reflectiveCurveToRelative(-0.1f, -0.4f, -0.2f, -0.6f)
                reflectiveCurveToRelative(-0.1f, -0.3f, -0.2f, -0.5f)
                reflectiveCurveToRelative(-0.1f, -0.4f, -0.1f, -0.6f)
                reflectiveCurveToRelative(-0.1f, -0.4f, -0.2f, -0.6f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.1f, -0.6f)
                verticalLineToRelative(-0.5f)
                arcTo(4.9f, 4.9f, 0.0f, false, true, 148.0f, 96.0f)
                close()
            }
        }
        .build()
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null

package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) {
            return _phoneIncoming!!
        }
        _phoneIncoming = Builder(name = "PhoneIncoming", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.6f, 175.1f)
                arcTo(56.2f, 56.2f, 0.0f, false, true, 176.0f, 224.0f)
                curveTo(96.6f, 224.0f, 32.0f, 159.4f, 32.0f, 80.0f)
                arcTo(56.2f, 56.2f, 0.0f, false, true, 80.9f, 24.4f)
                arcTo(16.3f, 16.3f, 0.0f, false, true, 97.6f, 34.0f)
                lineToRelative(20.1f, 46.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 116.3f, 96.0f)
                lineTo(99.7f, 121.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(76.5f, 76.5f, 0.0f, false, false, 35.2f, 35.0f)
                lineTo(160.0f, 139.7f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 15.1f, -1.3f)
                lineToRelative(46.9f, 20.0f)
                arcTo(16.3f, 16.3f, 0.0f, false, true, 231.6f, 175.1f)
                close()
                moveTo(152.1f, 97.1f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.1f, 0.5f)
                verticalLineToRelative(0.3f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.1f, 0.4f)
                lineToRelative(0.2f, 0.4f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.2f, 0.1f, 0.4f)
                lineToRelative(0.2f, 0.3f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.2f, 0.1f, 0.4f)
                lineToRelative(0.2f, 0.3f)
                lineToRelative(0.3f, 0.3f)
                lineToRelative(0.2f, 0.3f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.2f, 0.4f)
                curveToRelative(0.1f, 0.1f, 0.3f, 0.2f, 0.4f, 0.4f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.1f, 0.2f)
                horizontalLineToRelative(0.2f)
                lineToRelative(0.4f, 0.4f)
                lineToRelative(0.4f, 0.2f)
                lineToRelative(0.3f, 0.3f)
                lineToRelative(0.3f, 0.2f)
                lineToRelative(0.3f, 0.2f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.3f, 0.2f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.4f, 0.2f)
                lineTo(200.0f, 103.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(179.3f, 87.4f)
                lineToRelative(34.4f, -34.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(168.0f, 76.7f)
                lineTo(168.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(152.0f, 96.8f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 152.1f, 97.1f)
                close()
            }
        }
        .build()
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null

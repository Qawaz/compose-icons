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

public val RegularGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                lineTo(216.0f, 200.0f)
                close()
                moveTo(76.0f, 128.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 14.3f, -6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.4f, 11.2f)
                arcTo(35.4f, 35.4f, 0.0f, false, true, 96.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                arcToRelative(35.4f, 35.4f, 0.0f, false, true, 25.7f, 10.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 110.3f, 114.0f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 96.0f, 108.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 76.0f, 128.0f)
                close()
                moveTo(148.0f, 128.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 14.3f, -6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.4f, 11.2f)
                arcTo(35.4f, 35.4f, 0.0f, false, true, 168.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                arcToRelative(35.4f, 35.4f, 0.0f, false, true, 25.7f, 10.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 182.3f, 114.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -14.3f, -6.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 148.0f, 128.0f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null

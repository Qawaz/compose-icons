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

public val RegularGroup.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) {
            return _wifiMedium!!
        }
        _wifiMedium = Builder(name = "WifiMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.6f, 160.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.2f, 11.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -5.7f, 2.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.6f, -2.3f)
                arcToRelative(42.8f, 42.8f, 0.0f, false, false, -59.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.1f, -11.5f)
                arcToRelative(58.7f, 58.7f, 0.0f, false, true, 81.2f, 0.0f)
                close()
                moveTo(202.6f, 126.4f)
                arcToRelative(106.7f, 106.7f, 0.0f, false, false, -149.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.2f, 11.4f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, true, 126.8f, 0.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, -13.7f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 188.0f)
                close()
            }
        }
        .build()
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null

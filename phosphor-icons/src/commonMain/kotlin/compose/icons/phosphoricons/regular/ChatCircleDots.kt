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

public val RegularGroup.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) {
            return _chatCircleDots!!
        }
        _chatCircleDots = Builder(name = "ChatCircleDots", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 36.8f, 178.0f)
                lineToRelative(-8.5f, 30.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 48.0f, 227.7f)
                lineToRelative(30.0f, -8.5f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.4f, 88.4f, 0.0f, false, true, -44.9f, -12.3f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -4.1f, -1.1f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -2.2f, 0.3f)
                lineToRelative(-33.2f, 9.5f)
                lineToRelative(9.5f, -33.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -0.8f, -6.3f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 128.0f, 216.0f)
                close()
                moveTo(140.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 128.0f)
                close()
                moveTo(92.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 128.0f)
                close()
                moveTo(188.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null

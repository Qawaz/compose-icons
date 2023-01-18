package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RedPacketFill: ImageVector
    get() {
        if (_redPacketFill != null) {
            return _redPacketFill!!
        }
        _redPacketFill = Builder(name = "RedPacketFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.937f)
                arcTo(11.985f, 11.985f, 0.0f, false, true, 14.194f, 9.8f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.388f, 0.0f)
                arcTo(11.985f, 11.985f, 0.0f, false, true, 3.0f, 5.937f)
                lineTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.937f)
                close()
                moveTo(21.0f, 8.724f)
                lineTo(21.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 8.724f)
                arcTo(13.944f, 13.944f, 0.0f, false, false, 9.63f, 11.8f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 4.74f, 0.0f)
                arcTo(13.944f, 13.944f, 0.0f, false, false, 21.0f, 8.724f)
                close()
            }
        }
        .build()
        return _redPacketFill!!
    }

private var _redPacketFill: ImageVector? = null

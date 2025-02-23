package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.MarkChatRead: ImageVector
    get() {
        if (_markChatRead != null) {
            return _markChatRead!!
        }
        _markChatRead = Builder(name = "MarkChatRead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                lineToRelative(-6.0f, 0.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-2.0f, 0.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(8.0f, 0.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(23.0f, 14.34f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(17.34f, 20.0f)
                lineTo(23.0f, 14.34f)
                close()
            }
        }
        .build()
        return _markChatRead!!
    }

private var _markChatRead: ImageVector? = null

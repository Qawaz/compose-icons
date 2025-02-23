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

public val FillGroup.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) {
            return _chatTeardrop!!
        }
        _chatTeardrop = Builder(name = "ChatTeardrop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 124.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, true, 132.0f, 224.0f)
                horizontalLineTo(47.7f)
                arcTo(15.7f, 15.7f, 0.0f, false, true, 32.0f, 208.3f)
                verticalLineTo(124.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 200.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chatTeardrop!!
    }

private var _chatTeardrop: ImageVector? = null

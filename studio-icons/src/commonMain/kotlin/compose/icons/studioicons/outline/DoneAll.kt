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

public val OutlineGroup.DoneAll: ImageVector
    get() {
        if (_doneAll != null) {
            return _doneAll!!
        }
        _doneAll = Builder(name = "DoneAll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-6.34f, 6.34f)
                lineToRelative(1.41f, 1.41f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(22.24f, 5.59f)
                lineTo(11.66f, 16.17f)
                lineTo(7.48f, 12.0f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(11.66f, 19.0f)
                lineToRelative(12.0f, -12.0f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(0.41f, 13.41f)
                lineTo(6.0f, 19.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.83f, 12.0f)
                lineTo(0.41f, 13.41f)
                close()
            }
        }
        .build()
        return _doneAll!!
    }

private var _doneAll: ImageVector? = null

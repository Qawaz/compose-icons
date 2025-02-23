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

public val ThinGroup.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) {
            return _caretCircleDown!!
        }
        _caretCircleDown = Builder(name = "CaretCircleDown", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(166.7f, 113.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.3f, 5.7f)
                lineToRelative(-36.0f, 40.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -6.0f, 0.0f)
                lineToRelative(-36.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, -5.4f)
                lineTo(128.0f, 150.0f)
                lineToRelative(33.0f, -36.7f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 166.7f, 113.0f)
                close()
            }
        }
        .build()
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null

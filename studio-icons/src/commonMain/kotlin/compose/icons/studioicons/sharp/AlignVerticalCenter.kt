package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.AlignVerticalCenter: ImageVector
    get() {
        if (_alignVerticalCenter != null) {
            return _alignVerticalCenter!!
        }
        _alignVerticalCenter = Builder(name = "AlignVerticalCenter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 8.0f)
                lineToRelative(-5.16f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(5.16f, 0.0f)
                lineToRelative(0.0f, 8.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _alignVerticalCenter!!
    }

private var _alignVerticalCenter: ImageVector? = null

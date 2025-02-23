package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SwipeLeftAlt: ImageVector
    get() {
        if (_swipeLeftAlt != null) {
            return _swipeLeftAlt!!
        }
        _swipeLeftAlt = Builder(name = "SwipeLeftAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1f, 13.0f)
                curveToRelative(0.46f, 2.28f, 2.48f, 4.0f, 4.9f, 4.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-2.42f, 0.0f, -4.44f, 1.72f, -4.9f, 4.0f)
                horizontalLineTo(5.83f)
                lineToRelative(1.59f, -1.59f)
                lineTo(6.0f, 8.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.83f, 13.0f)
                horizontalLineTo(10.1f)
                close()
            }
        }
        .build()
        return _swipeLeftAlt!!
    }

private var _swipeLeftAlt: ImageVector? = null

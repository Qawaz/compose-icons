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

public val BaselineGroup.Vrpano: ImageVector
    get() {
        if (_vrpano != null) {
            return _vrpano!!
        }
        _vrpano = Builder(name = "Vrpano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.69f, 4.05f)
                curveTo(18.66f, 4.73f, 15.86f, 5.5f, 12.0f, 5.5f)
                curveToRelative(-3.89f, 0.0f, -6.95f, -0.84f, -8.69f, -1.43f)
                curveTo(2.67f, 3.85f, 2.0f, 4.33f, 2.0f, 5.02f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.68f, 0.66f, 1.17f, 1.31f, 0.95f)
                curveTo(5.36f, 19.26f, 8.1f, 18.5f, 12.0f, 18.5f)
                curveToRelative(3.87f, 0.0f, 6.66f, 0.76f, 8.69f, 1.45f)
                curveTo(21.34f, 20.16f, 22.0f, 19.68f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 4.32f, 21.34f, 3.84f, 20.69f, 4.05f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-2.34f, 0.0f, -4.52f, 0.15f, -6.52f, 0.41f)
                lineToRelative(3.69f, -4.42f)
                lineToRelative(2.0f, 2.4f)
                lineTo(14.0f, 10.0f)
                lineToRelative(4.51f, 5.4f)
                curveTo(16.52f, 15.15f, 14.3f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _vrpano!!
    }

private var _vrpano: ImageVector? = null

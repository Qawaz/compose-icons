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

public val OutlineGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.54f, 5.23f)
                lineToRelative(-1.39f, -1.68f)
                curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                curveToRelative(-0.47f, 0.0f, -0.88f, 0.21f, -1.16f, 0.55f)
                lineTo(3.46f, 5.23f)
                curveTo(3.17f, 5.57f, 3.0f, 6.02f, 3.0f, 6.5f)
                lineTo(3.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 6.5f)
                curveToRelative(0.0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f)
                close()
                moveTo(6.24f, 5.0f)
                horizontalLineToRelative(11.52f)
                lineToRelative(0.81f, 0.97f)
                lineTo(5.44f, 5.97f)
                lineToRelative(0.8f, -0.97f)
                close()
                moveTo(5.0f, 19.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(11.0f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(13.45f, 10.0f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 13.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(-2.55f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null

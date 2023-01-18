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

public val RemixIcons.Slideshow4Line: ImageVector
    get() {
        if (_slideshow4Line != null) {
            return _slideshow4Line!!
        }
        _slideshow4Line = Builder(name = "Slideshow4Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.17f, 3.0f)
                arcTo(3.001f, 3.001f, 0.0f, false, true, 11.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.306f, 0.0f, 2.417f, 0.835f, 2.83f, 2.0f)
                lineTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.17f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineToRelative(-4.17f)
                arcTo(3.001f, 3.001f, 0.0f, false, true, 13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -2.83f, -2.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineToRelative(5.0f, 3.0f)
                lineToRelative(-5.0f, 3.0f)
                lineTo(10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _slideshow4Line!!
    }

private var _slideshow4Line: ImageVector? = null

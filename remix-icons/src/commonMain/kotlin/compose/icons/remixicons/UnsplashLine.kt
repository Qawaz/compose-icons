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

public val RemixIcons.UnsplashLine: ImageVector
    get() {
        if (_unsplashLine != null) {
            return _unsplashLine!!
        }
        _unsplashLine = Builder(name = "UnsplashLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(11.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(8.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-0.001f, 4.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 3.0f)
                verticalLineToRelative(6.0f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 5.0f)
                close()
            }
        }
        .build()
        return _unsplashLine!!
    }

private var _unsplashLine: ImageVector? = null

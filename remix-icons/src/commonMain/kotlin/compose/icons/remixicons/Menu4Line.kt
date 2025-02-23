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

public val RemixIcons.Menu4Line: ImageVector
    get() {
        if (_menu4Line != null) {
            return _menu4Line!!
        }
        _menu4Line = Builder(name = "Menu4Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(19.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _menu4Line!!
    }

private var _menu4Line: ImageVector? = null

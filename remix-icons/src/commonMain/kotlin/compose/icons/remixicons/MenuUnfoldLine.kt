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

public val RemixIcons.MenuUnfoldLine: ImageVector
    get() {
        if (_menuUnfoldLine != null) {
            return _menuUnfoldLine!!
        }
        _menuUnfoldLine = Builder(name = "MenuUnfoldLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(17.404f, 3.904f)
                lineTo(22.0f, 8.5f)
                lineToRelative(-4.596f, 4.596f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(19.172f, 8.5f)
                lineTo(15.99f, 5.318f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(12.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _menuUnfoldLine!!
    }

private var _menuUnfoldLine: ImageVector? = null

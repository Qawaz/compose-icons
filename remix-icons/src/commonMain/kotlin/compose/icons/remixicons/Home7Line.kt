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

public val RemixIcons.Home7Line: ImageVector
    get() {
        if (_home7Line != null) {
            return _home7Line!!
        }
        _home7Line = Builder(name = "Home7Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                lineTo(1.0f, 11.0f)
                lineToRelative(10.327f, -9.388f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.346f, 0.0f)
                lineTo(23.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 9.157f)
                lineToRelative(-6.0f, -5.454f)
                lineToRelative(-6.0f, 5.454f)
                lineTo(6.0f, 19.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _home7Line!!
    }

private var _home7Line: ImageVector? = null

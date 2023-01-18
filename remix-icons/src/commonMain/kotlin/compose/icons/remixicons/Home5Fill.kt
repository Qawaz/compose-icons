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

public val RemixIcons.Home5Fill: ImageVector
    get() {
        if (_home5Fill != null) {
            return _home5Fill!!
        }
        _home5Fill = Builder(name = "Home5Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 9.49f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.386f, -0.79f)
                lineToRelative(8.0f, -6.222f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.228f, 0.0f)
                lineToRelative(8.0f, 6.222f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.386f, 0.79f)
                lineTo(21.0f, 20.0f)
                close()
                moveTo(11.0f, 13.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _home5Fill!!
    }

private var _home5Fill: ImageVector? = null

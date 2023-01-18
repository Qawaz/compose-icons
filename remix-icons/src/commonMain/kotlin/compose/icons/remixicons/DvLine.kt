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

public val RemixIcons.DvLine: ImageVector
    get() {
        if (_dvLine != null) {
            return _dvLine!!
        }
        _dvLine = Builder(name = "DvLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.608f, 3.0f)
                lineTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineToRelative(-6.255f)
                arcTo(6.968f, 6.968f, 0.0f, false, true, 15.0f, 9.0f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, true, -3.0f, 5.745f)
                lineTo(12.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-6.255f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 11.608f, 3.0f)
                close()
                moveTo(6.0f, 13.584f)
                lineTo(6.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.416f)
                arcToRelative(5.001f, 5.001f, 0.0f, true, false, -4.0f, 0.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _dvLine!!
    }

private var _dvLine: ImageVector? = null

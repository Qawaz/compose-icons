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

public val RemixIcons.UninstallLine: ImageVector
    get() {
        if (_uninstallLine != null) {
            return _uninstallLine!!
        }
        _uninstallLine = Builder(name = "UninstallLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 4.0f)
                lineToRelative(-0.001f, 10.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(18.999f, 16.0f)
                horizontalLineToRelative(-14.0f)
                lineTo(5.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(-0.001f, -4.0f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 2.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineToRelative(4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _uninstallLine!!
    }

private var _uninstallLine: ImageVector? = null

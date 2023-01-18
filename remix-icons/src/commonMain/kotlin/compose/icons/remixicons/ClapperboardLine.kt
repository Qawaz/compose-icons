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

public val RemixIcons.ClapperboardLine: ImageVector
    get() {
        if (_clapperboardLine != null) {
            return _clapperboardLine!!
        }
        _clapperboardLine = Builder(name = "ClapperboardLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.998f, 7.0f)
                lineToRelative(2.31f, -4.0f)
                horizontalLineToRelative(3.69f)
                lineToRelative(-2.31f, 4.0f)
                horizontalLineToRelative(-3.69f)
                close()
                moveTo(11.998f, 7.0f)
                lineToRelative(2.31f, -4.0f)
                horizontalLineToRelative(3.69f)
                lineToRelative(-2.31f, 4.0f)
                horizontalLineToRelative(-3.69f)
                close()
                moveTo(17.998f, 7.0f)
                lineToRelative(2.31f, -4.0f)
                horizontalLineToRelative(0.7f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.445f, 0.992f, 0.993f)
                verticalLineToRelative(16.014f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.992f, 0.993f)
                lineTo(2.992f, 21.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 2.0f, 20.007f)
                lineTo(2.0f, 3.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.992f, 3.0f)
                horizontalLineToRelative(3.006f)
                lineTo(4.0f, 6.46f)
                lineTo(4.0f, 19.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-2.002f)
                close()
            }
        }
        .build()
        return _clapperboardLine!!
    }

private var _clapperboardLine: ImageVector? = null

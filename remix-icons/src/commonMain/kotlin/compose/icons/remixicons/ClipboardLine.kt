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

public val RemixIcons.ClipboardLine: ImageVector
    get() {
        if (_clipboardLine != null) {
            return _clipboardLine!!
        }
        _clipboardLine = Builder(name = "ClipboardLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.007f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.445f, 0.993f, 0.993f)
                verticalLineToRelative(16.014f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.993f, 0.993f)
                lineTo(3.993f, 22.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 3.0f, 21.007f)
                lineTo(3.0f, 4.993f)
                curveTo(3.0f, 4.445f, 3.445f, 4.0f, 3.993f, 4.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _clipboardLine!!
    }

private var _clipboardLine: ImageVector? = null

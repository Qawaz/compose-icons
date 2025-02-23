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

public val RemixIcons.LinkedinLine: ImageVector
    get() {
        if (_linkedinLine != null) {
            return _linkedinLine!!
        }
        _linkedinLine = Builder(name = "LinkedinLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.55f)
                curveTo(12.917f, 8.613f, 14.111f, 8.0f, 15.5f, 8.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, 5.5f)
                lineTo(21.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -7.0f, 0.0f)
                lineTo(12.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 8.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.05f)
                close()
                moveTo(5.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(4.0f, 8.5f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                lineTo(4.0f, 8.5f)
                close()
            }
        }
        .build()
        return _linkedinLine!!
    }

private var _linkedinLine: ImageVector? = null

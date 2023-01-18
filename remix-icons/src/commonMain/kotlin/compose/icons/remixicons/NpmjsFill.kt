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

public val RemixIcons.NpmjsFill: ImageVector
    get() {
        if (_npmjsFill != null) {
            return _npmjsFill!!
        }
        _npmjsFill = Builder(name = "NpmjsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(5.0f)
                lineTo(12.0f, 9.5f)
                horizontalLineToRelative(2.5f)
                lineTo(14.5f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 7.0f)
                close()
            }
        }
        .build()
        return _npmjsFill!!
    }

private var _npmjsFill: ImageVector? = null

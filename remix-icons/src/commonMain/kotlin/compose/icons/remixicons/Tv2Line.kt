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

public val RemixIcons.Tv2Line: ImageVector
    get() {
        if (_tv2Line != null) {
            return _tv2Line!!
        }
        _tv2Line = Builder(name = "Tv2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.455f, -1.0f, 0.992f, -1.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.445f, 0.992f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.552f, -0.455f, 1.0f, -0.992f, 1.0f)
                lineTo(2.992f, 19.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 2.0f, 18.0f)
                lineTo(2.0f, 4.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(5.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _tv2Line!!
    }

private var _tv2Line: ImageVector? = null

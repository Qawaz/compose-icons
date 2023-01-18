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

public val RemixIcons.PauseFill: ImageVector
    get() {
        if (_pauseFill != null) {
            return _pauseFill!!
        }
        _pauseFill = Builder(name = "PauseFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 5.0f)
                close()
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _pauseFill!!
    }

private var _pauseFill: ImageVector? = null

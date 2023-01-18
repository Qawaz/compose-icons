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

public val RemixIcons.Spam3Fill: ImageVector
    get() {
        if (_spam3Fill != null) {
            return _spam3Fill!!
        }
        _spam3Fill = Builder(name = "Spam3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.936f, 2.5f)
                lineTo(21.5f, 8.067f)
                verticalLineToRelative(7.87f)
                lineTo(15.936f, 21.5f)
                horizontalLineToRelative(-7.87f)
                lineTo(2.5f, 15.936f)
                verticalLineToRelative(-7.87f)
                lineTo(8.066f, 2.5f)
                horizontalLineToRelative(7.87f)
                close()
                moveTo(8.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _spam3Fill!!
    }

private var _spam3Fill: ImageVector? = null

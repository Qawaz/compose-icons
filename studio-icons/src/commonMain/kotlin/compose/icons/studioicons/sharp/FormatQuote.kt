package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FormatQuote: ImageVector
    get() {
        if (_formatQuote != null) {
            return _formatQuote!!
        }
        _formatQuote = Builder(name = "FormatQuote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(2.0f, -4.0f)
                lineTo(10.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-2.0f, 4.0f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(2.0f, -4.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-2.0f, 4.0f)
                close()
            }
        }
        .build()
        return _formatQuote!!
    }

private var _formatQuote: ImageVector? = null

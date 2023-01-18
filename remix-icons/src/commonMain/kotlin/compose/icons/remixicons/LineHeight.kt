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

public val RemixIcons.LineHeight: ImageVector
    get() {
        if (_lineHeight != null) {
            return _lineHeight!!
        }
        _lineHeight = Builder(name = "LineHeight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 4.0f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 7.0f)
                lineTo(1.0f, 7.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(6.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _lineHeight!!
    }

private var _lineHeight: ImageVector? = null

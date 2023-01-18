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

public val RemixIcons.PageSeparator: ImageVector
    get() {
        if (_pageSeparator != null) {
            return _pageSeparator!!
        }
        _pageSeparator = Builder(name = "PageSeparator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineToRelative(4.0f, 3.0f)
                lineToRelative(-4.0f, 3.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-4.0f, -3.0f)
                lineToRelative(4.0f, -3.0f)
                close()
            }
        }
        .build()
        return _pageSeparator!!
    }

private var _pageSeparator: ImageVector? = null

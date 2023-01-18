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

public val RemixIcons.ArrowGoBackFill: ImageVector
    get() {
        if (_arrowGoBackFill != null) {
            return _arrowGoBackFill!!
        }
        _arrowGoBackFill = Builder(name = "ArrowGoBackFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 6.0f)
                lineToRelative(6.0f, -5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _arrowGoBackFill!!
    }

private var _arrowGoBackFill: ImageVector? = null

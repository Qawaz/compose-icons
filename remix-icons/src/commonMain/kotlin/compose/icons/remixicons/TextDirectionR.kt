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

public val RemixIcons.TextDirectionR: ImageVector
    get() {
        if (_textDirectionR != null) {
            return _textDirectionR!!
        }
        _textDirectionR = Builder(name = "TextDirectionR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.5f)
                lineTo(3.0f, 18.0f)
                lineToRelative(4.0f, -3.5f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _textDirectionR!!
    }

private var _textDirectionR: ImageVector? = null

package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.KeyboardReturn: ImageVector
    get() {
        if (_keyboardReturn != null) {
            return _keyboardReturn!!
        }
        _keyboardReturn = Builder(name = "KeyboardReturn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.83f)
                lineToRelative(3.58f, -3.59f)
                lineTo(8.0f, 6.0f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.83f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _keyboardReturn!!
    }

private var _keyboardReturn: ImageVector? = null

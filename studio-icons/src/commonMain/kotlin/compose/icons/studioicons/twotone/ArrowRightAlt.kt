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

public val TwotoneGroup.ArrowRightAlt: ImageVector
    get() {
        if (_arrowRightAlt != null) {
            return _arrowRightAlt!!
        }
        _arrowRightAlt = Builder(name = "ArrowRightAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.01f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.01f)
                verticalLineToRelative(3.0f)
                lineTo(20.0f, 12.0f)
                lineToRelative(-3.99f, -4.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _arrowRightAlt!!
    }

private var _arrowRightAlt: ImageVector? = null

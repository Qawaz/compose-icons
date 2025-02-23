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

public val TwotoneGroup.Numbers: ImageVector
    get() {
        if (_numbers != null) {
            return _numbers!!
        }
        _numbers = Builder(name = "Numbers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 10.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineTo(5.0f)
                lineToRelative(-0.5f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(3.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.5f, -2.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineTo(20.5f)
                close()
                moveTo(13.5f, 14.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(13.5f, 14.0f)
                close()
            }
        }
        .build()
        return _numbers!!
    }

private var _numbers: ImageVector? = null

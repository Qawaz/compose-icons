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

public val SharpGroup.Filter9Plus: ImageVector
    get() {
        if (_filter9Plus != null) {
            return _filter9Plus!!
        }
        _filter9Plus = Builder(name = "Filter9Plus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 5.0f)
                close()
                moveTo(14.0f, 14.0f)
                lineTo(14.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(11.0f, 9.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(23.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                lineTo(23.0f, 1.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _filter9Plus!!
    }

private var _filter9Plus: ImageVector? = null

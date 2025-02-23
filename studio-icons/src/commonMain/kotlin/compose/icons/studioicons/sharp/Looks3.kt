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

public val SharpGroup.Looks3: ImageVector
    get() {
        if (_looks3 != null) {
            return _looks3!!
        }
        _looks3 = Builder(name = "Looks3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.01f, 3.0f)
                verticalLineToRelative(18.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(15.01f, 17.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _looks3!!
    }

private var _looks3: ImageVector? = null

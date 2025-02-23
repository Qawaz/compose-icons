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

public val SharpGroup.CleaningServices: ImageVector
    get() {
        if (_cleaningServices != null) {
            return _cleaningServices!!
        }
        _cleaningServices = Builder(name = "CleaningServices", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _cleaningServices!!
    }

private var _cleaningServices: ImageVector? = null

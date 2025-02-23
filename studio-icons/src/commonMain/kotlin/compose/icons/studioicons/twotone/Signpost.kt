package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineTo(6.83f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineTo(6.83f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null

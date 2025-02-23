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

public val TwotoneGroup.AccountTree: ImageVector
    get() {
        if (_accountTree != null) {
            return _accountTree!!
        }
        _accountTree = Builder(name = "AccountTree", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(17.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(3.0f, 0.0f)
            }
        }
        .build()
        return _accountTree!!
    }

private var _accountTree: ImageVector? = null

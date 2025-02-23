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

public val TwotoneGroup.ContactMail: ImageVector
    get() {
        if (_contactMail != null) {
            return _contactMail!!
        }
        _contactMail = Builder(name = "ContactMail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(3.0f, 16.59f)
                curveTo(3.0f, 14.08f, 6.97f, 13.0f, 9.0f, 13.0f)
                reflectiveCurveToRelative(6.0f, 1.08f, 6.0f, 3.58f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-1.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(20.0f, 8.0f)
                lineToRelative(-2.5f, 1.75f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 7.0f)
                lineToRelative(2.5f, 1.75f)
                lineTo(20.0f, 7.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 16.59f)
                curveToRelative(0.0f, -2.5f, -3.97f, -3.58f, -6.0f, -3.58f)
                reflectiveCurveToRelative(-6.0f, 1.08f, -6.0f, 3.58f)
                lineTo(3.0f, 18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.41f)
                close()
                moveTo(5.48f, 16.0f)
                curveToRelative(0.74f, -0.5f, 2.22f, -1.0f, 3.52f, -1.0f)
                reflectiveCurveToRelative(2.77f, 0.49f, 3.52f, 1.0f)
                lineTo(5.48f, 16.0f)
                close()
            }
        }
        .build()
        return _contactMail!!
    }

private var _contactMail: ImageVector? = null

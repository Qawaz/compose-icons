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

public val TwotoneGroup.PhotoCameraFront: ImageVector
    get() {
        if (_photoCameraFront != null) {
            return _photoCameraFront!!
        }
        _photoCameraFront = Builder(name = "PhotoCameraFront", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.95f, 7.0f)
                lineToRelative(-1.83f, -2.0f)
                horizontalLineTo(9.88f)
                lineTo(8.05f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.95f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveTo(10.0f, 9.9f, 10.9f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-0.57f)
                curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f)
                curveTo(10.07f, 14.21f, 11.01f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveToRelative(1.93f, 0.21f, 2.78f, 0.58f)
                curveTo(15.52f, 14.9f, 16.0f, 15.62f, 16.0f, 16.43f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-3.17f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(20.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(4.05f)
                lineToRelative(1.83f, -2.0f)
                horizontalLineToRelative(4.24f)
                lineToRelative(1.83f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveTo(10.0f, 12.1f, 10.9f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(14.78f, 14.58f)
                curveTo(13.93f, 14.21f, 12.99f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(8.48f, 14.9f, 8.0f, 15.62f, 8.0f, 16.43f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.57f)
                curveTo(16.0f, 15.62f, 15.52f, 14.9f, 14.78f, 14.58f)
                close()
            }
        }
        .build()
        return _photoCameraFront!!
    }

private var _photoCameraFront: ImageVector? = null

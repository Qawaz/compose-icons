package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.MinorCrash: ImageVector
    get() {
        if (_minorCrash != null) {
            return _minorCrash!!
        }
        _minorCrash = Builder(name = "MinorCrash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.92f, 9.01f)
                curveTo(18.72f, 8.42f, 18.16f, 8.0f, 17.5f, 8.0f)
                horizontalLineToRelative(-11.0f)
                curveTo(5.84f, 8.0f, 5.29f, 8.42f, 5.08f, 9.01f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                lineTo(18.92f, 9.01f)
                close()
                moveTo(6.85f, 10.0f)
                horizontalLineToRelative(10.29f)
                lineToRelative(1.04f, 3.0f)
                horizontalLineTo(5.81f)
                lineTo(6.85f, 10.0f)
                close()
                moveTo(6.0f, 17.5f)
                curveTo(6.0f, 16.67f, 6.67f, 16.0f, 7.5f, 16.0f)
                reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f)
                reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f)
                reflectiveCurveTo(6.0f, 18.33f, 6.0f, 17.5f)
                close()
                moveTo(15.0f, 17.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f)
                reflectiveCurveTo(15.0f, 18.33f, 15.0f, 17.5f)
                close()
                moveTo(9.41f, 5.0f)
                lineTo(8.0f, 6.41f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(6.41f, 2.0f)
                lineTo(9.41f, 5.0f)
                close()
                moveTo(16.0f, 6.41f)
                lineTo(14.59f, 5.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(19.0f, 3.41f)
                lineTo(16.0f, 6.41f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _minorCrash!!
    }

private var _minorCrash: ImageVector? = null

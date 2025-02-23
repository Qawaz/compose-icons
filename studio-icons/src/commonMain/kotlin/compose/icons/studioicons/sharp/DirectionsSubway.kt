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

public val SharpGroup.DirectionsSubway: ImageVector
    get() {
        if (_directionsSubway != null) {
            return _directionsSubway!!
        }
        _directionsSubway = Builder(name = "DirectionsSubway", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f)
                verticalLineToRelative(9.5f)
                curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f)
                lineTo(6.0f, 20.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.5f)
                lineTo(16.5f, 19.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(20.0f, 6.0f)
                curveToRelative(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f)
                close()
                moveTo(7.5f, 17.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(6.67f, 14.0f, 7.5f, 14.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(8.33f, 17.0f, 7.5f, 17.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.5f, 17.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _directionsSubway!!
    }

private var _directionsSubway: ImageVector? = null

package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.DirectionsRailway: ImageVector
    get() {
        if (_directionsRailway != null) {
            return _directionsRailway!!
        }
        _directionsRailway = Builder(name = "DirectionsRailway", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.5f)
                curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f)
                lineTo(6.0f, 20.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.5f)
                lineTo(16.5f, 19.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveToRelative(-8.0f, 0.5f, -8.0f, 4.0f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(4.0f, 15.5f)
                curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f)
                lineToRelative(-1.14f, 1.15f)
                curveToRelative(-0.32f, 0.31f, -0.1f, 0.85f, 0.35f, 0.85f)
                horizontalLineToRelative(10.58f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(16.5f, 19.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveToRelative(-8.0f, 0.5f, -8.0f, 4.0f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _directionsRailway!!
    }

private var _directionsRailway: ImageVector? = null

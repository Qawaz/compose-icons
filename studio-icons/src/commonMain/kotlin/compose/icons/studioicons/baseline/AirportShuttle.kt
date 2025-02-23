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

public val BaselineGroup.AirportShuttle: ImageVector
    get() {
        if (_airportShuttle != null) {
            return _airportShuttle!!
        }
        _airportShuttle = Builder(name = "AirportShuttle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.65f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.65f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                lineTo(23.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(3.0f, 11.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(6.0f, 17.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.5f, 17.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.0f, 11.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _airportShuttle!!
    }

private var _airportShuttle: ImageVector? = null

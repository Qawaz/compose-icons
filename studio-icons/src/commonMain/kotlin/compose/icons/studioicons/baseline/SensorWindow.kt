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

public val BaselineGroup.SensorWindow: ImageVector
    get() {
        if (_sensorWindow != null) {
            return _sensorWindow!!
        }
        _sensorWindow = Builder(name = "SensorWindow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _sensorWindow!!
    }

private var _sensorWindow: ImageVector? = null

package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.ThermometerWater: ImageVector
    get() {
        if (_thermometerWater != null) {
            return _thermometerWater!!
        }
        _thermometerWater = Builder(name = "ThermometerWater", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(10.0f, 3.34f, 8.66f, 2.0f, 7.0f, 2.0f)
                reflectiveCurveTo(4.0f, 3.34f, 4.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(1.79f, 14.66f, 1.34f, 17.79f, 3.0f, 20.0f)
                reflectiveCurveTo(7.79f, 22.66f, 10.0f, 21.0f)
                reflectiveCurveTo(12.66f, 16.21f, 11.0f, 14.0f)
                curveTo(10.72f, 13.62f, 10.38f, 13.28f, 10.0f, 13.0f)
                moveTo(7.0f, 4.0f)
                curveTo(7.55f, 4.0f, 8.0f, 4.45f, 8.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 4.45f, 6.45f, 4.0f, 7.0f, 4.0f)
                moveTo(18.0f, 7.0f)
                curveTo(18.0f, 7.0f, 14.0f, 11.34f, 14.0f, 14.07f)
                curveTo(14.0f, 19.31f, 22.0f, 19.31f, 22.0f, 14.07f)
                curveTo(22.0f, 11.34f, 18.0f, 7.0f, 18.0f, 7.0f)
                close()
            }
        }
        .build()
        return _thermometerWater!!
    }

private var _thermometerWater: ImageVector? = null

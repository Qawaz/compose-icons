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

public val MaterialDesignIcons.ThermometerBluetooth: ImageVector
    get() {
        if (_thermometerBluetooth != null) {
            return _thermometerBluetooth!!
        }
        _thermometerBluetooth = Builder(name = "ThermometerBluetooth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 3.34f, 9.66f, 2.0f, 8.0f, 2.0f)
                reflectiveCurveTo(5.0f, 3.34f, 5.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(2.79f, 14.66f, 2.34f, 17.79f, 4.0f, 20.0f)
                reflectiveCurveTo(8.79f, 22.66f, 11.0f, 21.0f)
                reflectiveCurveTo(13.66f, 16.21f, 12.0f, 14.0f)
                curveTo(11.72f, 13.62f, 11.38f, 13.28f, 11.0f, 13.0f)
                moveTo(8.0f, 4.0f)
                curveTo(8.55f, 4.0f, 9.0f, 4.45f, 9.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                curveTo(7.0f, 4.45f, 7.45f, 4.0f, 8.0f, 4.0f)
                moveTo(18.0f, 8.0f)
                verticalLineTo(11.79f)
                lineTo(15.71f, 9.5f)
                lineTo(15.0f, 10.21f)
                lineTo(17.79f, 13.0f)
                lineTo(15.0f, 15.79f)
                lineTo(15.71f, 16.5f)
                lineTo(18.0f, 14.21f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.5f)
                lineTo(21.35f, 15.14f)
                lineTo(19.21f, 13.0f)
                lineTo(21.35f, 10.85f)
                lineTo(18.5f, 8.0f)
                horizontalLineTo(18.0f)
                moveTo(19.0f, 9.91f)
                lineTo(19.94f, 10.85f)
                lineTo(19.0f, 11.79f)
                verticalLineTo(9.91f)
                moveTo(19.0f, 14.21f)
                lineTo(19.94f, 15.14f)
                lineTo(19.0f, 16.08f)
                verticalLineTo(14.21f)
                close()
            }
        }
        .build()
        return _thermometerBluetooth!!
    }

private var _thermometerBluetooth: ImageVector? = null

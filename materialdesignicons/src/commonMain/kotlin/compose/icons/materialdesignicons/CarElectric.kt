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

public val MaterialDesignIcons.CarElectric: ImageVector
    get() {
        if (_carElectric != null) {
            return _carElectric!!
        }
        _carElectric = Builder(name = "CarElectric", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.92f, 2.0f)
                curveTo(18.72f, 1.42f, 18.16f, 1.0f, 17.5f, 1.0f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 1.0f, 5.29f, 1.42f, 5.08f, 2.0f)
                lineTo(3.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(3.0f, 16.55f, 3.45f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(5.0f)
                curveTo(5.55f, 17.0f, 6.0f, 16.55f, 6.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 16.55f, 18.45f, 17.0f, 19.0f, 17.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 17.0f, 21.0f, 16.55f, 21.0f, 16.0f)
                verticalLineTo(8.0f)
                lineTo(18.92f, 2.0f)
                moveTo(6.5f, 12.0f)
                curveTo(5.67f, 12.0f, 5.0f, 11.33f, 5.0f, 10.5f)
                reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f)
                reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f)
                reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f)
                moveTo(17.5f, 12.0f)
                curveTo(16.67f, 12.0f, 16.0f, 11.33f, 16.0f, 10.5f)
                reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f)
                reflectiveCurveTo(19.0f, 9.67f, 19.0f, 10.5f)
                reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f)
                moveTo(5.0f, 7.0f)
                lineTo(6.5f, 2.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                moveTo(7.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                lineTo(17.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                lineTo(7.0f, 20.0f)
                close()
            }
        }
        .build()
        return _carElectric!!
    }

private var _carElectric: ImageVector? = null

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

public val MaterialDesignIcons.TrainCarFlatbedTank: ImageVector
    get() {
        if (_trainCarFlatbedTank != null) {
            return _trainCarFlatbedTank!!
        }
        _trainCarFlatbedTank = Builder(name = "TrainCarFlatbedTank", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.22f, 15.0f)
                curveTo(21.7f, 14.47f, 22.0f, 13.77f, 22.0f, 13.0f)
                curveTo(22.0f, 11.34f, 20.66f, 10.0f, 19.0f, 10.0f)
                horizontalLineTo(5.0f)
                curveTo(3.34f, 10.0f, 2.0f, 11.34f, 2.0f, 13.0f)
                curveTo(2.0f, 13.77f, 2.3f, 14.47f, 2.78f, 15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 18.11f, 2.9f, 19.0f, 4.0f, 19.0f)
                reflectiveCurveTo(6.0f, 18.11f, 6.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 18.11f, 18.9f, 19.0f, 20.0f, 19.0f)
                reflectiveCurveTo(22.0f, 18.11f, 22.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.22f)
                moveTo(19.0f, 12.0f)
                curveTo(19.55f, 12.0f, 20.0f, 12.45f, 20.0f, 13.0f)
                reflectiveCurveTo(19.55f, 14.0f, 19.0f, 14.0f)
                reflectiveCurveTo(18.0f, 13.55f, 18.0f, 13.0f)
                reflectiveCurveTo(18.45f, 12.0f, 19.0f, 12.0f)
                moveTo(12.0f, 12.0f)
                curveTo(12.55f, 12.0f, 13.0f, 12.45f, 13.0f, 13.0f)
                reflectiveCurveTo(12.55f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(11.0f, 13.55f, 11.0f, 13.0f)
                reflectiveCurveTo(11.45f, 12.0f, 12.0f, 12.0f)
                moveTo(5.0f, 12.0f)
                curveTo(5.55f, 12.0f, 6.0f, 12.45f, 6.0f, 13.0f)
                reflectiveCurveTo(5.55f, 14.0f, 5.0f, 14.0f)
                reflectiveCurveTo(4.0f, 13.55f, 4.0f, 13.0f)
                reflectiveCurveTo(4.45f, 12.0f, 5.0f, 12.0f)
                moveTo(13.62f, 6.0f)
                lineTo(13.22f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.62f)
                moveTo(20.0f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineTo(12.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _trainCarFlatbedTank!!
    }

private var _trainCarFlatbedTank: ImageVector? = null

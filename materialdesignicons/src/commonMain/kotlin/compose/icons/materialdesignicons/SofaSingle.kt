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

public val MaterialDesignIcons.SofaSingle: ImageVector
    get() {
        if (_sofaSingle != null) {
            return _sofaSingle!!
        }
        _sofaSingle = Builder(name = "SofaSingle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.15f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.9f, 5.9f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 5.0f, 19.0f, 5.9f, 19.0f, 7.0f)
                verticalLineTo(9.16f)
                curveTo(17.84f, 9.57f, 17.0f, 10.67f, 17.0f, 11.97f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.96f)
                curveTo(7.0f, 10.67f, 6.16f, 9.56f, 5.0f, 9.15f)
                moveTo(20.0f, 10.0f)
                curveTo(18.9f, 10.0f, 18.0f, 10.9f, 18.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                curveTo(6.0f, 10.9f, 5.11f, 10.0f, 4.0f, 10.0f)
                reflectiveCurveTo(2.0f, 10.9f, 2.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.1f, 2.9f, 19.0f, 4.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                curveTo(21.1f, 19.0f, 22.0f, 18.1f, 22.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 10.9f, 21.1f, 10.0f, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _sofaSingle!!
    }

private var _sofaSingle: ImageVector? = null

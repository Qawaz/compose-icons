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

public val MaterialDesignIcons.VectorDifference: ImageVector
    get() {
        if (_vectorDifference != null) {
            return _vectorDifference!!
        }
        _vectorDifference = Builder(name = "VectorDifference", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 1.0f)
                curveTo(1.89f, 1.0f, 1.0f, 1.89f, 1.0f, 3.0f)
                verticalLineTo(14.0f)
                curveTo(1.0f, 15.11f, 1.89f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                curveTo(16.0f, 1.89f, 15.11f, 1.0f, 14.0f, 1.0f)
                horizontalLineTo(3.0f)
                moveTo(9.0f, 7.0f)
                curveTo(7.89f, 7.0f, 7.0f, 7.89f, 7.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                moveTo(13.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                moveTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                curveTo(7.0f, 21.11f, 7.89f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 7.89f, 21.11f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(18.0f)
                moveTo(14.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 16.0f, 16.0f, 15.11f, 16.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                moveTo(7.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _vectorDifference!!
    }

private var _vectorDifference: ImageVector? = null

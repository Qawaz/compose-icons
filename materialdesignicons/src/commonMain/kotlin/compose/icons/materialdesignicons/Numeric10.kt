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

public val MaterialDesignIcons.Numeric10: ImageVector
    get() {
        if (_numeric10 != null) {
            return _numeric10!!
        }
        _numeric10 = Builder(name = "Numeric10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                moveTo(16.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(12.9f, 7.0f, 12.0f, 7.9f, 12.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(12.0f, 16.11f, 12.9f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 17.0f, 18.0f, 16.11f, 18.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 7.9f, 17.11f, 7.0f, 16.0f, 7.0f)
                moveTo(16.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _numeric10!!
    }

private var _numeric10: ImageVector? = null

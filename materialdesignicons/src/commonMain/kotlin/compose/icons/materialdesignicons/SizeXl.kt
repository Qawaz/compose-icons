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

public val MaterialDesignIcons.SizeXl: ImageVector
    get() {
        if (_sizeXl != null) {
            return _sizeXl!!
        }
        _sizeXl = Builder(name = "SizeXl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                horizontalLineTo(8.0f)
                lineTo(9.0f, 9.5f)
                lineTo(10.0f, 7.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(12.0f, 17.0f)
                horizontalLineTo(10.0f)
                lineTo(9.0f, 14.5f)
                lineTo(8.0f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(8.0f, 12.0f)
                lineTo(6.0f, 7.0f)
                moveTo(13.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _sizeXl!!
    }

private var _sizeXl: ImageVector? = null

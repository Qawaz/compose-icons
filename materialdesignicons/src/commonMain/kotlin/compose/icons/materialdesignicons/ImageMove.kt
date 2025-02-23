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

public val MaterialDesignIcons.ImageMove: ImageVector
    get() {
        if (_imageMove != null) {
            return _imageMove!!
        }
        _imageMove = Builder(name = "ImageMove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(0.0f)
                lineTo(24.0f, 5.0f)
                lineTo(19.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                moveTo(21.0f, 11.94f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(12.06f)
                curveTo(12.0f, 3.33f, 12.0f, 3.67f, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                curveTo(20.33f, 12.0f, 20.67f, 12.0f, 21.0f, 11.94f)
                moveTo(19.0f, 18.0f)
                lineTo(14.5f, 12.0f)
                lineTo(11.0f, 16.5f)
                lineTo(8.5f, 13.5f)
                lineTo(5.0f, 18.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _imageMove!!
    }

private var _imageMove: ImageVector? = null

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

public val MaterialDesignIcons.Margin: ImageVector
    get() {
        if (_margin != null) {
            return _margin!!
        }
        _margin = Builder(name = "Margin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                verticalLineTo(9.0f)
                lineTo(18.5f, 7.5f)
                lineTo(5.5f, 20.5f)
                lineTo(3.5f, 18.5f)
                lineTo(16.5f, 5.5f)
                lineTo(15.0f, 4.0f)
                horizontalLineTo(20.0f)
                moveTo(17.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 15.0f)
                verticalLineTo(17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 20.0f)
                moveTo(17.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 15.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 14.0f)
                moveTo(7.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 9.0f)
                verticalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 7.0f)
                verticalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 12.0f)
                moveTo(7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 9.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                close()
            }
        }
        .build()
        return _margin!!
    }

private var _margin: ImageVector? = null

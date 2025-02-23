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

public val MaterialDesignIcons.CoffeeOutline: ImageVector
    get() {
        if (_coffeeOutline != null) {
            return _coffeeOutline!!
        }
        _coffeeOutline = Builder(name = "CoffeeOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                moveTo(20.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 5.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 17.0f)
                horizontalLineTo(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                moveTo(16.0f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 15.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 13.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _coffeeOutline!!
    }

private var _coffeeOutline: ImageVector? = null

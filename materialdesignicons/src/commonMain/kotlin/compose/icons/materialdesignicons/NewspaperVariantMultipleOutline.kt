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

public val MaterialDesignIcons.NewspaperVariantMultipleOutline: ImageVector
    get() {
        if (_newspaperVariantMultipleOutline != null) {
            return _newspaperVariantMultipleOutline!!
        }
        _newspaperVariantMultipleOutline = Builder(name = "NewspaperVariantMultipleOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.0f, 21.0f, 2.0f, 19.0f, 2.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                moveTo(21.3f, 3.0f)
                horizontalLineTo(7.7f)
                curveTo(6.76f, 3.0f, 6.0f, 3.7f, 6.0f, 4.55f)
                verticalLineTo(15.45f)
                curveTo(6.0f, 16.31f, 6.76f, 17.0f, 7.7f, 17.0f)
                horizontalLineTo(21.3f)
                curveTo(22.24f, 17.0f, 23.0f, 16.31f, 23.0f, 15.45f)
                verticalLineTo(4.55f)
                curveTo(23.0f, 3.7f, 22.24f, 3.0f, 21.3f, 3.0f)
                moveTo(9.0f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                moveTo(20.0f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                moveTo(20.0f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _newspaperVariantMultipleOutline!!
    }

private var _newspaperVariantMultipleOutline: ImageVector? = null

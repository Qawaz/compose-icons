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

public val MaterialDesignIcons.HomeCityOutline: ImageVector
    get() {
        if (_homeCityOutline != null) {
            return _homeCityOutline!!
        }
        _homeCityOutline = Builder(name = "HomeCityOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                verticalLineTo(4.26f)
                lineTo(12.0f, 5.59f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                moveTo(7.5f, 5.0f)
                lineTo(0.0f, 10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                lineTo(7.5f, 5.0f)
                moveTo(14.0f, 6.0f)
                verticalLineTo(6.93f)
                lineTo(15.61f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                moveTo(7.5f, 7.5f)
                lineTo(13.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                lineTo(7.5f, 7.5f)
                moveTo(18.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _homeCityOutline!!
    }

private var _homeCityOutline: ImageVector? = null

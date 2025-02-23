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

public val MaterialDesignIcons.HexagonMultipleOutline: ImageVector
    get() {
        if (_hexagonMultipleOutline != null) {
            return _hexagonMultipleOutline!!
        }
        _hexagonMultipleOutline = Builder(name = "HexagonMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.37f, 4.0f)
                lineTo(10.78f, 6.5f)
                lineTo(9.37f, 9.0f)
                horizontalLineTo(6.63f)
                lineTo(5.23f, 6.5f)
                lineTo(6.63f, 4.0f)
                horizontalLineTo(9.37f)
                moveTo(10.25f, 2.0f)
                horizontalLineTo(5.75f)
                curveTo(5.56f, 2.0f, 5.39f, 2.11f, 5.31f, 2.26f)
                lineTo(3.09f, 6.22f)
                lineTo(3.0f, 6.5f)
                lineTo(3.09f, 6.78f)
                lineTo(5.31f, 10.74f)
                curveTo(5.39f, 10.89f, 5.56f, 11.0f, 5.75f, 11.0f)
                horizontalLineTo(10.25f)
                curveTo(10.44f, 11.0f, 10.61f, 10.89f, 10.69f, 10.74f)
                lineTo(12.91f, 6.78f)
                lineTo(13.0f, 6.5f)
                lineTo(12.91f, 6.22f)
                lineTo(10.69f, 2.26f)
                curveTo(10.61f, 2.11f, 10.44f, 2.0f, 10.25f, 2.0f)
                moveTo(18.62f, 9.5f)
                lineTo(20.0f, 12.0f)
                lineTo(18.62f, 14.5f)
                horizontalLineTo(15.88f)
                lineTo(14.5f, 12.0f)
                lineTo(15.88f, 9.5f)
                horizontalLineTo(18.62f)
                moveTo(19.5f, 7.5f)
                horizontalLineTo(15.0f)
                curveTo(14.81f, 7.5f, 14.64f, 7.61f, 14.56f, 7.76f)
                lineTo(12.34f, 11.72f)
                lineTo(12.25f, 12.0f)
                lineTo(12.34f, 12.28f)
                lineTo(14.56f, 16.24f)
                curveTo(14.64f, 16.39f, 14.81f, 16.5f, 15.0f, 16.5f)
                horizontalLineTo(19.5f)
                curveTo(19.69f, 16.5f, 19.86f, 16.39f, 19.94f, 16.24f)
                lineTo(22.16f, 12.28f)
                lineTo(22.25f, 12.0f)
                lineTo(22.16f, 11.72f)
                lineTo(19.94f, 7.76f)
                curveTo(19.86f, 7.61f, 19.69f, 7.5f, 19.5f, 7.5f)
                moveTo(9.37f, 15.0f)
                lineTo(10.78f, 17.5f)
                lineTo(9.37f, 20.0f)
                horizontalLineTo(6.63f)
                lineTo(5.23f, 17.5f)
                lineTo(6.63f, 15.0f)
                horizontalLineTo(9.37f)
                moveTo(10.25f, 13.0f)
                horizontalLineTo(5.75f)
                curveTo(5.56f, 13.0f, 5.39f, 13.11f, 5.31f, 13.26f)
                lineTo(3.09f, 17.22f)
                lineTo(3.0f, 17.5f)
                lineTo(3.09f, 17.78f)
                lineTo(5.31f, 21.74f)
                curveTo(5.39f, 21.89f, 5.56f, 22.0f, 5.75f, 22.0f)
                horizontalLineTo(10.25f)
                curveTo(10.44f, 22.0f, 10.61f, 21.89f, 10.69f, 21.74f)
                lineTo(12.91f, 17.78f)
                lineTo(13.0f, 17.5f)
                lineTo(12.91f, 17.22f)
                lineTo(10.69f, 13.26f)
                curveTo(10.61f, 13.11f, 10.44f, 13.0f, 10.25f, 13.0f)
                close()
            }
        }
        .build()
        return _hexagonMultipleOutline!!
    }

private var _hexagonMultipleOutline: ImageVector? = null

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

public val MaterialDesignIcons.PrinterPosPauseOutline: ImageVector
    get() {
        if (_printerPosPauseOutline != null) {
            return _printerPosPauseOutline!!
        }
        _printerPosPauseOutline = Builder(name = "PrinterPosPauseOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 10.9f, 19.11f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 18.3f, 13.13f, 17.63f, 13.35f, 17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.09f)
                curveTo(18.33f, 13.04f, 18.66f, 13.0f, 19.0f, 13.0f)
                curveTo(19.34f, 13.0f, 19.67f, 13.04f, 20.0f, 13.09f)
                verticalLineTo(12.0f)
                moveTo(15.0f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                moveTo(7.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                moveTo(16.0f, 16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                moveTo(22.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _printerPosPauseOutline!!
    }

private var _printerPosPauseOutline: ImageVector? = null

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

public val MaterialDesignIcons.BellAlertOutline: ImageVector
    get() {
        if (_bellAlertOutline != null) {
            return _bellAlertOutline!!
        }
        _bellAlertOutline = Builder(name = "BellAlertOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 4.29f)
                curveTo(7.12f, 5.14f, 5.0f, 7.82f, 5.0f, 11.0f)
                verticalLineTo(17.0f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                lineTo(19.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.82f, 16.88f, 5.14f, 14.0f, 4.29f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 6.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 6.0f)
                moveTo(21.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                moveTo(10.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 21.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _bellAlertOutline!!
    }

private var _bellAlertOutline: ImageVector? = null

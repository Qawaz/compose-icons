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

public val MaterialDesignIcons.ClipboardMultiple: ImageVector
    get() {
        if (_clipboardMultiple != null) {
            return _clipboardMultiple!!
        }
        _clipboardMultiple = Builder(name = "ClipboardMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 22.1f, 2.9f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                moveTo(20.0f, 3.0f)
                horizontalLineTo(16.8f)
                curveTo(16.4f, 1.8f, 15.3f, 1.0f, 14.0f, 1.0f)
                curveTo(12.7f, 1.0f, 11.6f, 1.8f, 11.2f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 3.0f, 6.0f, 3.9f, 6.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 18.1f, 6.9f, 19.0f, 8.0f, 19.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 19.0f, 22.0f, 18.1f, 22.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f)
                moveTo(14.0f, 3.0f)
                curveTo(14.6f, 3.0f, 15.0f, 3.5f, 15.0f, 4.0f)
                curveTo(15.0f, 4.5f, 14.5f, 5.0f, 14.0f, 5.0f)
                curveTo(13.5f, 5.0f, 13.0f, 4.5f, 13.0f, 4.0f)
                curveTo(13.0f, 3.5f, 13.4f, 3.0f, 14.0f, 3.0f)
                close()
            }
        }
        .build()
        return _clipboardMultiple!!
    }

private var _clipboardMultiple: ImageVector? = null

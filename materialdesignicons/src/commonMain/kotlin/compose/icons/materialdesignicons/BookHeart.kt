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

public val MaterialDesignIcons.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) {
            return _bookHeart!!
        }
        _bookHeart = Builder(name = "BookHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.3f)
                lineTo(18.4f, 22.8f)
                curveTo(16.4f, 20.9f, 15.0f, 19.7f, 15.0f, 18.2f)
                curveTo(15.0f, 17.0f, 16.0f, 16.0f, 17.2f, 16.0f)
                curveTo(17.9f, 16.0f, 18.6f, 16.3f, 19.0f, 16.8f)
                curveTo(19.4f, 16.3f, 20.1f, 16.0f, 20.8f, 16.0f)
                curveTo(22.0f, 16.0f, 23.0f, 16.9f, 23.0f, 18.2f)
                curveTo(23.0f, 19.7f, 21.6f, 20.9f, 19.6f, 22.8f)
                lineTo(19.0f, 23.3f)
                moveTo(6.0f, 22.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.89f, 4.89f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 7.5f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.89f, 20.0f, 4.0f)
                verticalLineTo(13.08f)
                lineTo(19.0f, 13.0f)
                curveTo(15.69f, 13.0f, 13.0f, 15.69f, 13.0f, 19.0f)
                curveTo(13.0f, 20.09f, 13.29f, 21.12f, 13.8f, 22.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null

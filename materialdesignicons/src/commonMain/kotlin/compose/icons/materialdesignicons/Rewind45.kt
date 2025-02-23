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

public val MaterialDesignIcons.Rewind45: ImageVector
    get() {
        if (_rewind45 != null) {
            return _rewind45!!
        }
        _rewind45 = Builder(name = "Rewind45", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 3.0f)
                curveTo(17.1f, 3.0f, 21.1f, 6.0f, 22.5f, 10.2f)
                lineTo(20.1f, 11.0f)
                curveTo(19.0f, 7.8f, 16.0f, 5.5f, 12.5f, 5.5f)
                curveTo(10.5f, 5.5f, 8.8f, 6.2f, 7.4f, 7.4f)
                lineTo(10.0f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                lineTo(5.6f, 5.6f)
                curveTo(7.4f, 4.0f, 9.9f, 3.0f, 12.5f, 3.0f)
                moveTo(13.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 16.0f, 19.0f, 16.9f, 19.0f, 18.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 21.1f, 18.1f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                moveTo(5.0f, 12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _rewind45!!
    }

private var _rewind45: ImageVector? = null

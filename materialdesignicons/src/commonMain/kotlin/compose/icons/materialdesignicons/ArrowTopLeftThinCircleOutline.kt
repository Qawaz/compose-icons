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

public val MaterialDesignIcons.ArrowTopLeftThinCircleOutline: ImageVector
    get() {
        if (_arrowTopLeftThinCircleOutline != null) {
            return _arrowTopLeftThinCircleOutline!!
        }
        _arrowTopLeftThinCircleOutline = Builder(name = "ArrowTopLeftThinCircleOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.97f)
                curveTo(16.41f, 3.97f, 20.03f, 7.59f, 20.03f, 12.0f)
                curveTo(20.03f, 16.41f, 16.41f, 20.03f, 12.0f, 20.03f)
                curveTo(7.59f, 20.03f, 3.97f, 16.41f, 3.97f, 12.0f)
                curveTo(3.97f, 7.59f, 7.59f, 3.97f, 12.0f, 3.97f)
                moveTo(12.0f, 2.0f)
                curveTo(6.46f, 2.0f, 2.0f, 6.46f, 2.0f, 12.0f)
                curveTo(2.0f, 17.54f, 6.46f, 22.0f, 12.0f, 22.0f)
                curveTo(17.54f, 22.0f, 22.0f, 17.54f, 22.0f, 12.0f)
                curveTo(22.0f, 6.46f, 17.54f, 2.0f, 12.0f, 2.0f)
                moveTo(10.12f, 11.53f)
                lineTo(8.0f, 13.64f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.64f)
                lineTo(11.53f, 10.12f)
                lineTo(16.5f, 15.1f)
                lineTo(15.1f, 16.5f)
            }
        }
        .build()
        return _arrowTopLeftThinCircleOutline!!
    }

private var _arrowTopLeftThinCircleOutline: ImageVector? = null

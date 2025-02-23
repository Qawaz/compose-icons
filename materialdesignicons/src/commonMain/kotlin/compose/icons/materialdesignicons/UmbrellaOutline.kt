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

public val MaterialDesignIcons.UmbrellaOutline: ImageVector
    get() {
        if (_umbrellaOutline != null) {
            return _umbrellaOutline!!
        }
        _umbrellaOutline = Builder(name = "UmbrellaOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(8.9f, 4.0f, 6.18f, 6.03f, 5.3f, 9.0f)
                horizontalLineTo(18.7f)
                curveTo(17.82f, 6.04f, 15.09f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 21.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _umbrellaOutline!!
    }

private var _umbrellaOutline: ImageVector? = null

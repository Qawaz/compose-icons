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

public val MaterialDesignIcons.Sack: ImageVector
    get() {
        if (_sack != null) {
            return _sack!!
        }
        _sack = Builder(name = "Sack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveTo(20.0f, 11.0f, 21.0f, 18.0f, 21.0f, 18.0f)
                curveTo(21.0f, 18.0f, 22.0f, 22.0f, 16.0f, 22.0f)
                curveTo(10.0f, 22.0f, 8.0f, 22.0f, 8.0f, 22.0f)
                curveTo(2.0f, 22.0f, 3.0f, 18.0f, 3.0f, 18.0f)
                curveTo(3.0f, 18.0f, 4.0f, 11.0f, 8.0f, 9.0f)
                moveTo(14.0f, 4.0f)
                lineTo(12.0f, 2.0f)
                lineTo(10.0f, 4.0f)
                lineTo(6.0f, 2.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineTo(16.0f)
                lineTo(18.0f, 2.0f)
                lineTo(14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _sack!!
    }

private var _sack: ImageVector? = null

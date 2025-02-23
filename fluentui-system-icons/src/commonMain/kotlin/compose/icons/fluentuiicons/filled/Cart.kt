package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Cart: ImageVector
    get() {
        if (_cart != null) {
            return _cart!!
        }
        _cart = Builder(name = "Cart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 4.25f)
                curveTo(2.5f, 3.8358f, 2.8358f, 3.5f, 3.25f, 3.5f)
                horizontalLineTo(3.8083f)
                curveTo(4.7587f, 3.5f, 5.3278f, 4.139f, 5.6533f, 4.733f)
                curveTo(5.8702f, 5.1289f, 6.0271f, 5.5882f, 6.1498f, 6.004f)
                curveTo(6.1831f, 6.0013f, 6.2167f, 6.0f, 6.2508f, 6.0f)
                horizontalLineTo(18.7481f)
                curveTo(19.5783f, 6.0f, 20.1778f, 6.7944f, 19.9502f, 7.5928f)
                lineTo(18.1224f, 14.0019f)
                curveTo(17.7856f, 15.1832f, 16.7062f, 15.9978f, 15.4779f, 15.9978f)
                horizontalLineTo(9.5298f)
                curveTo(8.2913f, 15.9978f, 7.2056f, 15.1699f, 6.8778f, 13.9756f)
                lineTo(6.1173f, 11.2045f)
                lineTo(4.8587f, 6.9558f)
                lineTo(4.8567f, 6.9483f)
                curveTo(4.701f, 6.3805f, 4.5549f, 5.85f, 4.3377f, 5.4537f)
                curveTo(4.1269f, 5.0688f, 3.9588f, 5.0f, 3.8083f, 5.0f)
                horizontalLineTo(3.25f)
                curveTo(2.8358f, 5.0f, 2.5f, 4.6642f, 2.5f, 4.25f)
                close()
                moveTo(9.0f, 21.0f)
                curveTo(10.1046f, 21.0f, 11.0f, 20.1046f, 11.0f, 19.0f)
                curveTo(11.0f, 17.8954f, 10.1046f, 17.0f, 9.0f, 17.0f)
                curveTo(7.8954f, 17.0f, 7.0f, 17.8954f, 7.0f, 19.0f)
                curveTo(7.0f, 20.1046f, 7.8954f, 21.0f, 9.0f, 21.0f)
                close()
                moveTo(16.0f, 21.0f)
                curveTo(17.1046f, 21.0f, 18.0f, 20.1046f, 18.0f, 19.0f)
                curveTo(18.0f, 17.8954f, 17.1046f, 17.0f, 16.0f, 17.0f)
                curveTo(14.8954f, 17.0f, 14.0f, 17.8954f, 14.0f, 19.0f)
                curveTo(14.0f, 20.1046f, 14.8954f, 21.0f, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _cart!!
    }

private var _cart: ImageVector? = null

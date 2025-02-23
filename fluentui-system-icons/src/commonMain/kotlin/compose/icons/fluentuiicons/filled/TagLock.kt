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

public val FilledGroup.TagLock: ImageVector
    get() {
        if (_tagLock != null) {
            return _tagLock!!
        }
        _tagLock = Builder(name = "TagLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7498f, 2.0f)
                curveTo(20.9925f, 2.0f, 21.9998f, 3.0074f, 21.9998f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(21.9998f, 10.5738f, 21.6575f, 11.4003f, 21.0482f, 12.0098f)
                lineTo(20.6285f, 12.4295f)
                curveTo(20.053f, 11.2852f, 18.8681f, 10.5f, 17.4998f, 10.5f)
                curveTo(15.5668f, 10.5f, 13.9998f, 12.067f, 13.9998f, 14.0f)
                verticalLineTo(14.05f)
                curveTo(12.8587f, 14.2816f, 11.9998f, 15.2905f, 11.9998f, 16.5f)
                verticalLineTo(20.953f)
                curveTo(10.7422f, 21.7574f, 9.0521f, 21.6114f, 7.9508f, 20.5143f)
                lineTo(3.4891f, 16.0592f)
                curveTo(2.2186f, 14.7913f, 2.217f, 12.7334f, 3.4853f, 11.4632f)
                lineTo(11.985f, 2.9533f)
                curveTo(12.5946f, 2.343f, 13.4218f, 2.0f, 14.2845f, 2.0f)
                horizontalLineTo(19.7498f)
                close()
                moveTo(16.9998f, 5.5022f)
                curveTo(16.1714f, 5.5022f, 15.4998f, 6.1737f, 15.4998f, 7.0022f)
                curveTo(15.4998f, 7.8306f, 16.1714f, 8.5021f, 16.9998f, 8.5021f)
                curveTo(17.8282f, 8.5021f, 18.4998f, 7.8306f, 18.4998f, 7.0022f)
                curveTo(18.4998f, 6.1737f, 17.8282f, 5.5022f, 16.9998f, 5.5022f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineTo(14.5f)
                curveTo(13.6716f, 15.0f, 13.0f, 15.6716f, 13.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(13.0f, 22.3284f, 13.6716f, 23.0f, 14.5f, 23.0f)
                horizontalLineTo(20.5f)
                curveTo(21.3284f, 23.0f, 22.0f, 22.3284f, 22.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(22.0f, 15.6716f, 21.3284f, 15.0f, 20.5f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 12.6193f, 18.8807f, 11.5f, 17.5f, 11.5f)
                curveTo(16.1193f, 11.5f, 15.0f, 12.6193f, 15.0f, 14.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveTo(16.5f, 13.4477f, 16.9477f, 13.0f, 17.5f, 13.0f)
                curveTo(18.0523f, 13.0f, 18.5f, 13.4477f, 18.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(18.5f, 19.0f)
                curveTo(18.5f, 19.5523f, 18.0523f, 20.0f, 17.5f, 20.0f)
                curveTo(16.9477f, 20.0f, 16.5f, 19.5523f, 16.5f, 19.0f)
                curveTo(16.5f, 18.4477f, 16.9477f, 18.0f, 17.5f, 18.0f)
                curveTo(18.0523f, 18.0f, 18.5f, 18.4477f, 18.5f, 19.0f)
                close()
            }
        }
        .build()
        return _tagLock!!
    }

private var _tagLock: ImageVector? = null

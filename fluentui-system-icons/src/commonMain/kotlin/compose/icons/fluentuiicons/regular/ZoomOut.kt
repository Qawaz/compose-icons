package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 9.25f)
                curveTo(13.1642f, 9.25f, 13.5f, 9.5858f, 13.5f, 10.0f)
                curveTo(13.5f, 10.4142f, 13.1642f, 10.75f, 12.75f, 10.75f)
                horizontalLineTo(7.25f)
                curveTo(6.8358f, 10.75f, 6.5f, 10.4142f, 6.5f, 10.0f)
                curveTo(6.5f, 9.5858f, 6.8358f, 9.25f, 7.25f, 9.25f)
                horizontalLineTo(12.75f)
                close()
                moveTo(17.25f, 10.0f)
                curveTo(17.25f, 5.9959f, 14.0041f, 2.75f, 10.0f, 2.75f)
                curveTo(5.9959f, 2.75f, 2.75f, 5.9959f, 2.75f, 10.0f)
                curveTo(2.75f, 14.0041f, 5.9959f, 17.25f, 10.0f, 17.25f)
                curveTo(11.7319f, 17.25f, 13.3219f, 16.6427f, 14.5688f, 15.6295f)
                lineTo(19.4697f, 20.5303f)
                lineTo(19.5538f, 20.6029f)
                curveTo(19.8474f, 20.8208f, 20.2641f, 20.7966f, 20.5303f, 20.5303f)
                curveTo(20.8232f, 20.2374f, 20.8232f, 19.7626f, 20.5303f, 19.4697f)
                lineTo(15.6295f, 14.5688f)
                curveTo(16.6427f, 13.3219f, 17.25f, 11.7319f, 17.25f, 10.0f)
                close()
                moveTo(4.25f, 10.0f)
                curveTo(4.25f, 6.8244f, 6.8244f, 4.25f, 10.0f, 4.25f)
                curveTo(13.1756f, 4.25f, 15.75f, 6.8244f, 15.75f, 10.0f)
                curveTo(15.75f, 13.1756f, 13.1756f, 15.75f, 10.0f, 15.75f)
                curveTo(6.8244f, 15.75f, 4.25f, 13.1756f, 4.25f, 10.0f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null

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

public val FilledGroup.DocumentToolbox: ImageVector
    get() {
        if (_documentToolbox != null) {
            return _documentToolbox!!
        }
        _documentToolbox = Builder(name = "DocumentToolbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.5f)
                curveTo(20.0f, 21.3284f, 19.3284f, 22.0f, 18.5f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.9985f)
                curveTo(13.0f, 15.8939f, 12.1046f, 15.0f, 11.0f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0001f)
                curveTo(10.0f, 12.8955f, 9.1046f, 12.0f, 8.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                curveTo(4.6357f, 12.0f, 4.2942f, 12.0974f, 4.0f, 12.2676f)
                verticalLineTo(3.5f)
                curveTo(4.0f, 2.6716f, 4.6716f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8.0f)
                curveTo(13.5f, 8.2761f, 13.7239f, 8.5f, 14.0f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(4.0f, 13.6716f, 4.6716f, 13.0f, 5.5f, 13.0f)
                horizontalLineTo(7.5f)
                curveTo(8.3284f, 13.0f, 9.0f, 13.6716f, 9.0f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.5f)
                curveTo(11.3284f, 16.0f, 12.0f, 16.6716f, 12.0f, 17.5f)
                lineTo(12.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.5f)
                curveTo(9.0f, 18.2239f, 8.7761f, 18.0f, 8.5f, 18.0f)
                curveTo(8.2239f, 18.0f, 8.0f, 18.2239f, 8.0f, 18.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.5f)
                curveTo(5.0f, 18.2239f, 4.7761f, 18.0f, 4.5f, 18.0f)
                curveTo(4.2239f, 18.0f, 4.0f, 18.2239f, 4.0f, 18.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.5f)
                curveTo(1.0f, 16.6716f, 1.6716f, 16.0f, 2.5f, 16.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(5.0f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                curveTo(8.0f, 14.2239f, 7.7761f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(5.5f)
                curveTo(5.2239f, 14.0f, 5.0f, 14.2239f, 5.0f, 14.5f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineTo(12.0f)
                lineTo(12.0f, 21.5f)
                curveTo(12.0f, 22.3284f, 11.3284f, 23.0f, 10.5f, 23.0f)
                horizontalLineTo(2.5f)
                curveTo(1.6716f, 23.0f, 1.0f, 22.3284f, 1.0f, 21.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.5f)
                curveTo(4.0f, 20.7761f, 4.2239f, 21.0f, 4.5f, 21.0f)
                curveTo(4.7761f, 21.0f, 5.0f, 20.7761f, 5.0f, 20.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.5f)
                curveTo(8.0f, 20.7761f, 8.2239f, 21.0f, 8.5f, 21.0f)
                curveTo(8.7761f, 21.0f, 9.0f, 20.7761f, 9.0f, 20.5f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _documentToolbox!!
    }

private var _documentToolbox: ImageVector? = null

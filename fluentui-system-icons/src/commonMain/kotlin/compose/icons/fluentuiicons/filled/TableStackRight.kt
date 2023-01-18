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

public val FilledGroup.TableStackRight: ImageVector
    get() {
        if (_tableStackRight != null) {
            return _tableStackRight!!
        }
        _tableStackRight = Builder(name = "TableStackRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(8.0f, 9.5f)
                lineTo(3.0f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 9.5f)
                close()
                moveTo(9.5f, 14.5f)
                lineTo(9.5f, 9.5f)
                lineTo(14.5f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 16.0f)
                close()
                moveTo(9.5f, 21.0f)
                lineTo(9.5f, 16.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.25f)
                curveTo(14.5f, 20.4489f, 14.421f, 20.6397f, 14.2803f, 20.7803f)
                curveTo(14.1397f, 20.921f, 13.9489f, 21.0f, 13.75f, 21.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(9.5f, 8.0f)
                lineTo(9.5f, 3.0f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 3.0f, 14.5f, 3.3358f, 14.5f, 3.75f)
                verticalLineTo(8.0f)
                lineTo(9.5f, 8.0f)
                close()
                moveTo(19.5f, 20.25f)
                curveTo(19.5f, 20.6642f, 19.8358f, 21.0f, 20.25f, 21.0f)
                curveTo(20.6642f, 21.0f, 21.0f, 20.6642f, 21.0f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(21.0f, 3.3358f, 20.6642f, 3.0f, 20.25f, 3.0f)
                curveTo(19.8358f, 3.0f, 19.5f, 3.3358f, 19.5f, 3.75f)
                verticalLineTo(20.25f)
                close()
            }
        }
        .build()
        return _tableStackRight!!
    }

private var _tableStackRight: ImageVector? = null

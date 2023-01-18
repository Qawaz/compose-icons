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

public val RegularGroup.TableCellsSplit: ImageVector
    get() {
        if (_tableCellsSplit != null) {
            return _tableCellsSplit!!
        }
        _tableCellsSplit = Builder(name = "TableCellsSplit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.5f, 16.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(16.5f)
                close()
                moveTo(19.5f, 6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.5f, 16.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(4.5f)
                close()
                moveTo(4.5f, 15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _tableCellsSplit!!
    }

private var _tableCellsSplit: ImageVector? = null

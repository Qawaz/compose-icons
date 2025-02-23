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

public val FilledGroup.TextColumnOneNarrow: ImageVector
    get() {
        if (_textColumnOneNarrow != null) {
            return _textColumnOneNarrow!!
        }
        _textColumnOneNarrow = Builder(name = "TextColumnOneNarrow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                curveTo(8.4477f, 5.0f, 8.0f, 5.4477f, 8.0f, 6.0f)
                curveTo(8.0f, 6.5523f, 8.4477f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 7.0f, 16.0f, 6.5523f, 16.0f, 6.0f)
                curveTo(16.0f, 5.4477f, 15.5523f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(8.4477f, 9.0f, 8.0f, 9.4477f, 8.0f, 10.0f)
                curveTo(8.0f, 10.5523f, 8.4477f, 11.0f, 9.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 11.0f, 16.0f, 10.5523f, 16.0f, 10.0f)
                curveTo(16.0f, 9.4477f, 15.5523f, 9.0f, 15.0f, 9.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(8.0f, 13.4477f, 8.4477f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 13.0f, 16.0f, 13.4477f, 16.0f, 14.0f)
                curveTo(16.0f, 14.5523f, 15.5523f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 15.0f, 8.0f, 14.5523f, 8.0f, 14.0f)
                close()
                moveTo(9.0f, 17.0f)
                curveTo(8.4477f, 17.0f, 8.0f, 17.4477f, 8.0f, 18.0f)
                curveTo(8.0f, 18.5523f, 8.4477f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 19.0f, 16.0f, 18.5523f, 16.0f, 18.0f)
                curveTo(16.0f, 17.4477f, 15.5523f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _textColumnOneNarrow!!
    }

private var _textColumnOneNarrow: ImageVector? = null

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

public val FilledGroup.TetrisApp: ImageVector
    get() {
        if (_tetrisApp != null) {
            return _tetrisApp!!
        }
        _tetrisApp = Builder(name = "TetrisApp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(8.0f, 2.4477f, 8.4477f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(3.0f, 8.0f)
                curveTo(2.4477f, 8.0f, 2.0f, 8.4477f, 2.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(18.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 7.0f, 19.0f, 6.5523f, 19.0f, 6.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 2.4477f, 18.5523f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(4.0f, 17.0f)
                curveTo(4.0f, 16.4477f, 4.4477f, 16.0f, 5.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0f, 4.0f, 20.5523f, 4.0f, 20.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveTo(16.4477f, 10.0f, 16.0f, 10.4477f, 16.0f, 11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 10.4477f, 20.5523f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _tetrisApp!!
    }

private var _tetrisApp: ImageVector? = null

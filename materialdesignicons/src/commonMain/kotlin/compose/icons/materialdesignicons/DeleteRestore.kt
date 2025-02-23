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

public val MaterialDesignIcons.DeleteRestore: ImageVector
    get() {
        if (_deleteRestore != null) {
            return _deleteRestore!!
        }
        _deleteRestore = Builder(name = "DeleteRestore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 10.0f)
                lineTo(8.0f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 19.5f, 17.8f, 20.0f, 17.39f, 20.39f)
                curveTo(17.0f, 20.8f, 16.5f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(7.5f, 21.0f, 7.0f, 20.8f, 6.61f, 20.39f)
                curveTo(6.2f, 20.0f, 6.0f, 19.5f, 6.0f, 19.0f)
                verticalLineTo(7.0f)
                moveTo(19.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 3.0f)
                horizontalLineTo(14.5f)
                lineTo(15.5f, 4.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _deleteRestore!!
    }

private var _deleteRestore: ImageVector? = null

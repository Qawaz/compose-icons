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

public val MaterialDesignIcons.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = Builder(name = "Projector", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(14.87f, 6.0f, 13.77f, 6.35f, 12.84f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 7.0f, 2.0f, 7.89f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.11f, 2.89f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 19.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 17.0f, 22.0f, 16.11f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 7.89f, 21.11f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(19.15f)
                curveTo(18.23f, 6.35f, 17.13f, 6.0f, 16.0f, 6.0f)
                moveTo(16.0f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 19.5f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 16.0f, 14.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.5f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 16.0f, 7.5f)
                moveTo(4.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                moveTo(16.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 9.0f)
                moveTo(4.0f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                moveTo(4.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _projector!!
    }

private var _projector: ImageVector? = null

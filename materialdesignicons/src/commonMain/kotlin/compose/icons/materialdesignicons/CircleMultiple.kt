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

public val MaterialDesignIcons.CircleMultiple: ImageVector
    get() {
        if (_circleMultiple != null) {
            return _circleMultiple!!
        }
        _circleMultiple = Builder(name = "CircleMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 7.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 15.0f, 4.0f)
                moveTo(3.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 17.65f)
                verticalLineTo(19.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 7.0f, 4.26f)
                verticalLineTo(6.35f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _circleMultiple!!
    }

private var _circleMultiple: ImageVector? = null

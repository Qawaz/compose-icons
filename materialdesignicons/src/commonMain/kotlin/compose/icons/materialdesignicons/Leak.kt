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

public val MaterialDesignIcons.Leak: ImageVector
    get() {
        if (_leak != null) {
            return _leak!!
        }
        _leak = Builder(name = "Leak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 3.0f)
                moveTo(14.0f, 3.0f)
                horizontalLineTo(12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(9.08f, 14.0f, 14.0f, 9.07f, 14.0f, 3.0f)
                moveTo(10.0f, 3.0f)
                horizontalLineTo(8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 3.0f, 8.0f)
                verticalLineTo(10.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 10.0f, 3.0f)
                moveTo(10.0f, 21.0f)
                horizontalLineTo(12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 21.0f, 12.0f)
                verticalLineTo(10.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 10.0f, 21.0f)
                moveTo(18.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 21.0f)
                moveTo(14.0f, 21.0f)
                horizontalLineTo(16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 21.0f, 16.0f)
                verticalLineTo(14.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 14.0f, 21.0f)
                close()
            }
        }
        .build()
        return _leak!!
    }

private var _leak: ImageVector? = null

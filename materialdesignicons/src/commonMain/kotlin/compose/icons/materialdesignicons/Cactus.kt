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

public val MaterialDesignIcons.Cactus: ImageVector
    get() {
        if (_cactus != null) {
            return _cactus!!
        }
        _cactus = Builder(name = "Cactus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 15.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(8.0f, 15.56f, 8.45f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 13.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 11.0f)
                verticalLineTo(13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 16.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _cactus!!
    }

private var _cactus: ImageVector? = null

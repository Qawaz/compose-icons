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

public val MaterialDesignIcons.LightbulbSpot: ImageVector
    get() {
        if (_lightbulbSpot != null) {
            return _lightbulbSpot!!
        }
        _lightbulbSpot = Builder(name = "LightbulbSpot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 19.0f)
                moveTo(13.0f, 22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                moveTo(2.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                moveTo(9.0f, 14.0f)
                lineTo(9.0f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                curveTo(17.5f, 12.57f, 20.0f, 11.0f, 20.0f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 11.0f, 6.5f, 12.57f, 9.0f, 14.0f)
                close()
            }
        }
        .build()
        return _lightbulbSpot!!
    }

private var _lightbulbSpot: ImageVector? = null

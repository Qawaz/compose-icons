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

public val MaterialDesignIcons.BowlMix: ImageVector
    get() {
        if (_bowlMix != null) {
            return _bowlMix!!
        }
        _bowlMix = Builder(name = "BowlMix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2f, 11.0f)
                lineTo(20.3f, 4.5f)
                lineTo(22.0f, 5.5f)
                lineTo(18.6f, 11.0f)
                horizontalLineTo(16.2f)
                moveTo(15.6f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 18.9f, 5.1f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(18.9f, 22.0f, 22.0f, 18.9f, 22.0f, 15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.6f)
                close()
            }
        }
        .build()
        return _bowlMix!!
    }

private var _bowlMix: ImageVector? = null

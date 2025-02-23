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

public val MaterialDesignIcons.ShieldRemoveOutline: ImageVector
    get() {
        if (_shieldRemoveOutline != null) {
            return _shieldRemoveOutline!!
        }
        _shieldRemoveOutline = Builder(name = "ShieldRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.43f, 19.0f)
                lineTo(21.5f, 21.11f)
                lineTo(20.12f, 22.5f)
                lineTo(18.03f, 20.41f)
                lineTo(15.91f, 22.53f)
                lineTo(14.5f, 21.11f)
                lineTo(16.61f, 19.0f)
                lineTo(14.5f, 16.86f)
                lineTo(15.88f, 15.47f)
                lineTo(18.0f, 17.59f)
                lineTo(20.12f, 15.47f)
                lineTo(21.55f, 16.9f)
                lineTo(19.43f, 19.0f)
                moveTo(21.0f, 11.0f)
                curveTo(21.0f, 11.9f, 20.9f, 12.78f, 20.71f, 13.65f)
                curveTo(20.13f, 13.35f, 19.5f, 13.15f, 18.81f, 13.05f)
                curveTo(18.93f, 12.45f, 19.0f, 11.83f, 19.0f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.18f)
                lineTo(5.0f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5.0f, 15.54f, 8.25f, 20.0f, 12.0f, 21.0f)
                lineTo(12.31f, 20.91f)
                curveTo(12.5f, 21.53f, 12.83f, 22.11f, 13.22f, 22.62f)
                lineTo(12.0f, 23.0f)
                curveTo(6.84f, 21.74f, 3.0f, 16.55f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _shieldRemoveOutline!!
    }

private var _shieldRemoveOutline: ImageVector? = null

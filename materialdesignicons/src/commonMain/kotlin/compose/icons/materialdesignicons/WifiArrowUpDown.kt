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

public val MaterialDesignIcons.WifiArrowUpDown: ImageVector
    get() {
        if (_wifiArrowUpDown != null) {
            return _wifiArrowUpDown!!
        }
        _wifiArrowUpDown = Builder(name = "WifiArrowUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(9.97f, 12.0f, 8.1f, 12.67f, 6.6f, 13.8f)
                lineTo(4.8f, 11.4f)
                curveTo(6.81f, 9.89f, 9.3f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(17.19f, 9.89f, 19.2f, 11.4f)
                lineTo(17.92f, 13.1f)
                curveTo(17.55f, 13.17f, 17.18f, 13.27f, 16.84f, 13.41f)
                curveTo(15.44f, 12.5f, 13.78f, 12.0f, 12.0f, 12.0f)
                moveTo(21.0f, 9.0f)
                lineTo(22.8f, 6.6f)
                curveTo(19.79f, 4.34f, 16.05f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.21f, 4.34f, 1.2f, 6.6f)
                lineTo(3.0f, 9.0f)
                curveTo(5.5f, 7.12f, 8.62f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(18.5f, 7.12f, 21.0f, 9.0f)
                moveTo(12.0f, 15.0f)
                curveTo(10.65f, 15.0f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12.0f, 21.0f)
                lineTo(13.04f, 19.61f)
                curveTo(13.0f, 19.41f, 13.0f, 19.21f, 13.0f, 19.0f)
                curveTo(13.0f, 17.66f, 13.44f, 16.43f, 14.19f, 15.43f)
                curveTo(13.5f, 15.16f, 12.77f, 15.0f, 12.0f, 15.0f)
                moveTo(17.0f, 15.0f)
                lineTo(14.5f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.5f)
                lineTo(17.0f, 15.0f)
                moveTo(22.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.5f)
                lineTo(21.0f, 23.0f)
                lineTo(23.5f, 20.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _wifiArrowUpDown!!
    }

private var _wifiArrowUpDown: ImageVector? = null

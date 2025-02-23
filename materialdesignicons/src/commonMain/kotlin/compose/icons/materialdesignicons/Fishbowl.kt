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

public val MaterialDesignIcons.Fishbowl: ImageVector
    get() {
        if (_fishbowl != null) {
            return _fishbowl!!
        }
        _fishbowl = Builder(name = "Fishbowl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.11f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.89f)
                curveTo(3.11f, 6.8f, 2.0f, 9.27f, 2.0f, 12.0f)
                curveTo(2.0f, 15.97f, 4.31f, 19.39f, 7.66f, 21.0f)
                horizontalLineTo(16.34f)
                curveTo(19.69f, 19.39f, 22.0f, 15.97f, 22.0f, 12.0f)
                curveTo(22.0f, 9.27f, 20.89f, 6.8f, 19.11f, 5.0f)
                moveTo(13.25f, 17.0f)
                curveTo(12.09f, 17.0f, 11.06f, 16.64f, 10.33f, 16.17f)
                curveTo(9.67f, 17.0f, 8.33f, 17.0f, 7.0f, 17.0f)
                curveTo(8.1f, 17.0f, 8.5f, 15.88f, 8.5f, 14.5f)
                curveTo(8.5f, 13.12f, 8.1f, 12.0f, 7.0f, 12.0f)
                curveTo(8.33f, 12.0f, 9.67f, 12.0f, 10.37f, 12.91f)
                curveTo(11.06f, 12.36f, 12.09f, 12.0f, 13.25f, 12.0f)
                curveTo(15.32f, 12.0f, 17.0f, 13.12f, 17.0f, 14.5f)
                curveTo(17.0f, 15.88f, 15.32f, 17.0f, 13.25f, 17.0f)
                moveTo(16.0f, 7.0f)
                curveTo(13.56f, 8.71f, 10.44f, 8.71f, 8.0f, 7.0f)
                curveTo(7.06f, 7.66f, 6.0f, 8.09f, 4.95f, 8.25f)
                curveTo(5.31f, 7.58f, 5.77f, 6.96f, 6.32f, 6.41f)
                lineTo(7.7f, 5.0f)
                horizontalLineTo(16.3f)
                lineTo(17.68f, 6.41f)
                curveTo(18.23f, 6.96f, 18.69f, 7.58f, 19.05f, 8.25f)
                curveTo(18.0f, 8.09f, 16.94f, 7.66f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _fishbowl!!
    }

private var _fishbowl: ImageVector? = null

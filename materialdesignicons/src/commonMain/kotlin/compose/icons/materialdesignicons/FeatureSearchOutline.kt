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

public val MaterialDesignIcons.FeatureSearchOutline: ImageVector
    get() {
        if (_featureSearchOutline != null) {
            return _featureSearchOutline!!
        }
        _featureSearchOutline = Builder(name = "FeatureSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 2.0f)
                curveTo(13.0f, 2.0f, 11.0f, 4.0f, 11.0f, 6.5f)
                curveTo(11.0f, 9.0f, 13.0f, 11.0f, 15.5f, 11.0f)
                curveTo(16.4f, 11.0f, 17.2f, 10.7f, 17.9f, 10.3f)
                lineTo(21.0f, 13.4f)
                lineTo(22.4f, 12.0f)
                lineTo(19.3f, 8.9f)
                curveTo(19.7f, 8.2f, 20.0f, 7.4f, 20.0f, 6.5f)
                curveTo(20.0f, 4.0f, 18.0f, 2.0f, 15.5f, 2.0f)
                moveTo(4.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(15.0f)
                lineTo(18.0f, 13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.03f)
                curveTo(9.09f, 5.3f, 9.26f, 4.65f, 9.5f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(15.5f, 4.0f)
                curveTo(16.9f, 4.0f, 18.0f, 5.1f, 18.0f, 6.5f)
                curveTo(18.0f, 7.9f, 16.9f, 9.0f, 15.5f, 9.0f)
                curveTo(14.1f, 9.0f, 13.0f, 7.9f, 13.0f, 6.5f)
                curveTo(13.0f, 5.1f, 14.1f, 4.0f, 15.5f, 4.0f)
                close()
            }
        }
        .build()
        return _featureSearchOutline!!
    }

private var _featureSearchOutline: ImageVector? = null

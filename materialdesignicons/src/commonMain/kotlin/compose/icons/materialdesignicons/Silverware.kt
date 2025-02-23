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

public val MaterialDesignIcons.Silverware: ImageVector
    get() {
        if (_silverware != null) {
            return _silverware!!
        }
        _silverware = Builder(name = "Silverware", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1f, 13.34f)
                lineTo(3.91f, 9.16f)
                curveTo(2.35f, 7.59f, 2.35f, 5.06f, 3.91f, 3.5f)
                lineTo(10.93f, 10.5f)
                lineTo(8.1f, 13.34f)
                moveTo(14.88f, 11.53f)
                lineTo(13.41f, 13.0f)
                lineTo(20.29f, 19.88f)
                lineTo(18.88f, 21.29f)
                lineTo(12.0f, 14.41f)
                lineTo(5.12f, 21.29f)
                lineTo(3.71f, 19.88f)
                lineTo(13.47f, 10.12f)
                curveTo(12.76f, 8.59f, 13.26f, 6.44f, 14.85f, 4.85f)
                curveTo(16.76f, 2.93f, 19.5f, 2.57f, 20.96f, 4.03f)
                curveTo(22.43f, 5.5f, 22.07f, 8.24f, 20.15f, 10.15f)
                curveTo(18.56f, 11.74f, 16.41f, 12.24f, 14.88f, 11.53f)
                close()
            }
        }
        .build()
        return _silverware!!
    }

private var _silverware: ImageVector? = null

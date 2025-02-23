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

public val MaterialDesignIcons.EmailAlert: ImageVector
    get() {
        if (_emailAlert != null) {
            return _emailAlert!!
        }
        _emailAlert = Builder(name = "EmailAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                lineTo(10.0f, 13.0f)
                lineTo(2.0f, 8.0f)
                verticalLineTo(6.0f)
                lineTo(10.0f, 11.0f)
                lineTo(18.0f, 6.0f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(2.0f)
                curveTo(0.9f, 4.0f, 0.0f, 4.9f, 0.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(0.0f, 19.1f, 0.9f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 20.0f, 20.0f, 19.1f, 20.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.9f, 19.1f, 4.0f, 18.0f, 4.0f)
                moveTo(24.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(7.0f)
                moveTo(24.0f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _emailAlert!!
    }

private var _emailAlert: ImageVector? = null

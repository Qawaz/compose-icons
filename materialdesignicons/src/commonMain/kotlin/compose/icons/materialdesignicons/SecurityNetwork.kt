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

public val MaterialDesignIcons.SecurityNetwork: ImageVector
    get() {
        if (_securityNetwork != null) {
            return _securityNetwork!!
        }
        _securityNetwork = Builder(name = "SecurityNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.34f)
                curveTo(8.07f, 16.13f, 6.0f, 13.0f, 6.0f, 9.67f)
                verticalLineTo(5.67f)
                lineTo(12.0f, 3.0f)
                lineTo(18.0f, 5.67f)
                verticalLineTo(9.67f)
                curveTo(18.0f, 13.0f, 15.93f, 16.13f, 13.0f, 17.34f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 5.0f)
                lineTo(8.0f, 6.69f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                moveTo(12.0f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(13.91f, 15.53f, 16.0f, 13.06f, 16.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _securityNetwork!!
    }

private var _securityNetwork: ImageVector? = null

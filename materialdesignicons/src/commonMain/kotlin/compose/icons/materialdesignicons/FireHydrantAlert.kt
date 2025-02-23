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

public val MaterialDesignIcons.FireHydrantAlert: ImageVector
    get() {
        if (_fireHydrantAlert != null) {
            return _fireHydrantAlert!!
        }
        _fireHydrantAlert = Builder(name = "FireHydrantAlert", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                moveTo(22.0f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                moveTo(3.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                moveTo(17.0f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                moveTo(16.0f, 6.0f)
                horizontalLineTo(13.86f)
                curveTo(13.5f, 4.6f, 12.4f, 3.5f, 11.0f, 3.14f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.14f)
                curveTo(7.6f, 3.5f, 6.5f, 4.6f, 6.14f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                moveTo(16.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 20.9f, 4.89f, 20.0f, 6.0f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                curveTo(15.11f, 20.0f, 16.0f, 20.9f, 16.0f, 22.0f)
                moveTo(8.0f, 13.0f)
                curveTo(8.0f, 14.11f, 8.9f, 15.0f, 10.0f, 15.0f)
                reflectiveCurveTo(12.0f, 14.11f, 12.0f, 13.0f)
                reflectiveCurveTo(11.11f, 11.0f, 10.0f, 11.0f)
                reflectiveCurveTo(8.0f, 11.9f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _fireHydrantAlert!!
    }

private var _fireHydrantAlert: ImageVector? = null

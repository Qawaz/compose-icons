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

public val MaterialDesignIcons.AccountLockOutline: ImageVector
    get() {
        if (_accountLockOutline != null) {
            return _accountLockOutline!!
        }
        _accountLockOutline = Builder(name = "AccountLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(12.21f, 12.0f, 14.0f, 10.21f, 14.0f, 8.0f)
                reflectiveCurveTo(12.21f, 4.0f, 10.0f, 4.0f)
                reflectiveCurveTo(6.0f, 5.79f, 6.0f, 8.0f)
                reflectiveCurveTo(7.79f, 12.0f, 10.0f, 12.0f)
                moveTo(10.0f, 6.0f)
                curveTo(11.11f, 6.0f, 12.0f, 6.9f, 12.0f, 8.0f)
                reflectiveCurveTo(11.11f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveTo(8.0f, 9.11f, 8.0f, 8.0f)
                reflectiveCurveTo(8.9f, 6.0f, 10.0f, 6.0f)
                moveTo(12.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 14.33f, 7.33f, 13.0f, 10.0f, 13.0f)
                curveTo(11.0f, 13.0f, 12.38f, 13.19f, 13.71f, 13.56f)
                curveTo(13.41f, 14.12f, 13.23f, 14.74f, 13.21f, 15.39f)
                curveTo(12.23f, 15.1f, 11.11f, 14.9f, 10.0f, 14.9f)
                curveTo(7.03f, 14.9f, 3.9f, 16.36f, 3.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 18.13f, 12.0f, 18.17f, 12.0f, 18.2f)
                verticalLineTo(20.0f)
                moveTo(20.8f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13.0f, 18.0f, 13.0f)
                curveTo(16.6f, 13.0f, 15.2f, 14.1f, 15.2f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(14.6f, 17.0f, 14.0f, 17.6f, 14.0f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14.0f, 22.4f, 14.6f, 23.0f, 15.2f, 23.0f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23.0f, 22.0f, 22.4f, 22.0f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22.0f, 17.6f, 21.4f, 17.0f, 20.8f, 17.0f)
                moveTo(19.5f, 17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                curveTo(16.5f, 14.7f, 17.2f, 14.2f, 18.0f, 14.2f)
                curveTo(18.8f, 14.2f, 19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _accountLockOutline!!
    }

private var _accountLockOutline: ImageVector? = null

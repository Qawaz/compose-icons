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

public val MaterialDesignIcons.DatabaseArrowUp: ImageVector
    get() {
        if (_databaseArrowUp != null) {
            return _databaseArrowUp!!
        }
        _databaseArrowUp = Builder(name = "DatabaseArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveTo(16.83f, 13.0f, 14.93f, 14.16f, 13.88f, 15.89f)
                curveTo(13.28f, 15.96f, 12.65f, 16.0f, 12.0f, 16.0f)
                curveTo(7.58f, 16.0f, 4.0f, 14.21f, 4.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 11.21f, 7.58f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(20.0f, 11.21f, 20.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 12.36f, 19.9f, 12.71f, 19.72f, 13.05f)
                curveTo(19.5f, 13.0f, 19.24f, 13.0f, 19.0f, 13.0f)
                moveTo(12.0f, 11.0f)
                curveTo(16.42f, 11.0f, 20.0f, 9.21f, 20.0f, 7.0f)
                reflectiveCurveTo(16.42f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.79f, 4.0f, 7.0f)
                reflectiveCurveTo(7.58f, 11.0f, 12.0f, 11.0f)
                moveTo(13.1f, 17.96f)
                curveTo(12.74f, 18.0f, 12.37f, 18.0f, 12.0f, 18.0f)
                curveTo(7.58f, 18.0f, 4.0f, 16.21f, 4.0f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.58f, 21.0f, 12.0f, 21.0f)
                curveTo(12.46f, 21.0f, 12.9f, 21.0f, 13.33f, 20.94f)
                curveTo(13.12f, 20.33f, 13.0f, 19.68f, 13.0f, 19.0f)
                curveTo(13.0f, 18.64f, 13.04f, 18.3f, 13.1f, 17.96f)
                moveTo(19.0f, 15.0f)
                lineTo(16.0f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                lineTo(19.0f, 15.0f)
                close()
            }
        }
        .build()
        return _databaseArrowUp!!
    }

private var _databaseArrowUp: ImageVector? = null

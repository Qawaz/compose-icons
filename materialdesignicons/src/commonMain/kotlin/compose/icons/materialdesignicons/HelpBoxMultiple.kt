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

public val MaterialDesignIcons.HelpBoxMultiple: ImageVector
    get() {
        if (_helpBoxMultiple != null) {
            return _helpBoxMultiple!!
        }
        _helpBoxMultiple = Builder(name = "HelpBoxMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.1f, 6.9f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 18.0f, 22.0f, 17.1f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(15.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                moveTo(16.8f, 8.8f)
                curveTo(16.5f, 9.2f, 16.1f, 9.5f, 15.7f, 9.7f)
                curveTo(15.5f, 9.9f, 15.3f, 10.0f, 15.2f, 10.2f)
                curveTo(15.0f, 10.4f, 15.0f, 10.7f, 15.0f, 11.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 10.5f, 13.1f, 10.1f, 13.3f, 9.8f)
                curveTo(13.5f, 9.5f, 13.8f, 9.2f, 14.3f, 8.9f)
                curveTo(14.6f, 8.7f, 14.8f, 8.5f, 14.9f, 8.3f)
                curveTo(15.1f, 8.1f, 15.1f, 7.8f, 15.1f, 7.5f)
                curveTo(15.1f, 7.2f, 15.0f, 6.9f, 14.8f, 6.7f)
                curveTo(14.6f, 6.5f, 14.4f, 6.4f, 14.0f, 6.4f)
                curveTo(13.7f, 6.4f, 13.5f, 6.5f, 13.3f, 6.6f)
                curveTo(13.1f, 6.8f, 13.0f, 7.0f, 13.0f, 7.3f)
                horizontalLineTo(11.1f)
                curveTo(11.1f, 6.5f, 11.3f, 5.9f, 11.9f, 5.5f)
                curveTo(12.6f, 5.2f, 13.3f, 5.0f, 14.2f, 5.0f)
                curveTo(15.1f, 5.0f, 15.9f, 5.2f, 16.4f, 5.7f)
                curveTo(16.9f, 6.2f, 17.2f, 6.8f, 17.2f, 7.5f)
                curveTo(17.2f, 8.0f, 17.0f, 8.4f, 16.8f, 8.8f)
                close()
            }
        }
        .build()
        return _helpBoxMultiple!!
    }

private var _helpBoxMultiple: ImageVector? = null

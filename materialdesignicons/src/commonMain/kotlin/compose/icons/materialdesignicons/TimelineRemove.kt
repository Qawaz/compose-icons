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

public val MaterialDesignIcons.TimelineRemove: ImageVector
    get() {
        if (_timelineRemove != null) {
            return _timelineRemove!!
        }
        _timelineRemove = Builder(name = "TimelineRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                moveTo(2.0f, 22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                moveTo(3.0f, 10.0f)
                curveTo(1.9f, 10.0f, 1.0f, 10.9f, 1.0f, 12.0f)
                curveTo(1.0f, 13.11f, 1.9f, 14.0f, 3.0f, 14.0f)
                curveTo(4.11f, 14.0f, 5.0f, 13.11f, 5.0f, 12.0f)
                curveTo(5.0f, 10.9f, 4.11f, 10.0f, 3.0f, 10.0f)
                moveTo(24.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(24.0f, 19.11f, 23.11f, 20.0f, 22.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 20.0f, 8.0f, 19.11f, 8.0f, 18.0f)
                verticalLineTo(14.0f)
                lineTo(6.0f, 12.0f)
                lineTo(8.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 4.89f, 8.9f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(22.0f)
                curveTo(23.11f, 4.0f, 24.0f, 4.89f, 24.0f, 6.0f)
                moveTo(17.41f, 12.0f)
                lineTo(19.53f, 9.88f)
                lineTo(18.12f, 8.47f)
                lineTo(16.0f, 10.59f)
                lineTo(13.88f, 8.47f)
                lineTo(12.47f, 9.88f)
                lineTo(14.59f, 12.0f)
                lineTo(12.47f, 14.12f)
                lineTo(13.88f, 15.53f)
                lineTo(16.0f, 13.41f)
                lineTo(18.12f, 15.53f)
                lineTo(19.53f, 14.12f)
                lineTo(17.41f, 12.0f)
                close()
            }
        }
        .build()
        return _timelineRemove!!
    }

private var _timelineRemove: ImageVector? = null

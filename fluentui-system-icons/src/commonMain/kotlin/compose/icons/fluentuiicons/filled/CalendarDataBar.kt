package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CalendarDataBar: ImageVector
    get() {
        if (_calendarDataBar != null) {
            return _calendarDataBar!!
        }
        _calendarDataBar = Builder(name = "CalendarDataBar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.5f)
                verticalLineTo(13.05f)
                curveTo(20.6306f, 13.125f, 20.2907f, 13.2815f, 20.0f, 13.4998f)
                curveTo(19.9999f, 12.1192f, 18.8807f, 11.0f, 17.5f, 11.0f)
                curveTo(16.1193f, 11.0f, 15.0f, 12.1193f, 15.0f, 13.5f)
                verticalLineTo(15.4998f)
                curveTo(14.5822f, 15.186f, 14.0628f, 15.0f, 13.5f, 15.0f)
                curveTo(12.1193f, 15.0f, 11.0f, 16.1193f, 11.0f, 17.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(21.0f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(16.6716f, 12.0f, 16.0f, 12.6716f, 16.0f, 13.5f)
                verticalLineTo(21.5f)
                curveTo(16.0f, 22.3284f, 16.6716f, 23.0f, 17.5f, 23.0f)
                curveTo(18.3284f, 23.0f, 19.0f, 22.3284f, 19.0f, 21.5f)
                verticalLineTo(13.5f)
                curveTo(19.0f, 12.6716f, 18.3284f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(13.5f, 16.0f)
                curveTo(12.6716f, 16.0f, 12.0f, 16.6716f, 12.0f, 17.5f)
                verticalLineTo(21.5f)
                curveTo(12.0f, 22.3284f, 12.6716f, 23.0f, 13.5f, 23.0f)
                curveTo(14.3284f, 23.0f, 15.0f, 22.3284f, 15.0f, 21.5f)
                verticalLineTo(17.5f)
                curveTo(15.0f, 16.6716f, 14.3284f, 16.0f, 13.5f, 16.0f)
                close()
                moveTo(20.0f, 15.5f)
                curveTo(20.0f, 14.6716f, 20.6716f, 14.0f, 21.5f, 14.0f)
                curveTo(22.3284f, 14.0f, 23.0f, 14.6716f, 23.0f, 15.5f)
                verticalLineTo(21.5f)
                curveTo(23.0f, 22.3284f, 22.3284f, 23.0f, 21.5f, 23.0f)
                curveTo(20.6716f, 23.0f, 20.0f, 22.3284f, 20.0f, 21.5f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _calendarDataBar!!
    }

private var _calendarDataBar: ImageVector? = null

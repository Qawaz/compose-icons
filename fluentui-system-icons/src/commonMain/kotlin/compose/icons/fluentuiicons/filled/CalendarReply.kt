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

public val FilledGroup.CalendarReply: ImageVector
    get() {
        if (_calendarReply != null) {
            return _calendarReply!!
        }
        _calendarReply = Builder(name = "CalendarReply", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.5f)
                verticalLineTo(12.0218f)
                curveTo(19.9897f, 11.375f, 18.7886f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 18.7886f, 11.375f, 19.9897f, 12.0218f, 21.0f)
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
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(16.3536f, 15.3536f)
                curveTo(16.5488f, 15.1583f, 16.5488f, 14.8417f, 16.3536f, 14.6464f)
                curveTo(16.1583f, 14.4512f, 15.8417f, 14.4512f, 15.6464f, 14.6464f)
                lineTo(14.1464f, 16.1464f)
                curveTo(13.9512f, 16.3417f, 13.9512f, 16.6583f, 14.1464f, 16.8536f)
                lineTo(15.6464f, 18.3536f)
                curveTo(15.8417f, 18.5488f, 16.1583f, 18.5488f, 16.3536f, 18.3536f)
                curveTo(16.5488f, 18.1583f, 16.5488f, 17.8417f, 16.3536f, 17.6464f)
                lineTo(15.7071f, 17.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 17.0f, 20.0f, 18.0074f, 20.0f, 19.25f)
                verticalLineTo(19.5f)
                curveTo(20.0f, 19.7761f, 20.2239f, 20.0f, 20.5f, 20.0f)
                curveTo(20.7761f, 20.0f, 21.0f, 19.7761f, 21.0f, 19.5f)
                verticalLineTo(19.25f)
                curveTo(21.0f, 17.4551f, 19.5449f, 16.0f, 17.75f, 16.0f)
                horizontalLineTo(15.7071f)
                lineTo(16.3536f, 15.3536f)
                close()
            }
        }
        .build()
        return _calendarReply!!
    }

private var _calendarReply: ImageVector? = null

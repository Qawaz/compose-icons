package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.CalendarViewMonth: ImageVector
    get() {
        if (_calendarViewMonth != null) {
            return _calendarViewMonth!!
        }
        _calendarViewMonth = Builder(name = "CalendarViewMonth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _calendarViewMonth!!
    }

private var _calendarViewMonth: ImageVector? = null

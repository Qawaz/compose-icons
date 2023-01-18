package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CalendarTodoFill: ImageVector
    get() {
        if (_calendarTodoFill != null) {
            return _calendarTodoFill!!
        }
        _calendarTodoFill = Builder(name = "CalendarTodoFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(7.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 9.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _calendarTodoFill!!
    }

private var _calendarTodoFill: ImageVector? = null

package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.MeetingRoom: ImageVector
    get() {
        if (_meetingRoom != null) {
            return _meetingRoom!!
        }
        _meetingRoom = Builder(name = "MeetingRoom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                verticalLineToRelative(15.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _meetingRoom!!
    }

private var _meetingRoom: ImageVector? = null

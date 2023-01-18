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

public val RemixIcons.InboxUnarchiveFill: ImageVector
    get() {
        if (_inboxUnarchiveFill != null) {
            return _inboxUnarchiveFill!!
        }
        _inboxUnarchiveFill = Builder(name = "InboxUnarchiveFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineToRelative(2.0f, 4.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 7.004f)
                lineTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(12.0f, 10.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-4.0f, -4.0f)
                close()
                moveTo(18.764f, 5.0f)
                lineTo(5.236f, 5.0f)
                lineToRelative(-0.999f, 2.0f)
                horizontalLineToRelative(15.527f)
                lineToRelative(-1.0f, -2.0f)
                close()
            }
        }
        .build()
        return _inboxUnarchiveFill!!
    }

private var _inboxUnarchiveFill: ImageVector? = null

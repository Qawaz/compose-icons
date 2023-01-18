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

public val RemixIcons.MailForbidLine: ImageVector
    get() {
        if (_mailForbidLine != null) {
            return _mailForbidLine!!
        }
        _mailForbidLine = Builder(name = "MailForbidLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.238f)
                lineToRelative(-7.928f, 7.1f)
                lineTo(4.0f, 7.216f)
                lineTo(4.0f, 19.0f)
                horizontalLineToRelative(7.07f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, false, 0.604f, 2.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.255f)
                arcToRelative(6.972f, 6.972f, 0.0f, false, false, -2.0f, -0.965f)
                lineTo(20.0f, 7.238f)
                close()
                moveTo(19.501f, 5.0f)
                lineTo(4.511f, 5.0f)
                lineToRelative(7.55f, 6.662f)
                lineTo(19.502f, 5.0f)
                close()
                moveTo(16.707f, 20.708f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.001f, -4.001f)
                lineToRelative(-4.001f, 4.0f)
                close()
                moveTo(15.292f, 19.293f)
                lineToRelative(4.001f, -4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.001f, 4.001f)
                close()
                moveTo(18.0f, 23.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
            }
        }
        .build()
        return _mailForbidLine!!
    }

private var _mailForbidLine: ImageVector? = null

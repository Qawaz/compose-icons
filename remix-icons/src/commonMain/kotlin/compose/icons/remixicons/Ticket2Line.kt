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

public val RemixIcons.Ticket2Line: ImageVector
    get() {
        if (_ticket2Line != null) {
            return _ticket2Line!!
        }
        _ticket2Line = Builder(name = "Ticket2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                lineTo(22.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(2.968f)
                lineToRelative(0.156f, 0.081f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.34f, 3.74f)
                lineTo(6.5f, 12.0f)
                arcToRelative(4.499f, 4.499f, 0.0f, false, true, -2.344f, 3.95f)
                lineTo(4.0f, 16.032f)
                lineTo(4.0f, 19.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.969f)
                lineToRelative(-0.156f, -0.08f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -2.34f, -3.74f)
                lineTo(17.5f, 12.0f)
                curveToRelative(0.0f, -1.704f, 0.947f, -3.187f, 2.344f, -3.95f)
                lineTo(20.0f, 7.967f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(6.0f)
                lineTo(8.0f, 15.0f)
                lineTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _ticket2Line!!
    }

private var _ticket2Line: ImageVector? = null

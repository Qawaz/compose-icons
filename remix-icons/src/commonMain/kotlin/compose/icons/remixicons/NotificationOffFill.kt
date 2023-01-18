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

public val RemixIcons.NotificationOffFill: ImageVector
    get() {
        if (_notificationOffFill != null) {
            return _notificationOffFill!!
        }
        _notificationOffFill = Builder(name = "NotificationOffFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.586f, 20.0f)
                horizontalLineTo(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, -0.8f)
                lineToRelative(0.4f, -0.533f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -1.33f, 0.324f, -2.584f, 0.899f, -3.687f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(19.799f, 19.8f)
                lineToRelative(-1.415f, 1.414f)
                lineTo(18.586f, 20.0f)
                close()
                moveTo(20.0f, 15.786f)
                lineTo(7.559f, 3.345f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 10.0f)
                verticalLineToRelative(5.786f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _notificationOffFill!!
    }

private var _notificationOffFill: ImageVector? = null

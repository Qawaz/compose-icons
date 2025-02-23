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

public val RemixIcons.AndroidFill: ImageVector
    get() {
        if (_androidFill != null) {
            return _androidFill!!
        }
        _androidFill = Builder(name = "AndroidFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.382f, 3.968f)
                arcTo(8.962f, 8.962f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(2.125f, 0.0f, 4.078f, 0.736f, 5.618f, 1.968f)
                lineToRelative(1.453f, -1.453f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.453f, 1.453f)
                arcTo(8.962f, 8.962f, 0.0f, false, true, 21.0f, 11.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.125f, 0.736f, -4.078f, 1.968f, -5.618f)
                lineTo(3.515f, 3.93f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.453f, 1.453f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(9.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(15.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _androidFill!!
    }

private var _androidFill: ImageVector? = null

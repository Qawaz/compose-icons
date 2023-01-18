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

public val RemixIcons.Lock2Fill: ImageVector
    get() {
        if (_lock2Fill != null) {
            return _lock2Fill!!
        }
        _lock2Fill = Builder(name = "Lock2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(11.0f, 15.732f)
                lineTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.268f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.0f, 0.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(16.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _lock2Fill!!
    }

private var _lock2Fill: ImageVector? = null

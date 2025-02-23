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

public val RemixIcons.TShirtFill: ImageVector
    get() {
        if (_tShirtFill != null) {
            return _tShirtFill!!
        }
        _tShirtFill = Builder(name = "TShirtFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.515f, 5.0f)
                lineToRelative(2.606f, -2.607f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 0.0f)
                lineToRelative(4.242f, 4.243f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(19.0f, 11.828f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.172f)
                lineTo(1.222f, 8.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(4.242f, -4.243f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 0.0f)
                lineTo(9.485f, 5.0f)
                horizontalLineToRelative(5.03f)
                close()
            }
        }
        .build()
        return _tShirtFill!!
    }

private var _tShirtFill: ImageVector? = null

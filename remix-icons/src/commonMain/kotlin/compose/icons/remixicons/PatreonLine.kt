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

public val RemixIcons.PatreonLine: ImageVector
    get() {
        if (_patreonLine != null) {
            return _patreonLine!!
        }
        _patreonLine = Builder(name = "PatreonLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 17.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 0.0f, -15.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.0f, 15.0f)
                close()
                moveTo(15.0f, 15.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(20.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 2.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(1.0f)
                lineTo(5.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _patreonLine!!
    }

private var _patreonLine: ImageVector? = null

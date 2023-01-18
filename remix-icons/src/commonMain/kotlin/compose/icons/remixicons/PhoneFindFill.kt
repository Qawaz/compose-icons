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

public val RemixIcons.PhoneFindFill: ImageVector
    get() {
        if (_phoneFindFill != null) {
            return _phoneFindFill!!
        }
        _phoneFindFill = Builder(name = "PhoneFindFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.529f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 9.0f, 16.0f)
                curveToRelative(0.0f, 3.238f, 2.76f, 6.0f, 6.0f, 6.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.446f, 6.032f)
                lineToRelative(2.21f, 2.21f)
                lineToRelative(-1.413f, 1.415f)
                lineToRelative(-2.211f, -2.21f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 15.0f, 12.0f)
                close()
                moveTo(15.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _phoneFindFill!!
    }

private var _phoneFindFill: ImageVector? = null

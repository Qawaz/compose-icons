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

public val RemixIcons.Superscript2: ImageVector
    get() {
        if (_superscript2 != null) {
            return _superscript2!!
        }
        _superscript2 = Builder(name = "Superscript2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                verticalLineToRelative(13.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.55f, 6.58f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, false, -1.32f, -0.36f)
                lineToRelative(-1.154f, 0.33f)
                arcTo(2.001f, 2.001f, 0.0f, false, true, 19.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.373f, 3.454f)
                lineTo(18.744f, 9.0f)
                lineTo(21.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 9.0f)
                lineToRelative(2.55f, -2.42f)
                close()
            }
        }
        .build()
        return _superscript2!!
    }

private var _superscript2: ImageVector? = null

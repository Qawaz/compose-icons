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

public val RemixIcons.Number1: ImageVector
    get() {
        if (_number1 != null) {
            return _number1!!
        }
        _number1 = Builder(name = "Number1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 1.5f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.704f)
                lineTo(7.5f, 4.91f)
                verticalLineTo(2.839f)
                lineToRelative(5.0f, -1.339f)
                close()
            }
        }
        .build()
        return _number1!!
    }

private var _number1: ImageVector? = null

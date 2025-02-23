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

public val RemixIcons.EraserFill: ImageVector
    get() {
        if (_eraserFill != null) {
            return _eraserFill!!
        }
        _eraserFill = Builder(name = "EraserFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                lineToRelative(-3.998f, 0.002f)
                lineToRelative(-6.487f, -6.487f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineTo(12.12f, 2.494f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 0.0f)
                lineToRelative(7.778f, 7.778f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(15.657f, 14.515f)
                lineToRelative(3.535f, -3.536f)
                lineToRelative(-6.364f, -6.364f)
                lineToRelative(-3.535f, 3.536f)
                lineToRelative(6.364f, 6.364f)
                close()
            }
        }
        .build()
        return _eraserFill!!
    }

private var _eraserFill: ImageVector? = null

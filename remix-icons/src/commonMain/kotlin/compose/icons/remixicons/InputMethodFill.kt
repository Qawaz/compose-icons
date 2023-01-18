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

public val RemixIcons.InputMethodFill: ImageVector
    get() {
        if (_inputMethodFill != null) {
            return _inputMethodFill!!
        }
        _inputMethodFill = Builder(name = "InputMethodFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(9.869f, 15.0f)
                horizontalLineToRelative(4.262f)
                lineToRelative(0.82f, 2.0f)
                horizontalLineToRelative(2.216f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.833f, 17.0f)
                lineTo(9.05f, 17.0f)
                lineToRelative(0.82f, -2.0f)
                close()
                moveTo(10.689f, 13.0f)
                lineTo(12.0f, 9.8f)
                lineToRelative(1.311f, 3.2f)
                lineTo(10.69f, 13.0f)
                close()
            }
        }
        .build()
        return _inputMethodFill!!
    }

private var _inputMethodFill: ImageVector? = null

package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) {
            return _caretDoubleLeft!!
        }
        _caretDoubleLeft = Builder(name = "CaretDoubleLeft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.2f, 203.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(128.5f, 128.0f)
                close()
                moveTo(48.5f, 128.0f)
                lineToRelative(75.7f, -75.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 8.4f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                close()
            }
        }
        .build()
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null

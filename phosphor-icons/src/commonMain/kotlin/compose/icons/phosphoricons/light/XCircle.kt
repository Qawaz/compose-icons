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

public val LightGroup.XCircle: ImageVector
    get() {
        if (_xCircle != null) {
            return _xCircle!!
        }
        _xCircle = Builder(name = "XCircle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(164.2f, 100.2f)
                lineTo(136.5f, 128.0f)
                lineToRelative(27.7f, 27.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(128.0f, 136.5f)
                lineToRelative(-27.8f, 27.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(119.5f, 128.0f)
                lineTo(91.8f, 100.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(128.0f, 119.5f)
                lineToRelative(27.8f, -27.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                close()
            }
        }
        .build()
        return _xCircle!!
    }

private var _xCircle: ImageVector? = null

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

public val LightGroup.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) {
            return _arrowUDownLeft!!
        }
        _arrowUDownLeft = Builder(name = "ArrowUDownLeft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 112.0f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, true, -62.0f, 62.0f)
                horizontalLineTo(46.5f)
                lineToRelative(37.7f, 37.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(46.5f, 162.0f)
                horizontalLineTo(168.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, -100.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(88.0f)
                arcTo(62.1f, 62.1f, 0.0f, false, true, 230.0f, 112.0f)
                close()
            }
        }
        .build()
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null

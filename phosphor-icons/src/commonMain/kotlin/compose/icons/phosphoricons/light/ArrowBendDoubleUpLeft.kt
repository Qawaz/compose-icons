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

public val LightGroup.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) {
            return _arrowBendDoubleUpLeft!!
        }
        _arrowBendDoubleUpLeft = Builder(name = "ArrowBendDoubleUpLeft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.2f, 147.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(40.5f, 104.0f)
                close()
                moveTo(128.0f, 98.0f)
                horizontalLineTo(94.5f)
                lineToRelative(37.7f, -37.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, -8.4f, -8.4f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 8.4f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                lineTo(94.5f, 110.0f)
                horizontalLineTo(128.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, 90.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 98.0f)
                close()
            }
        }
        .build()
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null

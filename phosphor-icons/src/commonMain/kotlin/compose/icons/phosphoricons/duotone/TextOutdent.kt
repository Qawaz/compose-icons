package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) {
            return _textOutdent!!
        }
        _textOutdent = Builder(name = "TextOutdent", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
                moveTo(112.0f, 72.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(216.0f, 184.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(72.0f, 144.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(43.3f, 96.0f)
                lineTo(77.7f, 61.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 66.3f, 50.3f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                lineToRelative(40.0f, 40.0f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 72.0f, 144.0f)
                close()
            }
        }
        .build()
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null

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

public val LightGroup.EnvelopeSimple: ImageVector
    get() {
        if (_envelopeSimple != null) {
            return _envelopeSimple!!
        }
        _envelopeSimple = Builder(name = "EnvelopeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineTo(192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(208.6f, 62.0f)
                lineTo(128.0f, 135.9f)
                lineTo(47.4f, 62.0f)
                close()
                moveTo(216.0f, 194.0f)
                horizontalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(69.6f)
                lineToRelative(85.9f, 78.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 8.2f, 0.0f)
                lineTo(218.0f, 69.6f)
                verticalLineTo(192.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 194.0f)
                close()
            }
        }
        .build()
        return _envelopeSimple!!
    }

private var _envelopeSimple: ImageVector? = null

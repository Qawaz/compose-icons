package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) {
            return _speakerSimpleX!!
        }
        _speakerSimpleX = Builder(name = "SpeakerSimpleX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 168.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(80.0f)
                lineToRelative(72.0f, -56.0f)
                verticalLineTo(224.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.5f, 24.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.4f, 0.9f)
                lineTo(77.3f, 80.0f)
                horizontalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(77.3f)
                lineToRelative(69.8f, 54.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 152.0f, 232.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.5f, -0.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 224.0f)
                verticalLineTo(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 155.5f, 24.8f)
                close()
                moveTo(144.0f, 207.6f)
                lineTo(84.9f, 161.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 80.0f, 160.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(80.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.9f, -1.7f)
                lineTo(144.0f, 48.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.3f, 128.0f)
                lineToRelative(18.4f, -18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(216.0f, 116.7f)
                lineTo(197.7f, 98.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineTo(204.7f, 128.0f)
                lineToRelative(-18.4f, 18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(216.0f, 139.3f)
                lineToRelative(18.3f, 18.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                close()
            }
        }
        .build()
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null

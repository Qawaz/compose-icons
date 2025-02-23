package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) {
            return _toteSimple!!
        }
        _toteSimple = Builder(name = "ToteSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.0f, 69.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 223.1f, 64.0f)
                horizontalLineTo(175.3f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -94.6f, 0.0f)
                horizontalLineTo(32.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 21.0f, 69.3f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -4.0f, 12.5f)
                lineToRelative(14.3f, 128.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 47.2f, 224.0f)
                horizontalLineTo(208.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.9f, -14.2f)
                lineTo(239.0f, 81.8f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 235.0f, 69.3f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 31.0f, 24.0f)
                horizontalLineTo(97.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 128.0f, 40.0f)
                close()
            }
        }
        .build()
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null

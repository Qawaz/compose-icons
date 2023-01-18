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

public val FillGroup.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = Builder(name = "ArrowCircleLeft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(168.0f, 136.0f)
                lineTo(107.3f, 136.0f)
                lineToRelative(20.3f, 20.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -5.7f, 2.3f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -5.6f, -2.3f)
                lineTo(82.4f, 133.7f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -1.8f, -2.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 0.0f, -6.2f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, 1.8f, -2.6f)
                lineToRelative(33.9f, -33.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 11.3f)
                lineTo(107.3f, 120.0f)
                lineTo(168.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null

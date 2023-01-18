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

public val FillGroup.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) {
            return _ejectSimple!!
        }
        _ejectSimple = Builder(name = "EjectSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.4f, 158.9f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 2.0f, -17.0f)
                lineTo(115.6f, 34.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 24.8f, 0.0f)
                lineToRelative(87.2f, 107.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 215.2f, 168.0f)
                horizontalLineTo(40.8f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 26.4f, 158.9f)
                close()
                moveTo(224.0f, 200.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null

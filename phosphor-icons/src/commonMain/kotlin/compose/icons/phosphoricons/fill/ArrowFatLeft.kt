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

public val FillGroup.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) {
            return _arrowFatLeft!!
        }
        _arrowFatLeft = Builder(name = "ArrowFatLeft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.9f, 7.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -8.8f, -1.7f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 8.8f, -1.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 32.0f)
                verticalLineTo(72.0f)
                horizontalLineToRelative(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 88.0f)
                close()
            }
        }
        .build()
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null

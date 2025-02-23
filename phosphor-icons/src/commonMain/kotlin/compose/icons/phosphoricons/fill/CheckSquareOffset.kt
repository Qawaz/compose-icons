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

public val FillGroup.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) {
            return _checkSquareOffset!!
        }
        _checkSquareOffset = Builder(name = "CheckSquareOffset", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 52.0f)
                lineTo(220.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(135.6f, 220.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(204.0f, 204.0f)
                lineTo(204.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                verticalLineToRelative(91.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(36.0f, 52.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 52.0f, 36.0f)
                lineTo(204.0f, 36.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 220.0f, 52.0f)
                close()
                moveTo(133.7f, 146.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineTo(64.0f, 204.7f)
                lineTo(37.7f, 178.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 133.7f, 146.3f)
                close()
            }
        }
        .build()
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null

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

public val FillGroup.Notepad: ImageVector
    get() {
        if (_notepad != null) {
            return _notepad!!
        }
        _notepad = Builder(name = "Notepad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 32.0f)
                lineTo(184.0f, 32.0f)
                lineTo(184.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(136.0f, 32.0f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(88.0f, 32.0f)
                lineTo(88.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(56.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f)
                lineTo(40.0f, 200.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(184.0f, 232.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(216.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 32.0f)
                close()
                moveTo(160.0f, 168.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(160.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _notepad!!
    }

private var _notepad: ImageVector? = null

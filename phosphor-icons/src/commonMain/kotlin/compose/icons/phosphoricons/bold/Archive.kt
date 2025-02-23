package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 88.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 16.0f, 19.6f)
                lineTo(28.0f, 192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 107.6f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 244.0f, 88.0f)
                lineTo(244.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(36.0f, 68.0f)
                lineTo(220.0f, 68.0f)
                lineTo(220.0f, 84.0f)
                lineTo(36.0f, 84.0f)
                close()
                moveTo(52.0f, 188.0f)
                lineTo(52.0f, 108.0f)
                lineTo(204.0f, 108.0f)
                verticalLineToRelative(80.0f)
                close()
                moveTo(164.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(104.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 136.0f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null

package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.BagSimple: ImageVector
    get() {
        if (_bagSimple != null) {
            return _bagSimple!!
        }
        _bagSimple = Builder(name = "BagSimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 64.0f)
                lineTo(175.3f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -94.6f, 0.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                lineTo(24.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 64.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 31.0f, 24.0f)
                lineTo(97.0f, 64.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(216.0f, 208.0f)
                lineTo(40.0f, 208.0f)
                lineTo(40.0f, 80.0f)
                lineTo(216.0f, 80.0f)
                close()
            }
        }
        .build()
        return _bagSimple!!
    }

private var _bagSimple: ImageVector? = null

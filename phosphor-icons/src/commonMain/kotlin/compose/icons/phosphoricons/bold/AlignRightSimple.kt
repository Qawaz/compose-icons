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

public val BoldGroup.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) {
            return _alignRightSimple!!
        }
        _alignRightSimple = Builder(name = "AlignRightSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(196.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 96.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 32.0f, 76.0f)
                lineTo(176.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 196.0f, 96.0f)
                close()
                moveTo(172.0f, 100.0f)
                lineTo(36.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(172.0f, 156.0f)
                close()
            }
        }
        .build()
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null

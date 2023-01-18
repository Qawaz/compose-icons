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

public val BoldGroup.Layout: ImageVector
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout = Builder(name = "Layout", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 60.0f)
                lineTo(212.0f, 92.0f)
                lineTo(44.0f, 92.0f)
                lineTo(44.0f, 60.0f)
                close()
                moveTo(44.0f, 116.0f)
                lineTo(92.0f, 116.0f)
                verticalLineToRelative(80.0f)
                lineTo(44.0f, 196.0f)
                close()
                moveTo(116.0f, 196.0f)
                lineTo(116.0f, 116.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _layout!!
    }

private var _layout: ImageVector? = null

package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Sidebar: ImageVector
    get() {
        if (_sidebar != null) {
            return _sidebar!!
        }
        _sidebar = Builder(name = "Sidebar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(38.0f, 200.0f)
                lineTo(38.0f, 150.0f)
                lineTo(56.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(38.0f, 138.0f)
                lineTo(38.0f, 118.0f)
                lineTo(56.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(38.0f, 106.0f)
                lineTo(38.0f, 86.0f)
                lineTo(56.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(38.0f, 74.0f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(82.0f, 54.0f)
                lineTo(82.0f, 202.0f)
                lineTo(40.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 200.0f)
                close()
                moveTo(218.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(94.0f, 202.0f)
                lineTo(94.0f, 54.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null

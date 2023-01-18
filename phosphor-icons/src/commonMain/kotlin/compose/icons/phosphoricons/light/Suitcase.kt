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

public val LightGroup.Suitcase: ImageVector
    get() {
        if (_suitcase != null) {
            return _suitcase!!
        }
        _suitcase = Builder(name = "Suitcase", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 66.0f)
                lineTo(174.0f, 66.0f)
                lineTo(174.0f, 56.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(104.0f, 34.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 82.0f, 56.0f)
                lineTo(82.0f, 66.0f)
                lineTo(40.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 66.0f)
                close()
                moveTo(94.0f, 56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                lineTo(162.0f, 66.0f)
                lineTo(94.0f, 66.0f)
                close()
                moveTo(162.0f, 78.0f)
                lineTo(162.0f, 210.0f)
                lineTo(94.0f, 210.0f)
                lineTo(94.0f, 78.0f)
                close()
                moveTo(38.0f, 208.0f)
                lineTo(38.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(82.0f, 78.0f)
                lineTo(82.0f, 210.0f)
                lineTo(40.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 208.0f)
                close()
                moveTo(218.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(174.0f, 210.0f)
                lineTo(174.0f, 78.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null

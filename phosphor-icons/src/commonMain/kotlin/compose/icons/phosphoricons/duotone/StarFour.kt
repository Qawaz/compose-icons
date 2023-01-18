package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(227.3f, 135.5f)
                lineToRelative(-63.8f, 23.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -4.8f, 4.8f)
                lineToRelative(-23.2f, 63.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, 0.0f)
                lineTo(97.3f, 163.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -4.8f, -4.8f)
                lineTo(28.7f, 135.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -15.0f)
                lineTo(92.5f, 97.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.8f, -4.8f)
                lineToRelative(23.2f, -63.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.0f, 0.0f)
                lineToRelative(23.2f, 63.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.8f, 4.8f)
                lineToRelative(63.8f, 23.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 227.3f, 135.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.1f, 113.0f)
                lineTo(166.2f, 89.8f)
                lineTo(143.0f, 25.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -30.0f, 0.0f)
                lineTo(89.8f, 89.8f)
                lineTo(25.9f, 113.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 30.0f)
                lineToRelative(63.9f, 23.2f)
                lineTo(113.0f, 230.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 30.0f, 0.0f)
                lineToRelative(23.2f, -63.9f)
                lineTo(230.1f, 143.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -30.0f)
                close()
                moveTo(160.8f, 151.2f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, -9.6f, 9.6f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 224.6f)
                lineToRelative(-23.2f, -63.8f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, -9.6f, -9.6f)
                lineTo(31.4f, 128.0f)
                lineToRelative(63.8f, -23.2f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 9.6f, -9.6f)
                lineTo(128.0f, 31.4f)
                lineToRelative(23.2f, 63.8f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 9.6f, 9.6f)
                lineTo(224.6f, 128.0f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null

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

public val LightGroup.ArrowFatRight: ImageVector
    get() {
        if (_arrowFatRight != null) {
            return _arrowFatRight!!
        }
        _arrowFatRight = Builder(name = "ArrowFatRight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 123.8f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -6.5f, -1.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 130.0f, 32.0f)
                verticalLineTo(74.0f)
                horizontalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(82.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.7f, 5.5f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.3f, 0.5f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, 4.2f, -1.8f)
                lineToRelative(96.0f, -96.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 236.2f, 123.8f)
                close()
                moveTo(142.0f, 209.5f)
                verticalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(46.5f)
                lineTo(223.5f, 128.0f)
                close()
            }
        }
        .build()
        return _arrowFatRight!!
    }

private var _arrowFatRight: ImageVector? = null

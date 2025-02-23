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

public val LightGroup.ArrowFatDown: ImageVector
    get() {
        if (_arrowFatDown != null) {
            return _arrowFatDown!!
        }
        _arrowFatDown = Builder(name = "ArrowFatDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.5f, 133.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 130.0f)
                horizontalLineTo(182.0f)
                verticalLineTo(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 74.0f, 48.0f)
                verticalLineToRelative(82.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.5f, 3.7f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 1.3f, 6.5f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 8.4f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 229.5f, 133.7f)
                close()
                moveTo(128.0f, 223.5f)
                lineTo(46.5f, 142.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(33.5f)
                close()
            }
        }
        .build()
        return _arrowFatDown!!
    }

private var _arrowFatDown: ImageVector? = null

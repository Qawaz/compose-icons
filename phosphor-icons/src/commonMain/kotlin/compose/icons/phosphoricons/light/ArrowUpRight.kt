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

public val LightGroup.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) {
            return _arrowUpRight!!
        }
        _arrowUpRight = Builder(name = "ArrowUpRight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 64.0f)
                verticalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(78.5f)
                lineTo(68.2f, 196.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(177.5f, 70.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(192.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 64.0f)
                close()
            }
        }
        .build()
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null

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

public val LightGroup.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown = Builder(name = "ArrowCircleDown", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(166.2f, 129.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineToRelative(-34.0f, -33.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -8.5f)
                lineTo(122.0f, 153.5f)
                lineTo(122.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(65.5f)
                lineToRelative(23.7f, -23.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 166.2f, 129.8f)
                close()
            }
        }
        .build()
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null

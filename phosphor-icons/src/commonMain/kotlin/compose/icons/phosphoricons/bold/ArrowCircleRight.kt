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

public val BoldGroup.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight = Builder(name = "ArrowCircleRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(176.5f, 119.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.9f, 0.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, -16.9f)
                lineTo(139.0f, 140.0f)
                lineTo(88.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(51.0f)
                lineToRelative(-13.4f, -13.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.9f, -16.9f)
                close()
            }
        }
        .build()
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null

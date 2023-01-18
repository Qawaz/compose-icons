package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) {
            return _arrowBendUpRight!!
        }
        _arrowBendUpRight = Builder(name = "ArrowBendUpRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.7f, 109.7f)
                lineToRelative(-48.0f, 48.0f)
                arcTo(8.3f, 8.3f, 0.0f, false, true, 176.0f, 160.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.1f, -0.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 152.0f)
                verticalLineTo(112.0f)
                horizontalLineTo(128.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, true, 128.0f, 96.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.9f, -7.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 8.8f, 1.7f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 229.7f, 109.7f)
                close()
            }
        }
        .build()
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null

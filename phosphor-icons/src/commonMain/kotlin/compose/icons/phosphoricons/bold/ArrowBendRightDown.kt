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

public val BoldGroup.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) {
            return _arrowBendRightDown!!
        }
        _arrowBendRightDown = Builder(name = "ArrowBendRightDown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.5f, 184.5f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(140.0f, 195.0f)
                verticalLineTo(128.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 56.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, true, 164.0f, 128.0f)
                verticalLineToRelative(67.0f)
                lineToRelative(27.5f, -27.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null

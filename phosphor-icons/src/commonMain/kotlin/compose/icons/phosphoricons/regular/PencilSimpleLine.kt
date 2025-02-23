package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) {
            return _pencilSimpleLine!!
        }
        _pencilSimpleLine = Builder(name = "PencilSimpleLine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 208.0f)
                horizontalLineTo(115.3f)
                lineToRelative(82.4f, -82.3f)
                horizontalLineToRelative(0.0f)
                lineTo(224.0f, 99.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, -22.6f)
                lineTo(179.3f, 32.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(36.7f, 152.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 32.0f, 163.3f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(168.0f, 43.3f)
                lineTo(212.7f, 88.0f)
                lineTo(192.0f, 108.7f)
                lineTo(147.3f, 64.0f)
                close()
                moveTo(48.0f, 163.3f)
                lineToRelative(88.0f, -88.0f)
                lineTo(180.7f, 120.0f)
                lineToRelative(-88.0f, 88.0f)
                horizontalLineTo(48.0f)
                close()
            }
        }
        .build()
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null

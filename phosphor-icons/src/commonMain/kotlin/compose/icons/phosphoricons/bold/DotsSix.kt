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

public val BoldGroup.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) {
            return _dotsSix!!
        }
        _dotsSix = Builder(name = "DotsSix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 92.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 60.0f, 76.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 92.0f)
                close()
                moveTo(128.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 76.0f)
                close()
                moveTo(196.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.0f, 108.0f)
                close()
                moveTo(60.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 60.0f, 148.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(196.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.0f, 148.0f)
                close()
            }
        }
        .build()
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null

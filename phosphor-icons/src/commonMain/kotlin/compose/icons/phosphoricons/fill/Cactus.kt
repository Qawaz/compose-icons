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

public val FillGroup.Cactus: ImageVector
    get() {
        if (_cactus != null) {
            return _cactus!!
        }
        _cactus = Builder(name = "Cactus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(140.0f)
                horizontalLineTo(84.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 16.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 84.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(56.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                verticalLineToRelative(68.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, -68.0f, 68.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
            }
        }
        .build()
        return _cactus!!
    }

private var _cactus: ImageVector? = null

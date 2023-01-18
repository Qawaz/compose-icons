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

public val RegularGroup.HouseLine: ImageVector
    get() {
        if (_houseLine != null) {
            return _houseLine!!
        }
        _houseLine = Builder(name = "HouseLine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 208.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(115.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.2f, -11.8f)
                lineTo(138.8f, 31.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.6f, 0.0f)
                lineToRelative(-80.0f, 72.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 115.5f)
                verticalLineTo(208.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(48.0f, 115.5f)
                lineToRelative(80.0f, -72.7f)
                lineToRelative(80.0f, 72.7f)
                verticalLineTo(208.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(144.0f, 208.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null

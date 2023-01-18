package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Building3Fill: ImageVector
    get() {
        if (_building3Fill != null) {
            return _building3Fill!!
        }
        _building3Fill = Builder(name = "Building3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.111f)
                verticalLineTo(1.0f)
                lineToRelative(11.0f, 6.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _building3Fill!!
    }

private var _building3Fill: ImageVector? = null

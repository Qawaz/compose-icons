package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.TabDesktop: ImageVector
    get() {
        if (_tabDesktop != null) {
            return _tabDesktop!!
        }
        _tabDesktop = Builder(name = "TabDesktop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 3.0f, 3.0f, 4.3432f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.6569f, 4.3432f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.25f)
                curveTo(12.0074f, 8.0f, 11.0f, 6.9926f, 11.0f, 5.75f)
                verticalLineTo(3.0f)
                close()
                moveTo(21.0f, 6.5f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(5.75f)
                curveTo(12.5f, 6.1642f, 12.8358f, 6.5f, 13.25f, 6.5f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _tabDesktop!!
    }

private var _tabDesktop: ImageVector? = null

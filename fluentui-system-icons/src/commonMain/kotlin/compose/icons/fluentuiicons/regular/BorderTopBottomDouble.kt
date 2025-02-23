package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.BorderTopBottomDouble: ImageVector
    get() {
        if (_borderTopBottomDouble != null) {
            return _borderTopBottomDouble!!
        }
        _borderTopBottomDouble = Builder(name = "BorderTopBottomDouble", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 6.6642f, 3.3358f, 7.0f, 3.75f, 7.0f)
                curveTo(4.1642f, 7.0f, 4.5f, 6.6642f, 4.5f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.0596f, 5.0596f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 4.5f, 19.5f, 5.0596f, 19.5f, 5.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 6.6642f, 19.8358f, 7.0f, 20.25f, 7.0f)
                curveTo(20.6642f, 7.0f, 21.0f, 6.6642f, 21.0f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 4.2312f, 19.7688f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(3.75f, 10.0f)
                curveTo(4.1642f, 10.0f, 4.5f, 10.3358f, 4.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(4.5f, 13.6642f, 4.1642f, 14.0f, 3.75f, 14.0f)
                curveTo(3.3358f, 14.0f, 3.0f, 13.6642f, 3.0f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(3.0f, 10.3358f, 3.3358f, 10.0f, 3.75f, 10.0f)
                close()
                moveTo(20.25f, 10.0f)
                curveTo(19.8358f, 10.0f, 19.5f, 10.3358f, 19.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(19.5f, 13.6642f, 19.8358f, 14.0f, 20.25f, 14.0f)
                curveTo(20.6642f, 14.0f, 21.0f, 13.6642f, 21.0f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(21.0f, 10.3358f, 20.6642f, 10.0f, 20.25f, 10.0f)
                close()
                moveTo(3.0f, 20.25f)
                curveTo(3.0f, 20.6642f, 3.3358f, 21.0f, 3.75f, 21.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 21.0f, 21.0f, 20.6642f, 21.0f, 20.25f)
                curveTo(21.0f, 19.8358f, 20.6642f, 19.5f, 20.25f, 19.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 19.5f, 3.0f, 19.8358f, 3.0f, 20.25f)
                close()
                moveTo(3.75f, 18.5f)
                curveTo(3.3358f, 18.5f, 3.0f, 18.1642f, 3.0f, 17.75f)
                curveTo(3.0f, 17.3358f, 3.3358f, 17.0f, 3.75f, 17.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 17.0f, 21.0f, 17.3358f, 21.0f, 17.75f)
                curveTo(21.0f, 18.1642f, 20.6642f, 18.5f, 20.25f, 18.5f)
                horizontalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _borderTopBottomDouble!!
    }

private var _borderTopBottomDouble: ImageVector? = null

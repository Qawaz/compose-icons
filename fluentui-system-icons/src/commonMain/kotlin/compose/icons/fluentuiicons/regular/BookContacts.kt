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

public val RegularGroup.BookContacts: ImageVector
    get() {
        if (_bookContacts != null) {
            return _bookContacts!!
        }
        _bookContacts = Builder(name = "BookContacts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 12.25f)
                curveTo(15.5f, 11.8358f, 15.1642f, 11.5f, 14.75f, 11.5f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 11.5f, 9.0f, 11.8358f, 9.0f, 12.25f)
                verticalLineTo(12.7495f)
                curveTo(9.0f, 13.75f, 10.3831f, 14.5f, 12.25f, 14.5f)
                curveTo(14.1168f, 14.5f, 15.5f, 13.75f, 15.5f, 12.7495f)
                verticalLineTo(12.25f)
                close()
                moveTo(14.0f, 8.7455f)
                curveTo(14.0f, 7.7786f, 13.2168f, 7.0f, 12.25f, 7.0f)
                curveTo(11.2832f, 7.0f, 10.5f, 7.7786f, 10.5f, 8.7455f)
                curveTo(10.5f, 9.7123f, 11.2832f, 10.4961f, 12.25f, 10.4961f)
                curveTo(13.2168f, 10.4961f, 14.0f, 9.7123f, 14.0f, 8.7455f)
                close()
                moveTo(4.0f, 4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.3807f, 2.0f, 20.5f, 3.1193f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(5.5f, 4.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.5f)
                curveTo(19.0f, 3.9477f, 18.5523f, 3.5f, 18.0f, 3.5f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 3.5f, 5.5f, 3.9477f, 5.5f, 4.5f)
                close()
            }
        }
        .build()
        return _bookContacts!!
    }

private var _bookContacts: ImageVector? = null

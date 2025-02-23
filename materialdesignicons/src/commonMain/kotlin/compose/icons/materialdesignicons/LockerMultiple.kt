package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.LockerMultiple: ImageVector
    get() {
        if (_lockerMultiple != null) {
            return _lockerMultiple!!
        }
        _lockerMultiple = Builder(name = "LockerMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 22.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 2.0f)
                moveTo(13.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                moveTo(3.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                moveTo(5.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                moveTo(5.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                moveTo(5.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                moveTo(15.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                moveTo(15.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _lockerMultiple!!
    }

private var _lockerMultiple: ImageVector? = null

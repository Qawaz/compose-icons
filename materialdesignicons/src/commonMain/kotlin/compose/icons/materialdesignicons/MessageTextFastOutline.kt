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

public val MaterialDesignIcons.MessageTextFastOutline: ImageVector
    get() {
        if (_messageTextFastOutline != null) {
            return _messageTextFastOutline!!
        }
        _messageTextFastOutline = Builder(name = "MessageTextFastOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.5f)
                moveTo(10.0f, 8.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                moveTo(20.0f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 5.0f, 7.0f, 5.9f, 7.0f, 7.0f)
                verticalLineTo(21.0f)
                lineTo(11.0f, 17.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 17.0f, 22.0f, 16.1f, 22.0f, 15.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(10.2f)
                lineTo(9.0f, 16.2f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                moveTo(3.0f, 7.0f)
                curveTo(2.4f, 7.0f, 2.0f, 7.4f, 2.0f, 8.0f)
                reflectiveCurveTo(2.4f, 9.0f, 3.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                moveTo(2.0f, 11.0f)
                curveTo(1.4f, 11.0f, 1.0f, 11.4f, 1.0f, 12.0f)
                reflectiveCurveTo(1.4f, 13.0f, 2.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                moveTo(1.0f, 15.0f)
                curveTo(0.4f, 15.0f, 0.0f, 15.4f, 0.0f, 16.0f)
                curveTo(0.0f, 16.6f, 0.4f, 17.0f, 1.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _messageTextFastOutline!!
    }

private var _messageTextFastOutline: ImageVector? = null

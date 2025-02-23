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

public val MaterialDesignIcons.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll = Builder(name = "ReplyAll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                verticalLineTo(5.0f)
                lineTo(6.0f, 12.0f)
                lineTo(13.0f, 19.0f)
                verticalLineTo(14.9f)
                curveTo(18.0f, 14.9f, 21.5f, 16.5f, 24.0f, 20.0f)
                curveTo(23.0f, 15.0f, 20.0f, 10.0f, 13.0f, 9.0f)
                moveTo(7.0f, 8.0f)
                verticalLineTo(5.0f)
                lineTo(0.0f, 12.0f)
                lineTo(7.0f, 19.0f)
                verticalLineTo(16.0f)
                lineTo(3.0f, 12.0f)
                lineTo(7.0f, 8.0f)
                close()
            }
        }
        .build()
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null

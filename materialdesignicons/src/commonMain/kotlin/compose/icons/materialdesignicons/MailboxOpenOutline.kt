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

public val MaterialDesignIcons.MailboxOpenOutline: ImageVector
    get() {
        if (_mailboxOpenOutline != null) {
            return _mailboxOpenOutline!!
        }
        _mailboxOpenOutline = Builder(name = "MailboxOpenOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.0f, 9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 18.0f)
                verticalLineTo(9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 18.0f, 4.0f)
                moveTo(11.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 9.0f)
                verticalLineTo(18.0f)
                moveTo(21.0f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 7.92f, 12.65f, 6.86f, 12.0f, 6.0f)
                horizontalLineTo(18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 9.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _mailboxOpenOutline!!
    }

private var _mailboxOpenOutline: ImageVector? = null

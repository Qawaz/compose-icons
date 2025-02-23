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

public val MaterialDesignIcons.MailboxUpOutline: ImageVector
    get() {
        if (_mailboxUpOutline != null) {
            return _mailboxUpOutline!!
        }
        _mailboxUpOutline = Builder(name = "MailboxUpOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineTo(7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 4.0f)
                moveTo(10.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 9.0f)
                verticalLineTo(18.0f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 7.92f, 11.65f, 6.86f, 11.0f, 6.0f)
                horizontalLineTo(17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 9.0f)
                verticalLineTo(18.0f)
                moveTo(13.0f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                moveTo(9.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _mailboxUpOutline!!
    }

private var _mailboxUpOutline: ImageVector? = null

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

public val RegularGroup.TextboxAlignMiddle: ImageVector
    get() {
        if (_textboxAlignMiddle != null) {
            return _textboxAlignMiddle!!
        }
        _textboxAlignMiddle = Builder(name = "TextboxAlignMiddle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 10.0f, 18.0f, 10.3358f, 18.0f, 10.75f)
                curveTo(18.0f, 11.1297f, 17.6238f, 11.4435f, 17.1357f, 11.4932f)
                lineTo(17.0f, 11.5f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 11.5f, 6.0f, 11.1642f, 6.0f, 10.75f)
                curveTo(6.0f, 10.3703f, 6.3762f, 10.0565f, 6.8643f, 10.0068f)
                lineTo(7.0f, 10.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineTo(7.0f)
                lineTo(6.8643f, 13.0068f)
                curveTo(6.3762f, 13.0565f, 6.0f, 13.3703f, 6.0f, 13.75f)
                curveTo(6.0f, 14.1642f, 6.4477f, 14.5f, 7.0f, 14.5f)
                horizontalLineTo(17.0f)
                lineTo(17.1357f, 14.4932f)
                curveTo(17.6238f, 14.4435f, 18.0f, 14.1297f, 18.0f, 13.75f)
                curveTo(18.0f, 13.3358f, 17.5523f, 13.0f, 17.0f, 13.0f)
                close()
                moveTo(21.0f, 5.75f)
                curveTo(21.0f, 4.2312f, 19.7688f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.7688f, 4.2312f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 21.0f, 21.0f, 19.7688f, 21.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(5.75f, 4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 4.5f, 19.5f, 5.0596f, 19.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(19.5f, 18.9404f, 18.9404f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(5.75f)
                curveTo(5.0596f, 19.5f, 4.5f, 18.9404f, 4.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.0596f, 5.0596f, 4.5f, 5.75f, 4.5f)
                close()
            }
        }
        .build()
        return _textboxAlignMiddle!!
    }

private var _textboxAlignMiddle: ImageVector? = null

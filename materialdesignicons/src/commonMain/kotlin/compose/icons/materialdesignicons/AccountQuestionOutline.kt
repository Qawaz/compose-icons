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

public val MaterialDesignIcons.AccountQuestionOutline: ImageVector
    get() {
        if (_accountQuestionOutline != null) {
            return _accountQuestionOutline!!
        }
        _accountQuestionOutline = Builder(name = "AccountQuestionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(20.5f)
                moveTo(18.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 23.0f, 9.0f)
                curveTo(23.0f, 9.97f, 22.5f, 10.88f, 21.71f, 11.41f)
                lineTo(21.41f, 11.6f)
                curveTo(20.84f, 12.0f, 20.5f, 12.61f, 20.5f, 13.3f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.3f)
                curveTo(19.0f, 12.11f, 19.6f, 11.0f, 20.59f, 10.35f)
                lineTo(20.88f, 10.16f)
                curveTo(21.27f, 9.9f, 21.5f, 9.47f, 21.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 9.0f)
                verticalLineTo(9.5f)
                moveTo(9.0f, 13.0f)
                curveTo(11.67f, 13.0f, 17.0f, 14.34f, 17.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                curveTo(1.0f, 14.34f, 6.33f, 13.0f, 9.0f, 13.0f)
                moveTo(9.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 4.0f)
                moveTo(9.0f, 14.9f)
                curveTo(6.03f, 14.9f, 2.9f, 16.36f, 2.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(15.1f)
                verticalLineTo(17.0f)
                curveTo(15.1f, 16.36f, 11.97f, 14.9f, 9.0f, 14.9f)
                moveTo(9.0f, 5.9f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 6.9f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 9.0f, 10.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 11.1f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 9.0f, 5.9f)
                close()
            }
        }
        .build()
        return _accountQuestionOutline!!
    }

private var _accountQuestionOutline: ImageVector? = null

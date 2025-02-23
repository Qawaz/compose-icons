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

public val MaterialDesignIcons.PassportBiometric: ImageVector
    get() {
        if (_passportBiometric != null) {
            return _passportBiometric!!
        }
        _passportBiometric = Builder(name = "PassportBiometric", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.13f)
                curveTo(8.59f, 9.24f, 10.18f, 8.0f, 12.0f, 8.0f)
                curveTo(13.82f, 8.0f, 15.41f, 9.24f, 15.87f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                moveTo(2.0f, 13.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.87f)
                curveTo(15.41f, 14.76f, 13.82f, 16.0f, 12.0f, 16.0f)
                curveTo(10.18f, 16.0f, 8.59f, 14.76f, 8.13f, 13.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _passportBiometric!!
    }

private var _passportBiometric: ImageVector? = null

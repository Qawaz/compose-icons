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

public val MaterialDesignIcons.SmartCardReader: ImageVector
    get() {
        if (_smartCardReader != null) {
            return _smartCardReader!!
        }
        _smartCardReader = Builder(name = "SmartCardReader", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                arcTo(2.07f, 2.07f, 0.0f, false, false, 19.0f, 2.0f)
                horizontalLineTo(5.0f)
                arcTo(2.07f, 2.07f, 0.0f, false, false, 3.0f, 4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                moveTo(8.25f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.25f)
                curveTo(9.91f, 6.0f, 10.75f, 9.34f, 10.75f, 11.0f)
                reflectiveCurveTo(9.91f, 16.0f, 8.25f, 16.0f)
                moveTo(14.5f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 17.0f, 11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 13.5f)
                moveTo(23.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 21.0f)
                close()
            }
        }
        .build()
        return _smartCardReader!!
    }

private var _smartCardReader: ImageVector? = null

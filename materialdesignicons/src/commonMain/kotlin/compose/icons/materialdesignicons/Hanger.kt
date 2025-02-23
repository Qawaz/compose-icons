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

public val MaterialDesignIcons.Hanger: ImageVector
    get() {
        if (_hanger != null) {
            return _hanger!!
        }
        _hanger = Builder(name = "Hanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 7.5f)
                horizontalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 9.0f)
                curveTo(11.45f, 9.0f, 11.0f, 9.45f, 11.0f, 10.0f)
                verticalLineTo(11.75f)
                lineTo(2.4f, 18.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 20.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.6f, 18.2f)
                lineTo(13.0f, 11.75f)
                verticalLineTo(10.85f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(12.0f, 13.5f)
                lineTo(18.0f, 18.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _hanger!!
    }

private var _hanger: ImageVector? = null

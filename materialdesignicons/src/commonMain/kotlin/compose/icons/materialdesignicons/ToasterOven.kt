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

public val MaterialDesignIcons.ToasterOven: ImageVector
    get() {
        if (_toasterOven != null) {
            return _toasterOven!!
        }
        _toasterOven = Builder(name = "ToasterOven", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 19.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 5.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                moveTo(19.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 7.0f)
                moveTo(6.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                moveTo(19.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 11.0f)
                close()
            }
        }
        .build()
        return _toasterOven!!
    }

private var _toasterOven: ImageVector? = null

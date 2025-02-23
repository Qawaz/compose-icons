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

public val MaterialDesignIcons.FloorLampOutline: ImageVector
    get() {
        if (_floorLampOutline != null) {
            return _floorLampOutline!!
        }
        _floorLampOutline = Builder(name = "FloorLampOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 2.0f)
                moveTo(13.6f, 4.0f)
                horizontalLineTo(10.4f)
                lineTo(9.55f, 7.0f)
                horizontalLineTo(14.45f)
                moveTo(11.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _floorLampOutline!!
    }

private var _floorLampOutline: ImageVector? = null

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

public val MaterialDesignIcons.LocationExit: ImageVector
    get() {
        if (_locationExit != null) {
            return _locationExit!!
        }
        _locationExit = Builder(name = "LocationExit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                lineTo(18.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                moveTo(20.0f, 18.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 20.0f, 6.0f)
                horizontalLineTo(17.27f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 17.27f, 18.0f)
                close()
            }
        }
        .build()
        return _locationExit!!
    }

private var _locationExit: ImageVector? = null

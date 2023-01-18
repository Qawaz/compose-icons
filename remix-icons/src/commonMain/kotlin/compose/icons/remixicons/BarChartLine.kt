package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BarChartLine: ImageVector
    get() {
        if (_barChartLine != null) {
            return _barChartLine!!
        }
        _barChartLine = Builder(name = "BarChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 8.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                close()
            }
        }
        .build()
        return _barChartLine!!
    }

private var _barChartLine: ImageVector? = null

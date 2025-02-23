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

public val RemixIcons.BarChartGroupedLine: ImageVector
    get() {
        if (_barChartGroupedLine != null) {
            return _barChartGroupedLine!!
        }
        _barChartGroupedLine = Builder(name = "BarChartGroupedLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 10.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(19.0f)
                lineTo(9.0f, 21.0f)
                lineTo(9.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _barChartGroupedLine!!
    }

private var _barChartGroupedLine: ImageVector? = null

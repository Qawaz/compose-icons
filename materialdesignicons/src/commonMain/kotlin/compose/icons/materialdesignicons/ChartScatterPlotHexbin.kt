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

public val MaterialDesignIcons.ChartScatterPlotHexbin: ImageVector
    get() {
        if (_chartScatterPlotHexbin != null) {
            return _chartScatterPlotHexbin!!
        }
        _chartScatterPlotHexbin = Builder(name = "ChartScatterPlotHexbin", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                moveTo(14.0f, 14.5f)
                lineTo(12.0f, 18.0f)
                horizontalLineTo(7.94f)
                lineTo(5.92f, 14.5f)
                lineTo(7.94f, 11.0f)
                horizontalLineTo(12.0f)
                lineTo(14.0f, 14.5f)
                moveTo(14.08f, 6.5f)
                lineTo(12.06f, 10.0f)
                horizontalLineTo(8.0f)
                lineTo(6.0f, 6.5f)
                lineTo(8.0f, 3.0f)
                horizontalLineTo(12.06f)
                lineTo(14.08f, 6.5f)
                moveTo(21.25f, 10.5f)
                lineTo(19.23f, 14.0f)
                horizontalLineTo(15.19f)
                lineTo(13.17f, 10.5f)
                lineTo(15.19f, 7.0f)
                horizontalLineTo(19.23f)
                lineTo(21.25f, 10.5f)
                close()
            }
        }
        .build()
        return _chartScatterPlotHexbin!!
    }

private var _chartScatterPlotHexbin: ImageVector? = null

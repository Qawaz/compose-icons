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

public val MaterialDesignIcons.ArrowCollapseLeft: ImageVector
    get() {
        if (_arrowCollapseLeft != null) {
            return _arrowCollapseLeft!!
        }
        _arrowCollapseLeft = Builder(name = "ArrowCollapseLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.92f, 19.92f)
                lineTo(4.0f, 12.0f)
                lineTo(11.92f, 4.08f)
                lineTo(13.33f, 5.5f)
                lineTo(7.83f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.83f)
                lineTo(13.34f, 18.5f)
                lineTo(11.92f, 19.92f)
                moveTo(4.0f, 12.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _arrowCollapseLeft!!
    }

private var _arrowCollapseLeft: ImageVector? = null

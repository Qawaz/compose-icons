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

public val MaterialDesignIcons.SkipPreviousCircleOutline: ImageVector
    get() {
        if (_skipPreviousCircleOutline != null) {
            return _skipPreviousCircleOutline!!
        }
        _skipPreviousCircleOutline = Builder(name = "SkipPreviousCircleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(7.59f, 4.0f, 4.0f, 7.59f, 4.0f, 12.0f)
                curveTo(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f)
                curveTo(16.41f, 20.0f, 20.0f, 16.41f, 20.0f, 12.0f)
                curveTo(20.0f, 7.59f, 16.41f, 4.0f, 12.0f, 4.0f)
                moveTo(16.0f, 8.0f)
                verticalLineTo(16.0f)
                lineTo(11.0f, 12.0f)
                moveTo(10.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
            }
        }
        .build()
        return _skipPreviousCircleOutline!!
    }

private var _skipPreviousCircleOutline: ImageVector? = null

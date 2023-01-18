package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DocumentHeader: ImageVector
    get() {
        if (_documentHeader != null) {
            return _documentHeader!!
        }
        _documentHeader = Builder(name = "DocumentHeader", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 2.0f)
                curveTo(18.9409f, 2.0f, 19.9156f, 2.9253f, 19.9948f, 4.0961f)
                lineTo(20.0f, 4.2502f)
                verticalLineTo(19.7498f)
                curveTo(20.0f, 20.9408f, 19.0748f, 21.9156f, 17.904f, 21.9948f)
                lineTo(17.75f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0591f, 22.0f, 4.0844f, 21.0747f, 4.0052f, 19.9038f)
                lineTo(4.0f, 19.7498f)
                verticalLineTo(4.2502f)
                curveTo(4.0f, 3.0592f, 4.9252f, 2.0844f, 6.096f, 2.0052f)
                lineTo(6.25f, 2.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(8.5052f, 5.0045f)
                curveTo(7.6767f, 5.0045f, 7.0051f, 5.6761f, 7.0051f, 6.5047f)
                curveTo(7.0051f, 7.3331f, 7.6767f, 8.0048f, 8.5052f, 8.0048f)
                horizontalLineTo(15.5052f)
                curveTo(16.3337f, 8.0048f, 17.0052f, 7.3331f, 17.0052f, 6.5047f)
                curveTo(17.0052f, 5.6761f, 16.3337f, 5.0045f, 15.5052f, 5.0045f)
                horizontalLineTo(8.5052f)
                close()
            }
        }
        .build()
        return _documentHeader!!
    }

private var _documentHeader: ImageVector? = null

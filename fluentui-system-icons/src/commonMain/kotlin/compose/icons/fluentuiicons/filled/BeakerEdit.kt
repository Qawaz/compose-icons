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

public val FilledGroup.BeakerEdit: ImageVector
    get() {
        if (_beakerEdit != null) {
            return _beakerEdit!!
        }
        _beakerEdit = Builder(name = "BeakerEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.5f)
                verticalLineTo(9.7382f)
                curveTo(7.0f, 10.1132f, 6.9063f, 10.4822f, 6.7274f, 10.8117f)
                lineTo(5.5394f, 13.0f)
                horizontalLineTo(14.4605f)
                lineTo(13.2726f, 10.8117f)
                curveTo(13.0937f, 10.4822f, 13.0f, 10.1132f, 13.0f, 9.7382f)
                verticalLineTo(3.5f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 3.5f, 14.75f, 3.1642f, 14.75f, 2.75f)
                curveTo(14.75f, 2.3358f, 14.4142f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 2.0f, 5.25f, 2.3358f, 5.25f, 2.75f)
                curveTo(5.25f, 3.1642f, 5.5858f, 3.5f, 6.0f, 3.5f)
                horizontalLineTo(7.0f)
                close()
                moveTo(15.2748f, 14.5f)
                horizontalLineTo(4.7252f)
                lineTo(3.1427f, 17.415f)
                curveTo(2.5097f, 18.5811f, 3.3539f, 19.9999f, 4.6807f, 19.9999f)
                horizontalLineTo(11.4151f)
                lineTo(11.5209f, 19.5768f)
                curveTo(11.6829f, 18.9288f, 12.018f, 18.3371f, 12.4903f, 17.8648f)
                lineTo(15.479f, 14.8761f)
                lineTo(15.2748f, 14.5f)
                close()
                moveTo(19.0999f, 12.6695f)
                lineTo(13.1974f, 18.5719f)
                curveTo(12.8533f, 18.916f, 12.6092f, 19.3472f, 12.4911f, 19.8194f)
                lineTo(12.0334f, 21.6501f)
                curveTo(11.8344f, 22.4462f, 12.5556f, 23.1674f, 13.3517f, 22.9683f)
                lineTo(15.1824f, 22.5106f)
                curveTo(15.6545f, 22.3926f, 16.0857f, 22.1485f, 16.4299f, 21.8043f)
                lineTo(22.3323f, 15.9019f)
                curveTo(23.2249f, 15.0093f, 23.2249f, 13.5621f, 22.3323f, 12.6695f)
                curveTo(21.4397f, 11.7768f, 19.9925f, 11.7768f, 19.0999f, 12.6695f)
                close()
            }
        }
        .build()
        return _beakerEdit!!
    }

private var _beakerEdit: ImageVector? = null

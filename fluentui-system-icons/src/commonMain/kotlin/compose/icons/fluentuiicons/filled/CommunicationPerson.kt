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

public val FilledGroup.CommunicationPerson: ImageVector
    get() {
        if (_communicationPerson != null) {
            return _communicationPerson!!
        }
        _communicationPerson = Builder(name = "CommunicationPerson", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.0f)
                curveTo(4.0f, 8.5817f, 7.5817f, 5.0f, 12.0f, 5.0f)
                curveTo(15.8182f, 5.0f, 19.0116f, 7.6748f, 19.8087f, 11.2529f)
                curveTo(20.9279f, 11.7044f, 21.7602f, 12.7178f, 21.956f, 13.9436f)
                curveTo(21.9851f, 13.633f, 22.0f, 13.3182f, 22.0f, 13.0f)
                curveTo(22.0f, 7.4771f, 17.5228f, 3.0f, 12.0f, 3.0f)
                curveTo(6.4771f, 3.0f, 2.0f, 7.4771f, 2.0f, 13.0f)
                curveTo(2.0f, 15.7578f, 3.1177f, 18.2565f, 4.9225f, 20.0646f)
                curveTo(5.3126f, 20.4555f, 5.9458f, 20.456f, 6.3367f, 20.0659f)
                curveTo(6.7275f, 19.6757f, 6.7281f, 19.0425f, 6.338f, 18.6517f)
                curveTo(4.8922f, 17.2033f, 4.0f, 15.2068f, 4.0f, 13.0f)
                close()
                moveTo(17.6909f, 11.094f)
                curveTo(16.8944f, 8.7146f, 14.6474f, 7.0f, 12.0f, 7.0f)
                curveTo(8.6863f, 7.0f, 6.0f, 9.6863f, 6.0f, 13.0f)
                curveTo(6.0f, 14.6566f, 6.6727f, 16.1579f, 7.7574f, 17.2426f)
                curveTo(8.1479f, 17.6332f, 8.781f, 17.6332f, 9.1716f, 17.2426f)
                curveTo(9.5621f, 16.8521f, 9.5621f, 16.219f, 9.1716f, 15.8284f)
                curveTo(8.4466f, 15.1035f, 8.0f, 14.1048f, 8.0f, 13.0f)
                curveTo(8.0f, 10.7909f, 9.7909f, 9.0f, 12.0f, 9.0f)
                curveTo(13.9164f, 9.0f, 15.5181f, 10.3477f, 15.9089f, 12.1471f)
                curveTo(16.3755f, 11.6335f, 16.9928f, 11.2592f, 17.6909f, 11.094f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(10.0f, 11.8954f, 10.8954f, 11.0f, 12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 11.8954f, 14.0f, 13.0f)
                curveTo(14.0f, 14.1046f, 13.1046f, 15.0f, 12.0f, 15.0f)
                curveTo(10.8954f, 15.0f, 10.0f, 14.1046f, 10.0f, 13.0f)
                close()
                moveTo(21.0f, 14.5f)
                curveTo(21.0f, 15.8807f, 19.8807f, 17.0f, 18.5f, 17.0f)
                curveTo(17.1193f, 17.0f, 16.0f, 15.8807f, 16.0f, 14.5f)
                curveTo(16.0f, 13.1193f, 17.1193f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 13.1193f, 21.0f, 14.5f)
                close()
                moveTo(23.0f, 19.875f)
                curveTo(23.0f, 21.4315f, 21.7143f, 23.0f, 18.5f, 23.0f)
                curveTo(15.2857f, 23.0f, 14.0f, 21.4374f, 14.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14.0f, 18.7929f, 14.7937f, 18.0f, 15.7727f, 18.0f)
                horizontalLineTo(21.2273f)
                curveTo(22.2063f, 18.0f, 23.0f, 18.793f, 23.0f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }
        .build()
        return _communicationPerson!!
    }

private var _communicationPerson: ImageVector? = null

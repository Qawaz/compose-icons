package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0487f, 7.9831f)
                curveTo(6.1957f, 7.5958f, 6.6287f, 7.4009f, 7.016f, 7.5479f)
                lineTo(12.0f, 9.4388f)
                lineTo(16.9839f, 7.5479f)
                curveTo(17.3712f, 7.4009f, 17.8043f, 7.5958f, 17.9512f, 7.9831f)
                curveTo(18.0981f, 8.3703f, 17.9033f, 8.8034f, 17.516f, 8.9503f)
                lineTo(12.75f, 10.7585f)
                verticalLineTo(16.2491f)
                curveTo(12.75f, 16.6634f, 12.4142f, 16.9991f, 12.0f, 16.9991f)
                curveTo(11.5858f, 16.9991f, 11.25f, 16.6634f, 11.25f, 16.2491f)
                verticalLineTo(10.7586f)
                lineTo(6.4839f, 8.9503f)
                curveTo(6.0966f, 8.8034f, 5.9018f, 8.3703f, 6.0487f, 7.9831f)
                close()
                moveTo(10.5911f, 2.5111f)
                curveTo(11.4947f, 2.1448f, 12.5053f, 2.1448f, 13.4089f, 2.5111f)
                lineTo(20.9075f, 5.551f)
                curveTo(21.5679f, 5.8188f, 22.0f, 6.4602f, 22.0f, 7.1728f)
                verticalLineTo(16.8255f)
                curveTo(22.0f, 17.5381f, 21.5679f, 18.1796f, 20.9075f, 18.4473f)
                lineTo(13.4089f, 21.4873f)
                curveTo(12.5053f, 21.8536f, 11.4947f, 21.8536f, 10.5911f, 21.4873f)
                lineTo(3.0925f, 18.4473f)
                curveTo(2.4321f, 18.1796f, 2.0f, 17.5381f, 2.0f, 16.8255f)
                verticalLineTo(7.1728f)
                curveTo(2.0f, 6.4602f, 2.4321f, 5.8188f, 3.0925f, 5.551f)
                lineTo(10.5911f, 2.5111f)
                close()
                moveTo(12.8453f, 3.9012f)
                curveTo(12.3032f, 3.6814f, 11.6968f, 3.6814f, 11.1547f, 3.9012f)
                lineTo(3.6561f, 6.9411f)
                curveTo(3.5617f, 6.9794f, 3.5f, 7.071f, 3.5f, 7.1728f)
                verticalLineTo(16.8255f)
                curveTo(3.5f, 16.9273f, 3.5617f, 17.019f, 3.6561f, 17.0572f)
                lineTo(11.1547f, 20.0972f)
                curveTo(11.6968f, 20.317f, 12.3032f, 20.317f, 12.8453f, 20.0972f)
                lineTo(20.3439f, 17.0572f)
                curveTo(20.4383f, 17.019f, 20.5f, 16.9273f, 20.5f, 16.8255f)
                verticalLineTo(7.1728f)
                curveTo(20.5f, 7.071f, 20.4383f, 6.9794f, 20.3439f, 6.9411f)
                lineTo(12.8453f, 3.9012f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null

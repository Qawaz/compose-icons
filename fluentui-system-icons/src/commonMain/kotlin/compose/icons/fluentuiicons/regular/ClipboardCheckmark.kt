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

public val RegularGroup.ClipboardCheckmark: ImageVector
    get() {
        if (_clipboardCheckmark != null) {
            return _clipboardCheckmark!!
        }
        _clipboardCheckmark = Builder(name = "ClipboardCheckmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
                curveTo(14.9089f, 2.0f, 15.8631f, 2.8761f, 15.9865f, 4.0021f)
                curveTo(15.9864f, 4.0012f, 15.9863f, 4.0003f, 15.9862f, 3.9994f)
                lineTo(17.75f, 4.0f)
                curveTo(18.9926f, 4.0f, 20.0f, 5.0074f, 20.0f, 6.25f)
                verticalLineTo(11.4982f)
                curveTo(19.5258f, 11.3004f, 19.0232f, 11.1572f, 18.5f, 11.0764f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 5.8358f, 18.1642f, 5.5f, 17.75f, 5.5f)
                lineTo(15.621f, 5.5002f)
                curveTo(15.2173f, 6.1031f, 14.53f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.47f, 6.5f, 8.7826f, 6.1031f, 8.379f, 5.5002f)
                lineTo(6.25f, 5.5f)
                curveTo(5.8358f, 5.5f, 5.5f, 5.8358f, 5.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.1642f, 5.8358f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(11.7322f)
                curveTo(12.0194f, 21.051f, 12.3832f, 21.5557f, 12.8096f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4.0f, 5.0074f, 5.0074f, 4.0f, 6.25f, 4.0f)
                lineTo(8.0138f, 3.9994f)
                curveTo(8.1384f, 2.8747f, 9.092f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(15.9948f, 4.096f)
                lineTo(16.0f, 4.25f)
                curveTo(16.0f, 4.1982f, 15.9983f, 4.1469f, 15.9948f, 4.096f)
                close()
                moveTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 3.5f, 9.5f, 3.8358f, 9.5f, 4.25f)
                curveTo(9.5f, 4.6642f, 9.8358f, 5.0f, 10.25f, 5.0f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 5.0f, 14.5f, 4.6642f, 14.5f, 4.25f)
                curveTo(14.5f, 3.8358f, 14.1642f, 3.5f, 13.75f, 3.5f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(20.8536f, 15.1464f)
                curveTo(20.6583f, 14.9512f, 20.3417f, 14.9512f, 20.1464f, 15.1464f)
                lineTo(16.5f, 18.7929f)
                lineTo(14.8536f, 17.1464f)
                curveTo(14.6583f, 16.9512f, 14.3417f, 16.9512f, 14.1464f, 17.1464f)
                curveTo(13.9512f, 17.3417f, 13.9512f, 17.6583f, 14.1464f, 17.8536f)
                lineTo(16.1464f, 19.8536f)
                curveTo(16.3417f, 20.0488f, 16.6583f, 20.0488f, 16.8536f, 19.8536f)
                lineTo(20.8536f, 15.8536f)
                curveTo(21.0488f, 15.6583f, 21.0488f, 15.3417f, 20.8536f, 15.1464f)
                close()
            }
        }
        .build()
        return _clipboardCheckmark!!
    }

private var _clipboardCheckmark: ImageVector? = null

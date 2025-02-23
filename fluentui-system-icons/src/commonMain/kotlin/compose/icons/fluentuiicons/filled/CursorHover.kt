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

public val FilledGroup.CursorHover: ImageVector
    get() {
        if (_cursorHover != null) {
            return _cursorHover!!
        }
        _cursorHover = Builder(name = "CursorHover", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 4.0f)
                curveTo(3.1193f, 4.0f, 2.0f, 5.1193f, 2.0f, 6.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 16.8807f, 3.1193f, 18.0f, 4.5f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.75f)
                curveTo(9.0f, 10.0905f, 9.3707f, 9.4871f, 9.959f, 9.189f)
                curveTo(10.5472f, 8.8909f, 11.2531f, 8.9488f, 11.7849f, 9.3388f)
                lineTo(19.2849f, 16.8388f)
                curveTo(19.6598f, 17.1137f, 19.9f, 17.5176f, 19.975f, 17.9549f)
                curveTo(21.1285f, 17.7331f, 22.0f, 16.7183f, 22.0f, 15.5f)
                verticalLineTo(6.5f)
                curveTo(22.0f, 5.1193f, 20.8807f, 4.0f, 19.5f, 4.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(11.2803f, 10.2197f)
                curveTo(11.0658f, 10.0052f, 10.7432f, 9.941f, 10.463f, 10.0571f)
                curveTo(10.1827f, 10.1732f, 10.0f, 10.4467f, 10.0f, 10.75f)
                verticalLineTo(21.25f)
                curveTo(10.0f, 21.5785f, 10.2138f, 21.8688f, 10.5275f, 21.9663f)
                curveTo(10.8413f, 22.0637f, 11.1819f, 21.9456f, 11.368f, 21.6749f)
                lineTo(13.8348f, 18.0869f)
                lineTo(18.0955f, 18.9839f)
                curveTo(18.4203f, 19.0523f, 18.7514f, 18.8991f, 18.9095f, 18.6073f)
                curveTo(19.0675f, 18.3154f, 19.015f, 17.9544f, 18.7803f, 17.7197f)
                lineTo(11.2803f, 10.2197f)
                close()
            }
        }
        .build()
        return _cursorHover!!
    }

private var _cursorHover: ImageVector? = null

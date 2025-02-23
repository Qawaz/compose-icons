package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SmartDisplay: ImageVector
    get() {
        if (_smartDisplay != null) {
            return _smartDisplay!!
        }
        _smartDisplay = Builder(name = "SmartDisplay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(9.5f, 14.67f)
                verticalLineTo(9.33f)
                curveToRelative(0.0f, -0.79f, 0.88f, -1.27f, 1.54f, -0.84f)
                lineToRelative(4.15f, 2.67f)
                curveToRelative(0.61f, 0.39f, 0.61f, 1.29f, 0.0f, 1.68f)
                lineToRelative(-4.15f, 2.67f)
                curveTo(10.38f, 15.94f, 9.5f, 15.46f, 9.5f, 14.67f)
                close()
            }
        }
        .build()
        return _smartDisplay!!
    }

private var _smartDisplay: ImageVector? = null

package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CheckboxCircleFill: ImageVector
    get() {
        if (_checkboxCircleFill != null) {
            return _checkboxCircleFill!!
        }
        _checkboxCircleFill = Builder(name = "CheckboxCircleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(11.003f, 16.0f)
                lineToRelative(7.07f, -7.071f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-5.656f, 5.657f)
                lineToRelative(-2.829f, -2.829f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(11.003f, 16.0f)
                close()
            }
        }
        .build()
        return _checkboxCircleFill!!
    }

private var _checkboxCircleFill: ImageVector? = null

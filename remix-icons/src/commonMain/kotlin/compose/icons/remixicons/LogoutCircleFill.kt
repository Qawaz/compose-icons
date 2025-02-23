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

public val RemixIcons.LogoutCircleFill: ImageVector
    get() {
        if (_logoutCircleFill != null) {
            return _logoutCircleFill!!
        }
        _logoutCircleFill = Builder(name = "LogoutCircleFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineTo(8.0f)
                lineToRelative(-5.0f, 4.0f)
                lineToRelative(5.0f, 4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _logoutCircleFill!!
    }

private var _logoutCircleFill: ImageVector? = null

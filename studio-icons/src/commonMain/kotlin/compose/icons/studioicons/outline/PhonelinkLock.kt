package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PhonelinkLock: ImageVector
    get() {
        if (_phonelinkLock != null) {
            return _phonelinkLock!!
        }
        _phonelinkLock = Builder(name = "PhonelinkLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 1.0f)
                lineTo(9.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(16.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(10.8f, 11.0f)
                lineTo(10.8f, 9.5f)
                curveTo(10.8f, 8.1f, 9.4f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveTo(5.2f, 8.1f, 5.2f, 9.5f)
                lineTo(5.2f, 11.0f)
                curveToRelative(-0.6f, 0.0f, -1.2f, 0.6f, -1.2f, 1.2f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.7f, 0.6f, 1.3f, 1.2f, 1.3f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.7f, 0.0f, 1.3f, -0.6f, 1.3f, -1.2f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.7f, -0.6f, -1.3f, -1.2f, -1.3f)
                close()
                moveTo(9.5f, 11.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.5f, 9.5f)
                curveToRelative(0.0f, -0.8f, 0.7f, -1.3f, 1.5f, -1.3f)
                reflectiveCurveToRelative(1.5f, 0.5f, 1.5f, 1.3f)
                lineTo(9.5f, 11.0f)
                close()
            }
        }
        .build()
        return _phonelinkLock!!
    }

private var _phonelinkLock: ImageVector? = null

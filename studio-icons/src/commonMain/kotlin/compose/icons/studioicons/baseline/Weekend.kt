package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Weekend: ImageVector
    get() {
        if (_weekend != null) {
            return _weekend!!
        }
        _weekend = Builder(name = "Weekend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveTo(23.0f, 10.9f, 22.1f, 10.0f, 21.0f, 10.0f)
                close()
                moveTo(18.0f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 5.0f, 4.0f, 5.9f, 4.0f, 7.0f)
                verticalLineToRelative(2.15f)
                curveToRelative(1.16f, 0.41f, 2.0f, 1.52f, 2.0f, 2.81f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.03f)
                curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.81f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 5.9f, 19.1f, 5.0f, 18.0f, 5.0f)
                close()
            }
        }
        .build()
        return _weekend!!
    }

private var _weekend: ImageVector? = null

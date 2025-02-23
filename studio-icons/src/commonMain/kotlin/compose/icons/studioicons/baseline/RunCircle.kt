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

public val BaselineGroup.RunCircle: ImageVector
    get() {
        if (_runCircle != null) {
            return _runCircle!!
        }
        _runCircle = Builder(name = "RunCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.5f, 6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(-0.7f, 0.0f, -2.01f, -0.54f, -2.91f, -1.76f)
                lineToRelative(-0.41f, 2.35f)
                lineTo(14.0f, 14.03f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.58f)
                lineToRelative(-1.11f, -1.21f)
                lineToRelative(-0.52f, 2.64f)
                lineTo(7.6f, 15.08f)
                lineToRelative(0.2f, -0.98f)
                lineToRelative(2.78f, 0.57f)
                lineToRelative(0.96f, -4.89f)
                lineTo(10.0f, 10.35f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.65f)
                lineToRelative(3.28f, -1.21f)
                curveToRelative(0.49f, -0.18f, 1.03f, 0.06f, 1.26f, 0.53f)
                curveTo(14.37f, 10.67f, 15.59f, 11.0f, 16.0f, 11.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _runCircle!!
    }

private var _runCircle: ImageVector? = null

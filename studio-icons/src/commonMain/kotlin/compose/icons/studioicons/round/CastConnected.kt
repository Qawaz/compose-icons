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

public val RoundGroup.CastConnected: ImageVector
    get() {
        if (_castConnected != null) {
            return _castConnected!!
        }
        _castConnected = Builder(name = "CastConnected", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                lineTo(19.0f, 8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(6.0f, 7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.63f)
                curveToRelative(3.96f, 1.28f, 7.09f, 4.41f, 8.37f, 8.37f)
                lineTo(18.0f, 17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                close()
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(1.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -0.62f, -0.19f, -1.2f, -0.51f, -1.68f)
                curveTo(2.95f, 18.52f, 2.04f, 18.0f, 1.0f, 18.0f)
                close()
                moveTo(2.14f, 14.09f)
                curveToRelative(-0.6f, -0.1f, -1.14f, 0.39f, -1.14f, 1.0f)
                curveToRelative(0.0f, 0.49f, 0.36f, 0.9f, 0.85f, 0.98f)
                curveToRelative(2.08f, 0.36f, 3.72f, 2.0f, 4.08f, 4.08f)
                curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f)
                curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 1.0f, -1.14f)
                curveToRelative(-0.48f, -2.96f, -2.82f, -5.29f, -5.77f, -5.77f)
                close()
                moveTo(2.1f, 10.05f)
                curveToRelative(-0.59f, -0.05f, -1.1f, 0.41f, -1.1f, 1.0f)
                curveToRelative(0.0f, 0.51f, 0.38f, 0.94f, 0.88f, 0.99f)
                curveToRelative(4.27f, 0.41f, 7.67f, 3.81f, 8.08f, 8.08f)
                curveToRelative(0.05f, 0.5f, 0.48f, 0.87f, 0.99f, 0.87f)
                curveToRelative(0.6f, 0.0f, 1.06f, -0.52f, 1.0f, -1.11f)
                curveToRelative(-0.53f, -5.19f, -4.66f, -9.31f, -9.85f, -9.83f)
                close()
            }
        }
        .build()
        return _castConnected!!
    }

private var _castConnected: ImageVector? = null

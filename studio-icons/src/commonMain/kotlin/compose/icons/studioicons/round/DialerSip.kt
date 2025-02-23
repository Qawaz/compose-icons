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

public val RoundGroup.DialerSip: ImageVector
    get() {
        if (_dialerSip != null) {
            return _dialerSip!!
        }
        _dialerSip = Builder(name = "DialerSip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 8.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(12.5f, 7.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.3f, 0.0f, 0.55f, -0.25f, 0.55f, -0.55f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0.0f, -0.3f, -0.25f, -0.55f, -0.55f, -0.55f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(-0.3f, 0.0f, -0.55f, 0.25f, -0.55f, 0.55f)
                verticalLineToRelative(1.89f)
                curveToRelative(0.0f, 0.31f, 0.25f, 0.56f, 0.55f, 0.56f)
                lineTo(14.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(20.45f, 3.0f)
                horizontalLineToRelative(-1.89f)
                curveToRelative(-0.31f, 0.0f, -0.56f, 0.25f, -0.56f, 0.55f)
                lineTo(18.0f, 7.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(19.0f, 6.0f)
                horizontalLineToRelative(1.45f)
                curveToRelative(0.3f, 0.0f, 0.55f, -0.25f, 0.55f, -0.55f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0.0f, -0.3f, -0.25f, -0.55f, -0.55f, -0.55f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.21f, 15.27f)
                lineToRelative(-2.54f, -0.29f)
                curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f)
                lineToRelative(-1.84f, 1.84f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(1.85f, -1.85f)
                curveToRelative(0.43f, -0.43f, 0.64f, -1.04f, 0.57f, -1.64f)
                lineToRelative(-0.29f, -2.52f)
                curveToRelative(-0.11f, -1.01f, -0.97f, -1.78f, -1.98f, -1.78f)
                lineTo(5.02f, 3.01f)
                curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f)
                curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f)
                curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f)
                verticalLineToRelative(-1.73f)
                curveToRelative(0.01f, -1.0f, -0.76f, -1.86f, -1.77f, -1.97f)
                close()
            }
        }
        .build()
        return _dialerSip!!
    }

private var _dialerSip: ImageVector? = null

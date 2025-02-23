package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CleanHands: ImageVector
    get() {
        if (_cleanHands != null) {
            return _cleanHands!!
        }
        _cleanHands = Builder(name = "CleanHands", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.99f, 7.0f)
                lineToRelative(1.37f, -0.63f)
                lineTo(16.99f, 5.0f)
                lineToRelative(0.63f, 1.37f)
                lineTo(18.99f, 7.0f)
                lineToRelative(-1.37f, 0.63f)
                lineTo(16.99f, 9.0f)
                lineToRelative(-0.63f, -1.37f)
                lineTo(14.99f, 7.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -2.0f, -4.0f, -2.0f, -4.0f)
                reflectiveCurveToRelative(-2.0f, 2.9f, -2.0f, 4.0f)
                curveTo(18.0f, 13.1f, 18.9f, 14.0f, 20.0f, 14.0f)
                close()
                moveTo(1.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(9.24f, 9.5f)
                lineTo(15.0f, 11.65f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -2.42f, -1.72f, -4.44f, -4.0f, -4.9f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.57f, 0.0f, 1.1f, 0.17f, 1.55f, 0.45f)
                lineToRelative(1.43f, -1.43f)
                curveTo(15.15f, 2.39f, 14.13f, 2.0f, 13.0f, 2.0f)
                curveToRelative(-1.48f, 0.0f, -5.5f, 0.0f, -5.5f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.11f)
                curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f)
                horizontalLineTo(9.24f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(-9.0f)
                lineToRelative(-2.09f, -0.73f)
                lineToRelative(0.33f, -0.94f)
                lineTo(13.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-8.03f, -3.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(9.02f)
                lineTo(14.0f, 22.0f)
                lineToRelative(8.0f, -3.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _cleanHands!!
    }

private var _cleanHands: ImageVector? = null

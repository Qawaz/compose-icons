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

public val SharpGroup.GroupOff: ImageVector
    get() {
        if (_groupOff != null) {
            return _groupOff!!
        }
        _groupOff = Builder(name = "GroupOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                curveToRelative(0.0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f)
                curveTo(14.09f, 4.1f, 14.53f, 4.0f, 15.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                curveToRelative(-0.06f, 0.0f, -0.12f, 0.0f, -0.18f, 0.0f)
                lineToRelative(-0.77f, -0.77f)
                curveTo(14.65f, 10.29f, 15.0f, 9.18f, 15.0f, 8.0f)
                close()
                moveTo(22.83f, 20.0f)
                horizontalLineTo(23.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.18f, -3.58f, -3.47f, -6.34f, -3.87f)
                curveToRelative(1.1f, 0.75f, 1.95f, 1.71f, 2.23f, 2.94f)
                lineTo(22.83f, 20.0f)
                close()
                moveTo(7.24f, 4.41f)
                curveTo(7.77f, 4.15f, 8.37f, 4.0f, 9.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f)
                lineTo(7.24f, 4.41f)
                close()
                moveTo(9.17f, 12.0f)
                curveTo(9.11f, 12.0f, 9.06f, 12.0f, 9.0f, 12.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.17f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(17.0f, 19.83f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.66f, 5.33f, -4.0f, 8.0f, -4.0f)
                curveToRelative(0.37f, 0.0f, 0.8f, 0.03f, 1.25f, 0.08f)
                lineTo(9.17f, 12.0f)
                close()
            }
        }
        .build()
        return _groupOff!!
    }

private var _groupOff: ImageVector? = null

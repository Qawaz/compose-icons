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

public val SharpGroup.PrivateConnectivity: ImageVector
    get() {
        if (_privateConnectivity != null) {
            return _privateConnectivity!!
        }
        _privateConnectivity = Builder(name = "PrivateConnectivity", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.93f, 11.0f)
                curveToRelative(-0.49f, -3.39f, -3.4f, -6.0f, -6.93f, -6.0f)
                reflectiveCurveToRelative(-6.44f, 2.61f, -6.93f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.07f)
                curveToRelative(0.49f, 3.39f, 3.4f, 6.0f, 6.93f, 6.0f)
                reflectiveCurveToRelative(6.44f, -2.61f, 6.93f, -6.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(18.93f)
                close()
                moveTo(15.0f, 10.5f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.21f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveTo(13.32f, 7.69f, 14.0f, 8.61f, 14.0f, 9.61f)
                lineToRelative(0.0f, 0.89f)
                horizontalLineTo(15.0f)
                close()
                moveTo(12.75f, 13.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveTo(12.75f, 12.59f, 12.75f, 13.0f)
                close()
                moveTo(13.0f, 9.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveTo(13.0f, 8.95f, 13.0f, 9.5f)
                close()
            }
        }
        .build()
        return _privateConnectivity!!
    }

private var _privateConnectivity: ImageVector? = null

package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.NoAccounts: ImageVector
    get() {
        if (_noAccounts != null) {
            return _noAccounts!!
        }
        _noAccounts = Builder(name = "NoAccounts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-0.52f, 0.0f, -1.0f, 0.12f, -1.44f, 0.32f)
                lineToRelative(4.62f, 4.62f)
                curveToRelative(0.2f, -0.44f, 0.32f, -0.92f, 0.32f, -1.44f)
                curveTo(15.5f, 7.57f, 13.93f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f)
                lineToRelative(2.86f, 2.86f)
                curveToRelative(0.21f, 1.56f, 1.43f, 2.79f, 2.99f, 2.99f)
                lineToRelative(2.2f, 2.2f)
                curveTo(13.17f, 15.05f, 12.59f, 15.0f, 12.0f, 15.0f)
                curveToRelative(-2.32f, 0.0f, -4.45f, 0.8f, -6.14f, 2.12f)
                curveTo(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-1.74f, 0.0f, -3.34f, -0.56f, -4.65f, -1.5f)
                curveTo(8.66f, 17.56f, 10.26f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveToRelative(3.34f, 0.56f, 4.65f, 1.5f)
                curveTo(15.34f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(18.31f, 16.9f)
                lineTo(7.1f, 5.69f)
                curveTo(8.45f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                curveTo(20.0f, 13.85f, 19.37f, 15.54f, 18.31f, 16.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.35f, 18.5f)
                curveTo(8.66f, 19.44f, 10.26f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(3.34f, -0.56f, 4.65f, -1.5f)
                curveTo(15.34f, 17.56f, 13.74f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(8.66f, 17.56f, 7.35f, 18.5f)
                close()
                moveTo(15.18f, 10.94f)
                lineToRelative(-4.62f, -4.62f)
                curveTo(11.0f, 6.12f, 11.48f, 6.0f, 12.0f, 6.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveTo(15.5f, 10.02f, 15.38f, 10.5f, 15.18f, 10.94f)
                close()
            }
        }
        .build()
        return _noAccounts!!
    }

private var _noAccounts: ImageVector? = null

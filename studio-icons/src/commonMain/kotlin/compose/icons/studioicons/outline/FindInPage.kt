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

public val OutlineGroup.FindInPage: ImageVector
    get() {
        if (_findInPage != null) {
            return _findInPage!!
        }
        _findInPage = Builder(name = "FindInPage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                lineTo(18.0f, 22.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(20.0f, 8.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(8.58f)
                lineToRelative(-1.84f, -1.84f)
                curveToRelative(1.28f, -1.94f, 1.07f, -4.57f, -0.64f, -6.28f)
                curveTo(14.55f, 8.49f, 13.28f, 8.0f, 12.0f, 8.0f)
                curveToRelative(-1.28f, 0.0f, -2.55f, 0.49f, -3.53f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.11f, 0.0f, 7.05f)
                curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.53f, 1.46f)
                curveToRelative(0.96f, 0.0f, 1.92f, -0.28f, 2.75f, -0.83f)
                lineTo(17.6f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(14.11f, 15.1f)
                curveToRelative(-0.56f, 0.56f, -1.31f, 0.88f, -2.11f, 0.88f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.11f, -0.88f)
                curveToRelative(-0.56f, -0.56f, -0.88f, -1.31f, -0.88f, -2.11f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.11f)
                curveToRelative(0.56f, -0.57f, 1.31f, -0.88f, 2.11f, -0.88f)
                reflectiveCurveToRelative(1.55f, 0.31f, 2.11f, 0.88f)
                curveToRelative(0.56f, 0.56f, 0.88f, 1.31f, 0.88f, 2.11f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.11f)
                close()
            }
        }
        .build()
        return _findInPage!!
    }

private var _findInPage: ImageVector? = null

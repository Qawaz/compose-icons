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

public val TwotoneGroup.MobileScreenShare: ImageVector
    get() {
        if (_mobileScreenShare != null) {
            return _mobileScreenShare!!
        }
        _mobileScreenShare = Builder(name = "MobileScreenShare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.8f, 10.72f)
                verticalLineToRelative(-1.7f)
                lineTo(16.0f, 12.0f)
                lineToRelative(-3.2f, 2.99f)
                verticalLineToRelative(-1.75f)
                curveToRelative(-2.22f, 0.0f, -3.69f, 0.68f, -4.8f, 2.18f)
                curveToRelative(0.45f, -2.14f, 1.69f, -4.27f, 4.8f, -4.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 1.0f)
                lineTo(7.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.85f, -1.99f, 1.95f)
                verticalLineToRelative(18.0f)
                curveTo(5.01f, 22.05f, 5.9f, 23.0f, 7.0f, 23.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.95f, 2.0f, -2.05f)
                lineTo(19.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.8f, 13.24f)
                verticalLineToRelative(1.75f)
                lineTo(16.0f, 12.0f)
                lineToRelative(-3.2f, -2.98f)
                verticalLineToRelative(1.7f)
                curveToRelative(-3.11f, 0.43f, -4.35f, 2.56f, -4.8f, 4.7f)
                curveToRelative(1.11f, -1.5f, 2.58f, -2.18f, 4.8f, -2.18f)
                close()
            }
        }
        .build()
        return _mobileScreenShare!!
    }

private var _mobileScreenShare: ImageVector? = null

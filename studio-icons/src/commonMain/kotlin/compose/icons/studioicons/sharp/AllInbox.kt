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

public val SharpGroup.AllInbox: ImageVector
    get() {
        if (_allInbox != null) {
            return _allInbox!!
        }
        _allInbox = Builder(name = "AllInbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, 1.62f, -1.38f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.38f, -3.0f, -3.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _allInbox!!
    }

private var _allInbox: ImageVector? = null

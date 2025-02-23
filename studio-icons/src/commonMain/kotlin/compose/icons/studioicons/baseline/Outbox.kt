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

public val BaselineGroup.Outbox: ImageVector
    get() {
        if (_outbox != null) {
            return _outbox!!
        }
        _outbox = Builder(name = "Outbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(4.99f, 3.0f)
                curveToRelative(-1.11f, 0.0f, -1.98f, 0.9f, -1.98f, 2.0f)
                lineTo(3.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.88f, 2.0f, 1.99f, 2.0f)
                lineTo(19.0f, 21.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, 1.66f, -1.35f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                lineTo(4.99f, 15.0f)
                lineTo(4.99f, 5.0f)
                lineTo(19.0f, 5.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _outbox!!
    }

private var _outbox: ImageVector? = null

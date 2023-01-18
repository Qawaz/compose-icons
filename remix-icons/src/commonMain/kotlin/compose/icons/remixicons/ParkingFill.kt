package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ParkingFill: ImageVector
    get() {
        if (_parkingFill != null) {
            return _parkingFill!!
        }
        _parkingFill = Builder(name = "ParkingFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(10.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _parkingFill!!
    }

private var _parkingFill: ImageVector? = null

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

public val RemixIcons.ParkingBoxLine: ImageVector
    get() {
        if (_parkingBoxLine != null) {
            return _parkingBoxLine!!
        }
        _parkingBoxLine = Builder(name = "ParkingBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(11.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(11.0f, 9.0f)
                close()
            }
        }
        .build()
        return _parkingBoxLine!!
    }

private var _parkingBoxLine: ImageVector? = null

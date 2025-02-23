package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ZoomInMap: ImageVector
    get() {
        if (_zoomInMap != null) {
            return _zoomInMap!!
        }
        _zoomInMap = Builder(name = "ZoomInMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                lineToRelative(0.0f, -6.0f)
                lineTo(7.0f, 3.0f)
                lineToRelative(0.0f, 2.59f)
                lineTo(3.91f, 2.5f)
                lineTo(2.5f, 3.91f)
                lineTo(5.59f, 7.0f)
                lineTo(3.0f, 7.0f)
                lineToRelative(0.0f, 2.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(21.0f, 9.0f)
                verticalLineTo(7.0f)
                lineToRelative(-2.59f, 0.0f)
                lineToRelative(3.09f, -3.09f)
                lineTo(20.09f, 2.5f)
                lineTo(17.0f, 5.59f)
                verticalLineTo(3.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineTo(21.0f, 9.0f)
                close()
                moveTo(3.0f, 15.0f)
                lineToRelative(0.0f, 2.0f)
                horizontalLineToRelative(2.59f)
                lineTo(2.5f, 20.09f)
                lineToRelative(1.41f, 1.41f)
                lineTo(7.0f, 18.41f)
                lineTo(7.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.0f, -6.0f)
                lineTo(3.0f, 15.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineToRelative(0.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.59f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(1.41f, -1.41f)
                lineTo(18.41f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-2.0f)
                lineTo(15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _zoomInMap!!
    }

private var _zoomInMap: ImageVector? = null

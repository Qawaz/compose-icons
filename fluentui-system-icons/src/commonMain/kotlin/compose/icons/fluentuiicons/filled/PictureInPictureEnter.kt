package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PictureInPictureEnter: ImageVector
    get() {
        if (_pictureInPictureEnter != null) {
            return _pictureInPictureEnter!!
        }
        _pictureInPictureEnter = Builder(name = "PictureInPictureEnter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 3.0f)
                curveTo(3.4551f, 3.0f, 2.0f, 4.4551f, 2.0f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 17.5449f, 3.4551f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 13.3431f, 12.3431f, 12.0f, 14.0f, 12.0f)
                horizontalLineTo(21.0f)
                curveTo(21.3506f, 12.0f, 21.6872f, 12.0602f, 22.0f, 12.1707f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 4.4551f, 20.5449f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6.2803f, 6.2197f)
                lineTo(9.5f, 9.4393f)
                verticalLineTo(7.75f)
                curveTo(9.5f, 7.3358f, 9.8358f, 7.0f, 10.25f, 7.0f)
                curveTo(10.6642f, 7.0f, 11.0f, 7.3358f, 11.0f, 7.75f)
                verticalLineTo(11.25f)
                curveTo(11.0f, 11.6642f, 10.6642f, 12.0f, 10.25f, 12.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 12.0f, 6.0f, 11.6642f, 6.0f, 11.25f)
                curveTo(6.0f, 10.8358f, 6.3358f, 10.5f, 6.75f, 10.5f)
                horizontalLineTo(8.4393f)
                lineTo(5.2197f, 7.2803f)
                curveTo(4.9268f, 6.9874f, 4.9268f, 6.5126f, 5.2197f, 6.2197f)
                curveTo(5.5126f, 5.9268f, 5.9874f, 5.9268f, 6.2803f, 6.2197f)
                close()
                moveTo(22.0f, 13.2676f)
                curveTo(21.7058f, 13.0974f, 21.3643f, 13.0f, 21.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 13.0f, 12.0f, 13.8954f, 12.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(12.0f, 21.1046f, 12.8954f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1046f, 22.0f, 23.0f, 21.1046f, 23.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 14.2597f, 22.5978f, 13.6134f, 22.0f, 13.2676f)
                close()
            }
        }
        .build()
        return _pictureInPictureEnter!!
    }

private var _pictureInPictureEnter: ImageVector? = null

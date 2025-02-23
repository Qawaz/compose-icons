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

public val FilledGroup.CommentOff: ImageVector
    get() {
        if (_commentOff != null) {
            return _commentOff!!
        }
        _commentOff = Builder(name = "CommentOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(2.9218f, 3.9824f)
                curveTo(2.3514f, 4.568f, 2.0f, 5.368f, 2.0f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(2.0f, 16.5449f, 3.4551f, 18.0f, 5.25f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.75f)
                curveTo(6.0f, 21.7801f, 7.176f, 22.368f, 8.0f, 21.75f)
                lineTo(13.0f, 18.0f)
                horizontalLineTo(16.939f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(22.0f, 14.75f)
                curveTo(22.0f, 15.8565f, 21.4471f, 16.8338f, 20.6024f, 17.4207f)
                lineTo(6.182f, 3.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 3.0f, 22.0f, 4.4551f, 22.0f, 6.25f)
                verticalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _commentOff!!
    }

private var _commentOff: ImageVector? = null

package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) {
            return _arrowsClockwise!!
        }
        _arrowsClockwise = Builder(name = "ArrowsClockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.2f, 51.7f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.7f, -13.6f)
                lineToRelative(18.4f, -18.4f)
                lineToRelative(-4.3f, -4.3f)
                arcToRelative(80.2f, 80.2f, 0.0f, false, false, -113.2f, 0.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.3f)
                arcToRelative(96.2f, 96.2f, 0.0f, false, true, 135.8f, 0.0f)
                lineToRelative(4.3f, 4.3f)
                lineToRelative(18.3f, -18.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.7f, -1.8f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 232.2f, 51.7f)
                close()
                moveTo(184.6f, 184.6f)
                arcToRelative(80.2f, 80.2f, 0.0f, false, true, -113.2f, 0.0f)
                lineToRelative(-4.3f, -4.3f)
                lineToRelative(18.4f, -18.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.7f, -13.6f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.0f, 7.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, 0.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.7f, -2.4f)
                lineToRelative(18.3f, -18.3f)
                lineToRelative(4.3f, 4.3f)
                arcToRelative(96.1f, 96.1f, 0.0f, false, false, 135.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 184.6f, 184.6f)
                close()
            }
        }
        .build()
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null

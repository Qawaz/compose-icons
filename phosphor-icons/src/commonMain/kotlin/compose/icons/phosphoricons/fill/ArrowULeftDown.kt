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

public val FillGroup.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) {
            return _arrowULeftDown!!
        }
        _arrowULeftDown = Builder(name = "ArrowULeftDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.4f, 4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, 8.8f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, -8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 168.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null

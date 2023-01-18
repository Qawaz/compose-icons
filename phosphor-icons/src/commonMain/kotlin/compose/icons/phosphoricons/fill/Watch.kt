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

public val FillGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.3f, 63.5f)
                lineToRelative(-6.2f, -34.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 153.3f, 16.0f)
                lineTo(102.7f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 86.9f, 29.1f)
                lineTo(80.7f, 63.5f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, 129.0f)
                lineToRelative(6.2f, 34.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 102.7f, 240.0f)
                horizontalLineToRelative(50.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.8f, -13.1f)
                lineToRelative(6.2f, -34.4f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -129.0f)
                close()
                moveTo(102.7f, 32.0f)
                horizontalLineToRelative(50.6f)
                lineToRelative(3.9f, 21.6f)
                arcToRelative(78.9f, 78.9f, 0.0f, false, false, -58.4f, 0.0f)
                close()
                moveTo(153.3f, 224.0f)
                lineTo(102.7f, 224.0f)
                lineToRelative(-3.9f, -21.6f)
                arcToRelative(78.9f, 78.9f, 0.0f, false, false, 58.4f, 0.0f)
                close()
                moveTo(168.0f, 136.0f)
                lineTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null

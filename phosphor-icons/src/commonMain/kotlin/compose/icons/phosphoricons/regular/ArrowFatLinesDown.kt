package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) {
            return _arrowFatLinesDown!!
        }
        _arrowFatLinesDown = Builder(name = "ArrowFatLinesDown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.4f, 132.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 128.0f)
                lineTo(184.0f, 128.0f)
                lineTo(184.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(80.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                lineTo(32.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.4f, 4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.7f, 8.8f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(8.4f, 8.4f, 0.0f, false, false, 231.4f, 132.9f)
                close()
                moveTo(128.0f, 220.7f)
                lineTo(51.3f, 144.0f)
                lineTo(80.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(88.0f, 112.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(28.7f)
                close()
                moveTo(72.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(80.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 40.0f)
                close()
                moveTo(72.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 72.0f)
                close()
            }
        }
        .build()
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null

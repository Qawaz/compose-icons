package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FileArrowDown: ImageVector
    get() {
        if (_fileArrowDown != null) {
            return _fileArrowDown!!
        }
        _fileArrowDown = Builder(name = "FileArrowDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.2f, 83.8f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                lineTo(42.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 88.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 212.2f, 83.8f)
                close()
                moveTo(158.0f, 46.5f)
                lineTo(193.5f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
                moveTo(200.0f, 218.0f)
                lineTo(56.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                lineTo(202.0f, 216.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 200.0f, 218.0f)
                close()
                moveTo(160.2f, 151.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-28.0f, 28.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineToRelative(-28.0f, -28.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(122.0f, 169.5f)
                lineTo(122.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(49.5f)
                lineToRelative(17.8f, -17.7f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 160.2f, 151.8f)
                close()
            }
        }
        .build()
        return _fileArrowDown!!
    }

private var _fileArrowDown: ImageVector? = null

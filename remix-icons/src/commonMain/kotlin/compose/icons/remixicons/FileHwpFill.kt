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

public val RemixIcons.FileHwpFill: ImageVector
    get() {
        if (_fileHwpFill != null) {
            return _fileHwpFill!!
        }
        _fileHwpFill = Builder(name = "FileHwpFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(13.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.007f, 22.0f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.447f, 2.0f, 3.999f, 2.0f)
                lineTo(16.0f, 2.0f)
                close()
                moveTo(9.333f, 14.667f)
                lineTo(8.0f, 14.667f)
                lineTo(8.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.333f)
                lineToRelative(-6.667f, -0.001f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 14.333f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
                moveTo(12.0f, 10.333f)
                arcToRelative(1.167f, 1.167f, 0.0f, true, true, 0.0f, 2.334f)
                arcToRelative(1.167f, 1.167f, 0.0f, false, true, 0.0f, -2.334f)
                close()
                moveTo(12.667f, 6.0f)
                horizontalLineToRelative(-1.334f)
                verticalLineToRelative(1.333f)
                lineTo(8.0f, 7.333f)
                verticalLineToRelative(1.334f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 7.333f)
                horizontalLineToRelative(-3.334f)
                lineTo(12.666f, 6.0f)
                close()
            }
        }
        .build()
        return _fileHwpFill!!
    }

private var _fileHwpFill: ImageVector? = null

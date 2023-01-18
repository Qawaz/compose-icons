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

public val RemixIcons.FileShredLine: ImageVector
    get() {
        if (_fileShredLine != null) {
            return _fileShredLine!!
        }
        _fileShredLine = Builder(name = "FileShredLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(14.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(4.0f, 12.0f)
                lineTo(4.0f, 2.995f)
                curveToRelative(0.0f, -0.55f, 0.445f, -0.995f, 0.996f, -0.995f)
                lineTo(15.0f, 2.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _fileShredLine!!
    }

private var _fileShredLine: ImageVector? = null

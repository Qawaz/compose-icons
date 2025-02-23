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

public val RemixIcons.DeleteBin4Line: ImageVector
    get() {
        if (_deleteBin4Line != null) {
            return _deleteBin4Line!!
        }
        _deleteBin4Line = Builder(name = "DeleteBin4Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 4.0f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _deleteBin4Line!!
    }

private var _deleteBin4Line: ImageVector? = null

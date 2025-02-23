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

public val RemixIcons.FileUnknowFill: ImageVector
    get() {
        if (_fileUnknowFill != null) {
            return _fileUnknowFill!!
        }
        _fileUnknowFill = Builder(name = "FileUnknowFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(14.008f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                lineTo(16.0f, 2.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 13.355f)
                arcTo(3.502f, 3.502f, 0.0f, false, false, 12.0f, 6.5f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, -3.433f, 2.813f)
                lineToRelative(1.962f, 0.393f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(11.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.645f)
                close()
            }
        }
        .build()
        return _fileUnknowFill!!
    }

private var _fileUnknowFill: ImageVector? = null

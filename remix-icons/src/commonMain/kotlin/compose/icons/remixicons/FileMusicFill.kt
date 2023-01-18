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

public val RemixIcons.FileMusicFill: ImageVector
    get() {
        if (_fileMusicFill != null) {
            return _fileMusicFill!!
        }
        _fileMusicFill = Builder(name = "FileMusicFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(11.0f, 12.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.0f, 2.45f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.05f)
                close()
            }
        }
        .build()
        return _fileMusicFill!!
    }

private var _fileMusicFill: ImageVector? = null

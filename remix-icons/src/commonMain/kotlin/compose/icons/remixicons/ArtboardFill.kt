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

public val RemixIcons.ArtboardFill: ImageVector
    get() {
        if (_artboardFill != null) {
            return _artboardFill!!
        }
        _artboardFill = Builder(name = "ArtboardFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.586f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.586f)
                lineToRelative(3.243f, 3.243f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(13.0f, 17.414f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(-4.243f, 4.243f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(8.586f, 17.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _artboardFill!!
    }

private var _artboardFill: ImageVector? = null

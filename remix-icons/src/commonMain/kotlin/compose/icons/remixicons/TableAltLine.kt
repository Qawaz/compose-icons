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

public val RemixIcons.TableAltLine: ImageVector
    get() {
        if (_tableAltLine != null) {
            return _tableAltLine!!
        }
        _tableAltLine = Builder(name = "TableAltLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 5.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(20.0f, 5.0f)
                close()
            }
        }
        .build()
        return _tableAltLine!!
    }

private var _tableAltLine: ImageVector? = null

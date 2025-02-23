package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BrowserUpdated: ImageVector
    get() {
        if (_browserUpdated != null) {
            return _browserUpdated!!
        }
        _browserUpdated = Builder(name = "BrowserUpdated", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                lineToRelative(10.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineToRelative(-5.0f, -5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _browserUpdated!!
    }

private var _browserUpdated: ImageVector? = null

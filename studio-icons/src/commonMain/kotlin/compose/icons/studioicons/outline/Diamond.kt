package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                lineTo(2.0f, 9.0f)
                lineToRelative(10.0f, 12.0f)
                lineTo(22.0f, 9.0f)
                lineTo(19.0f, 3.0f)
                close()
                moveTo(9.62f, 8.0f)
                lineToRelative(1.5f, -3.0f)
                horizontalLineToRelative(1.76f)
                lineToRelative(1.5f, 3.0f)
                horizontalLineTo(9.62f)
                close()
                moveTo(11.0f, 10.0f)
                verticalLineToRelative(6.68f)
                lineTo(5.44f, 10.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(5.56f)
                lineTo(13.0f, 16.68f)
                verticalLineTo(10.0f)
                close()
                moveTo(19.26f, 8.0f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(-1.5f, -3.0f)
                horizontalLineToRelative(2.65f)
                lineTo(19.26f, 8.0f)
                close()
                moveTo(6.24f, 5.0f)
                horizontalLineToRelative(2.65f)
                lineToRelative(-1.5f, 3.0f)
                horizontalLineTo(4.74f)
                lineTo(6.24f, 5.0f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null

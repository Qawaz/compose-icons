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

public val SharpGroup.ShuffleOn: ImageVector
    get() {
        if (_shuffleOn != null) {
            return _shuffleOn!!
        }
        _shuffleOn = Builder(name = "ShuffleOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 1.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(22.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(5.41f, 4.0f)
                lineToRelative(5.18f, 5.17f)
                lineToRelative(-1.42f, 1.41f)
                lineTo(4.0f, 5.41f)
                lineTo(5.41f, 4.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(2.05f, -2.05f)
                lineToRelative(-3.13f, -3.13f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.13f, 3.13f)
                lineTo(20.0f, 14.5f)
                verticalLineTo(20.0f)
                close()
                moveTo(20.0f, 9.5f)
                lineToRelative(-2.04f, -2.04f)
                lineTo(5.41f, 20.0f)
                lineTo(4.0f, 18.59f)
                lineTo(16.54f, 6.04f)
                lineTo(14.5f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _shuffleOn!!
    }

private var _shuffleOn: ImageVector? = null

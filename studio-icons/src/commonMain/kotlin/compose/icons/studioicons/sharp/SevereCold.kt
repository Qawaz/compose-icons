package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SevereCold: ImageVector
    get() {
        if (_severeCold != null) {
            return _severeCold!!
        }
        _severeCold = Builder(name = "SevereCold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.41f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.59f, 2.59f)
                lineToRelative(0.0f, -3.59f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 3.59f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(0.0f, 1.59f)
                lineToRelative(-1.59f, 0.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.59f, 2.59f)
                lineToRelative(-3.59f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(3.59f, 0.0f)
                lineToRelative(-2.59f, 2.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(1.59f, 0.0f)
                lineToRelative(0.0f, 1.59f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(0.0f, 3.59f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -3.59f)
                lineToRelative(2.59f, 2.59f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(0.0f, -1.59f)
                lineToRelative(1.59f, 0.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(3.59f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-8.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _severeCold!!
    }

private var _severeCold: ImageVector? = null

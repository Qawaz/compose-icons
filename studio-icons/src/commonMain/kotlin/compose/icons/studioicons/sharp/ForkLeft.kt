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

public val SharpGroup.ForkLeft: ImageVector
    get() {
        if (_forkLeft != null) {
            return _forkLeft!!
        }
        _forkLeft = Builder(name = "ForkLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.41f, 15.59f)
                lineTo(8.0f, 17.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(7.83f, 12.0f)
                curveToRelative(1.51f, -0.33f, 3.73f, 0.08f, 5.17f, 1.36f)
                lineToRelative(0.0f, -6.53f)
                lineToRelative(-1.59f, 1.59f)
                lineTo(10.0f, 7.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(15.0f, 6.83f)
                verticalLineTo(21.0f)
                lineToRelative(-2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-0.73f, -2.58f, -3.07f, -3.47f, -5.17f, -3.0f)
                lineTo(9.41f, 15.59f)
                close()
            }
        }
        .build()
        return _forkLeft!!
    }

private var _forkLeft: ImageVector? = null

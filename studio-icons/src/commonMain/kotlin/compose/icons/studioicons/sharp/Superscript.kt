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

public val SharpGroup.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = Builder(name = "Superscript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(5.88f, 20.0f)
                horizontalLineToRelative(2.66f)
                lineToRelative(3.4f, -5.42f)
                horizontalLineToRelative(0.12f)
                lineToRelative(3.4f, 5.42f)
                horizontalLineToRelative(2.66f)
                lineToRelative(-4.65f, -7.27f)
                lineTo(17.81f, 6.0f)
                horizontalLineToRelative(-2.68f)
                lineToRelative(-3.07f, 4.99f)
                horizontalLineToRelative(-0.12f)
                lineTo(8.85f, 6.0f)
                horizontalLineTo(6.19f)
                lineToRelative(4.32f, 6.73f)
                lineTo(5.88f, 20.0f)
                close()
            }
        }
        .build()
        return _superscript!!
    }

private var _superscript: ImageVector? = null

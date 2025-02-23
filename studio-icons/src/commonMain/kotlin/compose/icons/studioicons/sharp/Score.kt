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

public val SharpGroup.Score: ImageVector
    get() {
        if (_score != null) {
            return _score!!
        }
        _score = Builder(name = "Score", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(12.0f, 5.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, -3.0f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-2.0f, 3.0f)
                lineToRelative(2.0f, 3.0f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(-2.0f, -3.0f)
                verticalLineToRelative(3.0f)
                lineTo(12.0f, 11.0f)
                lineTo(12.0f, 5.0f)
                close()
                moveTo(7.0f, 7.25f)
                horizontalLineToRelative(2.5f)
                lineTo(9.5f, 6.5f)
                lineTo(7.0f, 6.5f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.75f)
                lineTo(8.5f, 8.75f)
                verticalLineToRelative(0.75f)
                lineTo(11.0f, 9.5f)
                lineTo(11.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 7.25f)
                close()
                moveTo(19.0f, 13.0f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineToRelative(-2.5f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(6.0f, -6.0f)
                lineTo(19.0f, 13.0f)
                close()
            }
        }
        .build()
        return _score!!
    }

private var _score: ImageVector? = null

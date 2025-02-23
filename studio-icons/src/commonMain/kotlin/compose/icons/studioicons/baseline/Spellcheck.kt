package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Spellcheck: ImageVector
    get() {
        if (_spellcheck != null) {
            return _spellcheck!!
        }
        _spellcheck = Builder(name = "Spellcheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.45f, 16.0f)
                horizontalLineToRelative(2.09f)
                lineTo(9.43f, 3.0f)
                lineTo(7.57f, 3.0f)
                lineTo(2.46f, 16.0f)
                horizontalLineToRelative(2.09f)
                lineToRelative(1.12f, -3.0f)
                horizontalLineToRelative(5.64f)
                lineToRelative(1.14f, 3.0f)
                close()
                moveTo(6.43f, 11.0f)
                lineTo(8.5f, 5.48f)
                lineTo(10.57f, 11.0f)
                lineTo(6.43f, 11.0f)
                close()
                moveTo(21.59f, 11.59f)
                lineToRelative(-8.09f, 8.09f)
                lineTo(9.83f, 16.0f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5.09f, 5.09f)
                lineTo(23.0f, 13.0f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _spellcheck!!
    }

private var _spellcheck: ImageVector? = null

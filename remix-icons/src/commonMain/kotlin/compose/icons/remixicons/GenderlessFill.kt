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

public val RemixIcons.GenderlessFill: ImageVector
    get() {
        if (_genderlessFill != null) {
            return _genderlessFill!!
        }
        _genderlessFill = Builder(name = "GenderlessFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.066f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.066f)
                arcTo(7.501f, 7.501f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -1.0f, -14.934f)
                close()
            }
        }
        .build()
        return _genderlessFill!!
    }

private var _genderlessFill: ImageVector? = null

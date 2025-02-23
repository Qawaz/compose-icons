package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ArrowBadgeUp: ImageVector
    get() {
        if (_arrowBadgeUp != null) {
            return _arrowBadgeUp!!
        }
        _arrowBadgeUp = Builder(name = "ArrowBadgeUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-5.0f, -4.0f)
                lineToRelative(-5.0f, 4.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(5.0f, -4.0f)
                close()
            }
        }
        .build()
        return _arrowBadgeUp!!
    }

private var _arrowBadgeUp: ImageVector? = null

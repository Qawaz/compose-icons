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

public val BaselineGroup.Expand: ImageVector
    get() {
        if (_expand != null) {
            return _expand!!
        }
        _expand = Builder(name = "Expand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 22.0f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                lineTo(8.0f, 15.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _expand!!
    }

private var _expand: ImageVector? = null

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

public val OutlineGroup.Assistant: ImageVector
    get() {
        if (_assistant != null) {
            return _assistant!!
        }
        _assistant = Builder(name = "Assistant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-0.59f, 0.59f)
                lineTo(12.0f, 20.17f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(-0.58f, -0.58f)
                lineTo(5.0f, 18.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 17.0f)
                lineToRelative(1.88f, -4.12f)
                lineTo(18.0f, 11.0f)
                lineToRelative(-4.12f, -1.88f)
                lineTo(12.0f, 5.0f)
                lineToRelative(-1.88f, 4.12f)
                lineTo(6.0f, 11.0f)
                lineToRelative(4.12f, 1.88f)
                close()
            }
        }
        .build()
        return _assistant!!
    }

private var _assistant: ImageVector? = null

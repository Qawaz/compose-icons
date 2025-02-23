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

public val OutlineGroup.Work: ImageVector
    get() {
        if (_work != null) {
            return _work!!
        }
        _work = Builder(name = "Work", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(4.0f, 8.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f)
                lineToRelative(0.01f, -11.0f)
                curveToRelative(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(8.0f, 4.0f)
                curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _work!!
    }

private var _work: ImageVector? = null

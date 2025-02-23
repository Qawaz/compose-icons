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

public val OutlineGroup.LiveTv: ImageVector
    get() {
        if (_liveTv != null) {
            return _liveTv!!
        }
        _liveTv = Builder(name = "LiveTv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(7.0f, -4.0f)
                close()
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-7.58f)
                lineToRelative(3.29f, -3.29f)
                lineTo(16.0f, 2.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(-0.03f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-0.69f, 0.71f)
                lineTo(10.56f, 6.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(21.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _liveTv!!
    }

private var _liveTv: ImageVector? = null

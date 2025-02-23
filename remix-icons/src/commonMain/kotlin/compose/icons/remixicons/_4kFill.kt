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

public val RemixIcons._4kFill: ImageVector
    get() {
        if (__4kFill != null) {
            return __4kFill!!
        }
        __4kFill = Builder(name = "_4kFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(11.5f, 13.5f)
                lineTo(11.5f, 12.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.5f, 9.0f)
                lineTo(9.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.5f, 12.0f)
                lineTo(7.5f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 15.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineToRelative(-2.25f, -3.0f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(-1.75f, 2.25f)
                lineTo(14.5f, 9.0f)
                lineTo(13.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.25f)
                lineTo(16.25f, 15.0f)
                lineTo(18.0f, 15.0f)
                close()
            }
        }
        .build()
        return __4kFill!!
    }

private var __4kFill: ImageVector? = null

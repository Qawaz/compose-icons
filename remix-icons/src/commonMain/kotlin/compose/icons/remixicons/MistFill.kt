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

public val RemixIcons.MistFill: ImageVector
    get() {
        if (_mistFill != null) {
            return _mistFill!!
        }
        _mistFill = Builder(name = "MistFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(14.0f, 9.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(12.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(2.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _mistFill!!
    }

private var _mistFill: ImageVector? = null

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

public val OutlineGroup.Fence: ImageVector
    get() {
        if (_fence != null) {
            return _fence!!
        }
        _fence = Builder(name = "Fence", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.0f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(8.0f, 4.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(16.0f, 6.83f)
                lineToRelative(1.0f, 1.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.83f)
                lineToRelative(0.41f, -0.41f)
                lineTo(16.0f, 6.83f)
                close()
                moveTo(12.0f, 6.83f)
                lineToRelative(0.59f, 0.59f)
                lineTo(13.0f, 7.83f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.83f)
                lineToRelative(0.41f, -0.41f)
                lineTo(12.0f, 6.83f)
                close()
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(7.0f, 7.83f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(0.59f, 0.59f)
                lineTo(9.0f, 7.83f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.83f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _fence!!
    }

private var _fence: ImageVector? = null

package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PhotoSizeSelectLarge: ImageVector
    get() {
        if (_photoSizeSelectLarge != null) {
            return _photoSizeSelectLarge!!
        }
        _photoSizeSelectLarge = Builder(name = "PhotoSizeSelectLarge", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(23.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f)
                close()
                moveTo(13.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 3.0f)
                close()
                moveTo(21.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(1.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 9.0f)
                lineTo(1.0f, 7.0f)
                close()
                moveTo(17.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 3.0f)
                curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(1.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(1.0f, 11.0f)
                close()
                moveTo(3.63f, 18.19f)
                lineToRelative(1.49f, -1.91f)
                curveToRelative(0.2f, -0.25f, 0.57f, -0.26f, 0.78f, -0.01f)
                lineToRelative(1.39f, 1.67f)
                lineToRelative(2.1f, -2.7f)
                curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.79f, 0.01f)
                lineToRelative(2.22f, 2.96f)
                curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f)
                lineTo(4.02f, 19.01f)
                curveToRelative(-0.41f, -0.01f, -0.65f, -0.49f, -0.39f, -0.82f)
                close()
            }
        }
        .build()
        return _photoSizeSelectLarge!!
    }

private var _photoSizeSelectLarge: ImageVector? = null

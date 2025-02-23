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

public val OutlineGroup.UpdateDisabled: ImageVector
    get() {
        if (_updateDisabled != null) {
            return _updateDisabled!!
        }
        _updateDisabled = Builder(name = "UpdateDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.94f, 13.0f)
                curveToRelative(-0.15f, 1.38f, -0.62f, 2.67f, -1.33f, 3.79f)
                lineToRelative(-1.47f, -1.47f)
                curveToRelative(0.38f, -0.71f, 0.65f, -1.49f, 0.77f, -2.32f)
                horizontalLineTo(20.94f)
                close()
                moveTo(8.67f, 5.84f)
                curveTo(9.66f, 5.31f, 10.8f, 5.0f, 12.0f, 5.0f)
                curveToRelative(2.37f, 0.0f, 4.47f, 1.19f, 5.74f, 3.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.36f)
                curveTo(17.35f, 4.32f, 14.83f, 3.0f, 12.0f, 3.0f)
                curveToRelative(-1.76f, 0.0f, -3.4f, 0.51f, -4.78f, 1.39f)
                lineTo(8.67f, 5.84f)
                close()
                moveTo(11.0f, 7.0f)
                verticalLineToRelative(1.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(-3.0f, -3.0f)
                curveTo(15.39f, 20.48f, 13.76f, 21.0f, 12.0f, 21.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, -4.03f, -9.0f, -9.0f)
                curveToRelative(0.0f, -1.76f, 0.51f, -3.4f, 1.39f, -4.78f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(15.32f, 18.15f)
                lineTo(5.84f, 8.67f)
                curveTo(5.31f, 9.66f, 5.0f, 10.8f, 5.0f, 12.0f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                curveTo(13.2f, 19.0f, 14.34f, 18.69f, 15.32f, 18.15f)
                close()
            }
        }
        .build()
        return _updateDisabled!!
    }

private var _updateDisabled: ImageVector? = null

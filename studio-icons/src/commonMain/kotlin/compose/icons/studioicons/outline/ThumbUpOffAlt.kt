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

public val OutlineGroup.ThumbUpOffAlt: ImageVector
    get() {
        if (_thumbUpOffAlt != null) {
            return _thumbUpOffAlt!!
        }
        _thumbUpOffAlt = Builder(name = "ThumbUpOffAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f)
                lineToRelative(3.02f, -7.05f)
                curveTo(22.95f, 12.5f, 23.0f, 12.26f, 23.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.31f)
                lineToRelative(0.95f, -4.57f)
                lineToRelative(0.03f, -0.32f)
                curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f)
                lineTo(14.17f, 1.0f)
                lineTo(7.58f, 7.59f)
                curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f)
                verticalLineToRelative(10.0f)
                curveTo(7.0f, 20.1f, 7.9f, 21.0f, 9.0f, 21.0f)
                close()
                moveTo(9.0f, 9.0f)
                lineToRelative(4.34f, -4.34f)
                lineTo(12.0f, 10.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-3.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(1.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _thumbUpOffAlt!!
    }

private var _thumbUpOffAlt: ImageVector? = null

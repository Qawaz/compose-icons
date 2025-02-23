package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.12f, 8.0f)
                curveTo(6.0f, 8.0f, 18.0f, 8.0f, 17.88f, 8.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.88f, 8.0f)
                curveTo(17.95f, 7.71f, 18.0f, 7.41f, 18.0f, 7.09f)
                curveToRelative(0.0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f)
                lineTo(12.0f, 1.0f)
                lineTo(7.74f, 3.84f)
                curveTo(6.65f, 4.56f, 6.0f, 5.78f, 6.0f, 7.09f)
                curveTo(6.0f, 7.41f, 6.05f, 7.71f, 6.12f, 8.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f)
                reflectiveCurveToRelative(-2.0f, 1.9f, -2.0f, 3.0f)
                curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.72f)
                curveTo(3.6f, 8.38f, 4.0f, 7.74f, 4.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f)
                reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f)
                curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(8.72f)
                curveTo(23.6f, 8.38f, 24.0f, 7.74f, 24.0f, 7.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null

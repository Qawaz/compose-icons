package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.WhereToVote: ImageVector
    get() {
        if (_whereToVote != null) {
            return _whereToVote!!
        }
        _whereToVote = Builder(name = "WhereToVote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(8.69f, 3.0f, 6.0f, 5.69f, 6.0f, 9.0f)
                curveToRelative(0.0f, 3.54f, 3.82f, 8.86f, 6.0f, 11.47f)
                curveToRelative(1.75f, -2.11f, 6.0f, -7.63f, 6.0f, -11.47f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(10.47f, 14.0f)
                lineToRelative(-3.18f, -3.18f)
                lineTo(8.71f, 9.4f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(4.6f, -4.6f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10.47f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(7.59f, 1.0f, 4.0f, 4.59f, 4.0f, 9.0f)
                curveToRelative(0.0f, 5.57f, 6.96f, 13.34f, 7.26f, 13.67f)
                lineToRelative(0.74f, 0.82f)
                lineToRelative(0.74f, -0.82f)
                curveTo(13.04f, 22.34f, 20.0f, 14.57f, 20.0f, 9.0f)
                curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(12.0f, 20.47f)
                curveTo(9.82f, 17.86f, 6.0f, 12.54f, 6.0f, 9.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                curveToRelative(0.0f, 3.83f, -4.25f, 9.36f, -6.0f, 11.47f)
                close()
                moveTo(15.07f, 6.57f)
                lineToRelative(-4.6f, 4.6f)
                lineTo(8.71f, 9.4f)
                lineToRelative(-1.42f, 1.42f)
                lineTo(10.47f, 14.0f)
                lineToRelative(6.01f, -6.01f)
                close()
            }
        }
        .build()
        return _whereToVote!!
    }

private var _whereToVote: ImageVector? = null

package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.WhereToVote: ImageVector
    get() {
        if (_whereToVote != null) {
            return _whereToVote!!
        }
        _whereToVote = Builder(name = "WhereToVote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f)
                curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f)
                reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(10.47f, 14.0f)
                lineToRelative(-3.48f, -3.48f)
                lineTo(8.4f, 9.1f)
                lineToRelative(2.07f, 2.07f)
                lineToRelative(5.13f, -5.14f)
                lineToRelative(1.41f, 1.42f)
                lineTo(10.47f, 14.0f)
                close()
            }
        }
        .build()
        return _whereToVote!!
    }

private var _whereToVote: ImageVector? = null

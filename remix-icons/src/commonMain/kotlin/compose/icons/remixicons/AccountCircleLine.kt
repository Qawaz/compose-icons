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

public val RemixIcons.AccountCircleLine: ImageVector
    get() {
        if (_accountCircleLine != null) {
            return _accountCircleLine!!
        }
        _accountCircleLine = Builder(name = "AccountCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(7.013f, 18.256f)
                arcTo(7.966f, 7.966f, 0.0f, false, false, 12.0f, 20.0f)
                curveToRelative(1.97f, 0.0f, 3.773f, -0.712f, 5.167f, -1.892f)
                arcTo(6.979f, 6.979f, 0.0f, false, false, 12.16f, 16.0f)
                arcToRelative(6.981f, 6.981f, 0.0f, false, false, -5.147f, 2.256f)
                close()
                moveTo(5.616f, 16.82f)
                arcTo(8.975f, 8.975f, 0.0f, false, true, 12.16f, 14.0f)
                arcToRelative(8.972f, 8.972f, 0.0f, false, true, 6.362f, 2.634f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.906f, 0.187f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _accountCircleLine!!
    }

private var _accountCircleLine: ImageVector? = null

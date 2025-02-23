package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                arcToRelative(5.0f, 3.0f, 0.0f, true, false, 10.0f, 0.0f)
                arcToRelative(5.0f, 3.0f, 0.0f, true, false, -10.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.657f, 2.239f, 3.0f, 5.0f, 3.0f)
                reflectiveCurveToRelative(5.0f, -1.343f, 5.0f, -3.0f)
                verticalLineToRelative(-12.0f)
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null

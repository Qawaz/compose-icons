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

public val TablerIcons.AlignBoxLeftBottom: ImageVector
    get() {
        if (_alignBoxLeftBottom != null) {
            return _alignBoxLeftBottom!!
        }
        _alignBoxLeftBottom = Builder(name = "AlignBoxLeftBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 18.222f)
                verticalLineToRelative(-12.444f)
                curveToRelative(0.0f, -0.982f, -0.796f, -1.778f, -1.778f, -1.778f)
                horizontalLineToRelative(-12.444f)
                curveToRelative(-0.982f, 0.0f, -1.778f, 0.796f, -1.778f, 1.778f)
                verticalLineToRelative(12.444f)
                curveToRelative(0.0f, 0.982f, 0.796f, 1.778f, 1.778f, 1.778f)
                horizontalLineToRelative(12.444f)
                curveToRelative(0.982f, 0.0f, 1.778f, -0.796f, 1.778f, -1.778f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
            }
        }
        .build()
        return _alignBoxLeftBottom!!
    }

private var _alignBoxLeftBottom: ImageVector? = null

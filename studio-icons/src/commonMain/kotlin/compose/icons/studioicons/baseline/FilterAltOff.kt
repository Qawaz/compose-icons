package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.FilterAltOff: ImageVector
    get() {
        if (_filterAltOff != null) {
            return _filterAltOff!!
        }
        _filterAltOff = Builder(name = "FilterAltOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.79f, 5.61f)
                curveTo(20.3f, 4.95f, 19.83f, 4.0f, 19.0f, 4.0f)
                horizontalLineTo(6.83f)
                lineToRelative(7.97f, 7.97f)
                lineTo(19.79f, 5.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(10.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.17f)
                lineToRelative(5.78f, 5.78f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
            }
        }
        .build()
        return _filterAltOff!!
    }

private var _filterAltOff: ImageVector? = null

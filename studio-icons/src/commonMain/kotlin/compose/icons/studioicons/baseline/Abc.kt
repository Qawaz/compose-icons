package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Abc: ImageVector
    get() {
        if (_abc != null) {
            return _abc!!
        }
        _abc = Builder(name = "Abc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveTo(7.55f, 9.0f, 8.0f, 9.45f, 8.0f, 10.0f)
                close()
                moveTo(6.5f, 10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveTo(14.5f, 11.55f, 14.05f, 12.0f, 13.5f, 12.0f)
                close()
                moveTo(11.0f, 10.5f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 12.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _abc!!
    }

private var _abc: ImageVector? = null

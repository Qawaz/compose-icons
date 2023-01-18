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

public val RemixIcons.Camera3Line: ImageVector
    get() {
        if (_camera3Line != null) {
            return _camera3Line!!
        }
        _camera3Line = Builder(name = "Camera3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.455f, -1.0f, 0.992f, -1.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.445f, 0.992f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.552f, -0.455f, 1.0f, -0.992f, 1.0f)
                lineTo(2.992f, 21.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 2.0f, 20.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(4.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(14.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
                moveTo(14.0f, 18.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 4.0f)
                lineTo(4.0f, 2.0f)
                close()
            }
        }
        .build()
        return _camera3Line!!
    }

private var _camera3Line: ImageVector? = null

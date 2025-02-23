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

public val OutlineGroup.EdgesensorLow: ImageVector
    get() {
        if (_edgesensorLow != null) {
            return _edgesensorLow!!
        }
        _edgesensorLow = Builder(name = "EdgesensorLow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(16.0f, 2.01f)
                lineTo(8.0f, 2.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 2.9f, 17.1f, 2.01f, 16.0f, 2.01f)
                close()
                moveTo(16.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(8.0f, 5.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _edgesensorLow!!
    }

private var _edgesensorLow: ImageVector? = null

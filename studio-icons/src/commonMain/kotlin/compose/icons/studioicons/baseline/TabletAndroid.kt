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

public val BaselineGroup.TabletAndroid: ImageVector
    get() {
        if (_tabletAndroid != null) {
            return _tabletAndroid!!
        }
        _tabletAndroid = Builder(name = "TabletAndroid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 1.34f, 19.66f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(14.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(19.25f, 19.0f)
                horizontalLineTo(4.75f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(14.5f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _tabletAndroid!!
    }

private var _tabletAndroid: ImageVector? = null

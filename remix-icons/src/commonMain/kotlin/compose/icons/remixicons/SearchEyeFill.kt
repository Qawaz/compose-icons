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

public val RemixIcons.SearchEyeFill: ImageVector
    get() {
        if (_searchEyeFill != null) {
            return _searchEyeFill!!
        }
        _searchEyeFill = Builder(name = "SearchEyeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.031f, 16.617f)
                lineToRelative(4.283f, 4.282f)
                lineToRelative(-1.415f, 1.415f)
                lineToRelative(-4.282f, -4.283f)
                arcTo(8.96f, 8.96f, 0.0f, false, true, 11.0f, 20.0f)
                curveToRelative(-4.968f, 0.0f, -9.0f, -4.032f, -9.0f, -9.0f)
                reflectiveCurveToRelative(4.032f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.032f, 9.0f, 9.0f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, -1.969f, 5.617f)
                close()
                moveTo(12.178f, 7.177f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 2.646f, 2.646f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.646f, -2.647f)
                close()
            }
        }
        .build()
        return _searchEyeFill!!
    }

private var _searchEyeFill: ImageVector? = null

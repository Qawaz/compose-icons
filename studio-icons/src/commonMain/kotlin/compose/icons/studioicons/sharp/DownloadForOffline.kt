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

public val SharpGroup.DownloadForOffline: ImageVector
    get() {
        if (_downloadForOffline != null) {
            return _downloadForOffline!!
        }
        _downloadForOffline = Builder(name = "DownloadForOffline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.49f, 10.0f, -10.0f)
                reflectiveCurveTo(17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.0f, 10.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _downloadForOffline!!
    }

private var _downloadForOffline: ImageVector? = null

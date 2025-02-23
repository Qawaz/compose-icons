package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(52.6f)
                lineTo(128.0f, 160.0f)
                lineToRelative(27.4f, 32.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.1f, 154.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.2f, 0.0f)
                lineToRelative(-48.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 224.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.1f, -13.2f)
                close()
                moveTo(97.4f, 208.0f)
                lineTo(128.0f, 172.3f)
                lineTo(158.6f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                horizontalLineTo(48.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(64.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 208.0f, 40.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null

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

public val DuotoneGroup.ArrowFatLineLeft: ImageVector
    get() {
        if (_arrowFatLineLeft != null) {
            return _arrowFatLineLeft!!
        }
        _arrowFatLineLeft = Builder(name = "ArrowFatLineLeft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 32.0f)
                lineToRelative(-96.0f, 96.0f)
                lineToRelative(96.0f, 96.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 72.0f)
                lineTo(128.0f, 72.0f)
                lineTo(128.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.9f, -7.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, 1.7f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                lineToRelative(96.0f, 96.0f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 120.0f, 232.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, -0.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 224.0f)
                lineTo(128.0f, 184.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(192.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 72.0f)
                close()
                moveTo(176.0f, 168.0f)
                lineTo(120.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(28.7f)
                lineTo(35.3f, 128.0f)
                lineTo(112.0f, 51.3f)
                lineTo(112.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(224.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowFatLineLeft!!
    }

private var _arrowFatLineLeft: ImageVector? = null

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

public val DuotoneGroup.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) {
            return _mouseSimple!!
        }
        _mouseSimple = Builder(name = "MouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(108.0f, 32.0f)
                lineTo(148.0f, 32.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 204.0f, 88.0f)
                lineTo(204.0f, 168.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 148.0f, 224.0f)
                lineTo(108.0f, 224.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 52.0f, 168.0f)
                lineTo(52.0f, 88.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 108.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 24.0f)
                lineTo(108.0f, 24.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 44.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(212.0f, 88.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 148.0f, 24.0f)
                close()
                moveTo(196.0f, 168.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                lineTo(108.0f, 216.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                lineTo(60.0f, 88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, -48.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, 48.0f)
                close()
                moveTo(136.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null

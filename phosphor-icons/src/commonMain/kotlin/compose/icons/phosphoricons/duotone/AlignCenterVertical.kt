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

public val DuotoneGroup.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) {
            return _alignCenterVertical!!
        }
        _alignCenterVertical = Builder(name = "AlignCenterVertical", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 72.0f)
                lineTo(200.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 192.0f)
                lineTo(152.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 184.0f)
                lineTo(144.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 64.0f)
                lineTo(192.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 40.0f)
                lineTo(104.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 48.0f)
                lineTo(112.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 216.0f)
                lineTo(64.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 208.0f)
                lineTo(56.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 120.0f)
                lineTo(208.0f, 120.0f)
                lineTo(208.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(152.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                lineTo(120.0f, 120.0f)
                lineTo(120.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(64.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 48.0f)
                verticalLineToRelative(72.0f)
                lineTo(32.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(48.0f, 136.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(120.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(104.0f, 208.0f)
                lineTo(64.0f, 208.0f)
                lineTo(64.0f, 128.1f)
                horizontalLineToRelative(0.0f)
                lineTo(64.0f, 48.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(192.0f, 184.0f)
                lineTo(152.0f, 184.0f)
                lineTo(152.0f, 128.1f)
                horizontalLineToRelative(0.0f)
                lineTo(152.0f, 72.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null

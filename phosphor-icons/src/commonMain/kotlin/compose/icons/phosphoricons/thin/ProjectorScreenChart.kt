package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) {
            return _projectorScreenChart!!
        }
        _projectorScreenChart = Builder(name = "ProjectorScreenChart", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 144.0f)
                lineTo(92.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(132.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(160.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(164.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 148.0f)
                close()
                moveTo(212.0f, 76.0f)
                lineTo(212.0f, 180.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(132.0f, 188.0f)
                verticalLineToRelative(24.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -8.0f, 0.0f)
                lineTo(124.0f, 188.0f)
                lineTo(32.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(44.0f, 180.0f)
                lineTo(44.0f, 76.0f)
                lineTo(40.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 64.0f)
                lineTo(28.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(228.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 220.0f)
                close()
                moveTo(204.0f, 76.0f)
                lineTo(52.0f, 76.0f)
                lineTo(52.0f, 180.0f)
                lineTo(204.0f, 180.0f)
                close()
                moveTo(216.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null

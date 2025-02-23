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

public val RemixIcons.VipDiamondFill: ImageVector
    get() {
        if (_vipDiamondFill != null) {
            return _vipDiamondFill!!
        }
        _vipDiamondFill = Builder(name = "VipDiamondFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.873f, 3.0f)
                horizontalLineToRelative(14.254f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.809f, 0.412f)
                lineToRelative(3.823f, 5.256f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.037f, 0.633f)
                lineTo(12.367f, 21.602f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.734f, 0.0f)
                lineTo(0.278f, 9.302f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.037f, -0.634f)
                lineToRelative(3.823f, -5.256f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.873f, 3.0f)
                close()
            }
        }
        .build()
        return _vipDiamondFill!!
    }

private var _vipDiamondFill: ImageVector? = null

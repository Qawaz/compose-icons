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

public val RemixIcons.OpenArmFill: ImageVector
    get() {
        if (_openArmFill != null) {
            return _openArmFill!!
        }
        _openArmFill = Builder(name = "OpenArmFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -4.451f, 2.644f, -8.285f, 6.447f, -10.016f)
                lineToRelative(0.828f, 1.82f)
                arcTo(9.002f, 9.002f, 0.0f, false, false, 18.0f, 17.0f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 22.0f)
                verticalLineToRelative(-5.0f)
                arcTo(9.002f, 9.002f, 0.0f, false, false, 0.725f, 8.805f)
                lineToRelative(0.828f, -1.821f)
                arcTo(11.002f, 11.002f, 0.0f, false, true, 8.0f, 17.0f)
                close()
            }
        }
        .build()
        return _openArmFill!!
    }

private var _openArmFill: ImageVector? = null

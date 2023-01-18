package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CheckmarkSharp: ImageVector
    get() {
        if (_checkmarkSharp != null) {
            return _checkmarkSharp!!
        }
        _checkmarkSharp = Builder(name = "CheckmarkSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 44.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 128.0f)
                lineToRelative(-224.0f, 256.0f)
                lineToRelative(-96.0f, -96.0f)
            }
        }
        .build()
        return _checkmarkSharp!!
    }

private var _checkmarkSharp: ImageVector? = null

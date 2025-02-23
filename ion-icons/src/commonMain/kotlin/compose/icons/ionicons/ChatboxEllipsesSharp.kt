package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ChatboxEllipsesSharp: ImageVector
    get() {
        if (_chatboxEllipsesSharp != null) {
            return _chatboxEllipsesSharp!!
        }
        _chatboxEllipsesSharp = Builder(name = "ChatboxEllipsesSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 48.0f)
                lineTo(56.0f, 48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 32.0f, 72.0f)
                lineTo(32.0f, 360.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(80.0f)
                lineToRelative(117.74f, -80.0f)
                lineTo(456.0f, 384.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(480.0f, 72.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 456.0f, 48.0f)
                close()
                moveTo(160.0f, 248.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 248.0f)
                close()
                moveTo(256.0f, 248.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 256.0f, 248.0f)
                close()
                moveTo(352.0f, 248.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 352.0f, 248.0f)
                close()
                moveTo(456.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _chatboxEllipsesSharp!!
    }

private var _chatboxEllipsesSharp: ImageVector? = null

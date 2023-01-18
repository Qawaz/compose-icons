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

public val ThinGroup.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) {
            return _filmStrip!!
        }
        _filmStrip = Builder(name = "FilmStrip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(36.0f, 84.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(88.0f)
                lineTo(36.0f, 172.0f)
                close()
                moveTo(132.0f, 76.0f)
                lineTo(132.0f, 52.0f)
                horizontalLineToRelative(40.0f)
                lineTo(172.0f, 76.0f)
                close()
                moveTo(124.0f, 76.0f)
                lineTo(84.0f, 76.0f)
                lineTo(84.0f, 52.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(124.0f, 180.0f)
                verticalLineToRelative(24.0f)
                lineTo(84.0f, 204.0f)
                lineTo(84.0f, 180.0f)
                close()
                moveTo(132.0f, 180.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(24.0f)
                lineTo(132.0f, 204.0f)
                close()
                moveTo(132.0f, 172.0f)
                lineTo(132.0f, 84.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(88.0f)
                close()
                moveTo(220.0f, 56.0f)
                lineTo(220.0f, 76.0f)
                lineTo(180.0f, 76.0f)
                lineTo(180.0f, 52.0f)
                horizontalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 56.0f)
                close()
                moveTo(40.0f, 52.0f)
                lineTo(76.0f, 52.0f)
                lineTo(76.0f, 76.0f)
                lineTo(36.0f, 76.0f)
                lineTo(36.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 52.0f)
                close()
                moveTo(36.0f, 200.0f)
                lineTo(36.0f, 180.0f)
                lineTo(76.0f, 180.0f)
                verticalLineToRelative(24.0f)
                lineTo(40.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 200.0f)
                close()
                moveTo(216.0f, 204.0f)
                lineTo(180.0f, 204.0f)
                lineTo(180.0f, 180.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 204.0f)
                close()
            }
        }
        .build()
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null

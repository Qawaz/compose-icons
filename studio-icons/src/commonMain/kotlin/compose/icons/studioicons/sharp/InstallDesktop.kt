package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.InstallDesktop: ImageVector
    get() {
        if (_installDesktop != null) {
            return _installDesktop!!
        }
        _installDesktop = Builder(name = "InstallDesktop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-10.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.59f, 2.58f)
                lineToRelative(0.0f, -7.17f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 7.17f)
                lineToRelative(-2.59f, -2.58f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }
        .build()
        return _installDesktop!!
    }

private var _installDesktop: ImageVector? = null

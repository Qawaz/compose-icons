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

public val SharpGroup.AppShortcut: ImageVector
    get() {
        if (_appShortcut != null) {
            return _appShortcut!!
        }
        _appShortcut = Builder(name = "AppShortcut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                lineToRelative(-10.0f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(10.0f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-14.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 22.0f)
                lineToRelative(14.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.38f, 9.62f)
                lineToRelative(0.62f, 1.38f)
                lineToRelative(0.62f, -1.38f)
                lineToRelative(1.38f, -0.62f)
                lineToRelative(-1.38f, -0.62f)
                lineToRelative(-0.62f, -1.38f)
                lineToRelative(-0.62f, 1.38f)
                lineToRelative(-1.38f, 0.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                lineToRelative(-1.25f, 2.75f)
                lineToRelative(-2.75f, 1.25f)
                lineToRelative(2.75f, 1.25f)
                lineToRelative(1.25f, 2.75f)
                lineToRelative(1.25f, -2.75f)
                lineToRelative(2.75f, -1.25f)
                lineToRelative(-2.75f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                lineToRelative(-0.62f, 1.38f)
                lineToRelative(-1.38f, 0.62f)
                lineToRelative(1.38f, 0.62f)
                lineToRelative(0.62f, 1.38f)
                lineToRelative(0.62f, -1.38f)
                lineToRelative(1.38f, -0.62f)
                lineToRelative(-1.38f, -0.62f)
                close()
            }
        }
        .build()
        return _appShortcut!!
    }

private var _appShortcut: ImageVector? = null

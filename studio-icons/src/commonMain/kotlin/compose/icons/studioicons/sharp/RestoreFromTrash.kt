package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.RestoreFromTrash: ImageVector
    get() {
        if (_restoreFromTrash != null) {
            return _restoreFromTrash!!
        }
        _restoreFromTrash = Builder(name = "RestoreFromTrash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 10.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                lineTo(8.0f, 14.0f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(15.5f, 4.0f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 4.0f)
                close()
            }
        }
        .build()
        return _restoreFromTrash!!
    }

private var _restoreFromTrash: ImageVector? = null

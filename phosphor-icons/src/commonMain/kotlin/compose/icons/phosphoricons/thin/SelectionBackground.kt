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

public val ThinGroup.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) {
            return _selectionBackground!!
        }
        _selectionBackground = Builder(name = "SelectionBackground", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 84.0f)
                lineTo(48.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 96.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(160.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(172.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 84.0f)
                close()
                moveTo(164.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(160.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(140.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(144.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 40.0f)
                close()
                moveTo(220.0f, 48.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 48.0f)
                close()
                moveTo(220.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(220.0f, 152.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(84.0f, 56.0f)
                lineTo(84.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 36.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null

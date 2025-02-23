package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Barricade: ImageVector
    get() {
        if (_barricade != null) {
            return _barricade!!
        }
        _barricade = Builder(name = "Barricade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 80.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(56.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 168.0f)
                lineTo(184.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(200.0f, 168.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 64.0f)
                close()
                moveTo(224.0f, 128.7f)
                lineTo(175.3f, 80.0f)
                lineTo(224.0f, 80.0f)
                close()
                moveTo(80.7f, 80.0f)
                lineToRelative(72.0f, 72.0f)
                lineTo(103.3f, 152.0f)
                lineTo(32.0f, 80.7f)
                lineTo(32.0f, 80.0f)
                close()
                moveTo(32.0f, 103.3f)
                lineTo(80.7f, 152.0f)
                lineTo(32.0f, 152.0f)
                close()
                moveTo(224.0f, 152.0f)
                lineTo(175.3f, 152.0f)
                lineToRelative(-72.0f, -72.0f)
                horizontalLineToRelative(49.4f)
                lineTo(224.0f, 151.3f)
                verticalLineToRelative(0.7f)
                close()
            }
        }
        .build()
        return _barricade!!
    }

private var _barricade: ImageVector? = null

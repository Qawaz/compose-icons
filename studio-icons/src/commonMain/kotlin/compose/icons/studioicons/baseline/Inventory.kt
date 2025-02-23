package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Inventory: ImageVector
    get() {
        if (_inventory != null) {
            return _inventory!!
        }
        _inventory = Builder(name = "Inventory", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.0f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.01f)
                curveToRelative(0.0f, 0.72f, 0.43f, 1.34f, 1.0f, 1.69f)
                lineTo(3.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.9f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 8.7f)
                curveToRelative(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -1.0f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                lineTo(4.0f, 4.0f)
                lineToRelative(16.0f, -0.02f)
                lineTo(20.0f, 7.0f)
                close()
            }
        }
        .build()
        return _inventory!!
    }

private var _inventory: ImageVector? = null

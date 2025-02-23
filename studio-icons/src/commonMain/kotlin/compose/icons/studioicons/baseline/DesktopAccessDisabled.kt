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

public val BaselineGroup.DesktopAccessDisabled: ImageVector
    get() {
        if (_desktopAccessDisabled != null) {
            return _desktopAccessDisabled!!
        }
        _desktopAccessDisabled = Builder(name = "DesktopAccessDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 16.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                lineTo(4.0f, 2.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(17.5f, 18.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(14.9f, 18.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(-4.7f, -4.7f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(1.2f, 1.8f)
                lineTo(0.0f, 3.1f)
                lineToRelative(1.0f, 1.0f)
                lineTo(1.0f, 16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.9f)
                close()
                moveTo(3.0f, 16.0f)
                lineTo(3.0f, 6.1f)
                lineToRelative(9.9f, 9.9f)
                lineTo(3.0f, 16.0f)
                close()
            }
        }
        .build()
        return _desktopAccessDisabled!!
    }

private var _desktopAccessDisabled: ImageVector? = null

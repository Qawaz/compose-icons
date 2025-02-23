package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.GamepadCircleLeft: ImageVector
    get() {
        if (_gamepadCircleLeft != null) {
            return _gamepadCircleLeft!!
        }
        _gamepadCircleLeft = Builder(name = "GamepadCircleLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 1.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 8.0f)
                moveTo(12.0f, 1.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 1.0f)
                moveTo(12.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 23.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 15.0f)
                moveTo(19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 8.0f)
                moveTo(19.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                moveTo(12.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 17.0f)
                moveTo(12.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _gamepadCircleLeft!!
    }

private var _gamepadCircleLeft: ImageVector? = null

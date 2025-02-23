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

public val MaterialDesignIcons.NoteOffOutline: ImageVector
    get() {
        if (_noteOffOutline != null) {
            return _noteOffOutline!!
        }
        _noteOffOutline = Builder(name = "NoteOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                verticalLineTo(8.8f)
                lineTo(15.2f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.8f)
                lineTo(21.0f, 17.8f)
                verticalLineTo(9.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(6.2f)
                lineTo(8.2f, 5.0f)
                horizontalLineTo(12.0f)
                moveTo(14.0f, 4.5f)
                lineTo(19.5f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                moveTo(20.7f, 20.05f)
                lineTo(20.7f, 20.04f)
                lineTo(19.0f, 18.34f)
                verticalLineTo(18.35f)
                lineTo(12.66f, 12.0f)
                horizontalLineTo(12.66f)
                lineTo(12.0f, 11.34f)
                verticalLineTo(11.35f)
                lineTo(6.14f, 5.5f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.0f, 4.9f)
                curveTo(3.0f, 4.93f, 3.0f, 4.97f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(19.03f, 21.0f, 19.07f, 21.0f, 19.1f, 21.0f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.7f, 20.05f)
                moveTo(5.0f, 19.0f)
                verticalLineTo(6.89f)
                lineTo(17.11f, 19.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _noteOffOutline!!
    }

private var _noteOffOutline: ImageVector? = null

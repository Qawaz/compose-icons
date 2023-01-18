package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) {
            return _caretCircleDown!!
        }
        _caretCircleDown = Builder(name = "CaretCircleDown", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(169.9f, 121.4f)
                lineTo(133.9f, 161.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.8f, 0.0f)
                lineToRelative(-36.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.8f, -10.8f)
                lineTo(128.0f, 144.0f)
                lineToRelative(30.1f, -33.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.8f, 10.8f)
                close()
            }
        }
        .build()
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null

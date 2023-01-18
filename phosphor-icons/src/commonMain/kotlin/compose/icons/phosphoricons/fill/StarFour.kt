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

public val FillGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.6f, 128.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -10.5f, 15.0f)
                lineToRelative(-63.9f, 23.2f)
                lineTo(143.0f, 230.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -30.0f, 0.0f)
                lineTo(89.8f, 166.2f)
                lineTo(25.9f, 143.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -30.0f)
                lineTo(89.8f, 89.8f)
                lineTo(113.0f, 25.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 30.0f, 0.0f)
                lineToRelative(23.2f, 63.9f)
                lineTo(230.1f, 113.0f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 240.6f, 128.0f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null

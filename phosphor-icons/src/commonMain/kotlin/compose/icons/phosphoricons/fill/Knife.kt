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

public val FillGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.8f, 32.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -39.7f, 0.1f)
                lineTo(18.3f, 210.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.9f, 13.4f)
                arcToRelative(154.1f, 154.1f, 0.0f, false, false, 35.0f, 4.0f)
                curveToRelative(33.4f, 0.0f, 66.8f, -10.9f, 98.3f, -32.2f)
                arcToRelative(232.0f, 232.0f, 0.0f, false, false, 50.9f, -46.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -0.7f, -10.5f)
                lineToRelative(-18.8f, -18.7f)
                lineToRelative(45.0f, -47.9f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 231.8f, 32.2f)
                close()
                moveTo(189.2f, 144.5f)
                arcToRelative(227.0f, 227.0f, 0.0f, false, true, -43.1f, 38.2f)
                curveToRelative(-34.5f, 23.2f, -70.0f, 32.6f, -105.8f, 28.1f)
                lineTo(146.6f, 101.9f)
                lineToRelative(23.3f, 23.3f)
                curveToRelative(0.1f, 0.1f, 0.2f, 0.3f, 0.4f, 0.4f)
                horizontalLineToRelative(0.1f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null

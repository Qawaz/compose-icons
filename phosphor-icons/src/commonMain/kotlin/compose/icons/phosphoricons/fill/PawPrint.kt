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

public val FillGroup.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) {
            return _pawPrint!!
        }
        _pawPrint = Builder(name = "PawPrint", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 136.0f, 60.0f)
                close()
                moveTo(72.0f, 108.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 72.0f, 108.0f)
                close()
                moveTo(92.0f, 88.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 64.0f, 60.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 92.0f, 88.0f)
                close()
                moveTo(187.1f, 148.8f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, true, -16.9f, -21.1f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, -84.4f, 0.0f)
                arcTo(35.5f, 35.5f, 0.0f, false, true, 69.0f, 148.8f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 88.0f, 224.0f)
                arcToRelative(40.5f, 40.5f, 0.0f, false, false, 15.5f, -3.1f)
                arcToRelative(64.2f, 64.2f, 0.0f, false, true, 48.9f, -0.1f)
                arcTo(39.6f, 39.6f, 0.0f, false, false, 168.0f, 224.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 19.1f, -75.2f)
                close()
                moveTo(212.0f, 80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 212.0f, 80.0f)
                close()
            }
        }
        .build()
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null

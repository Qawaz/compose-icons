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

public val FillGroup.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) {
            return _numberCircleNine!!
        }
        _numberCircleNine = Builder(name = "NumberCircleNine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 148.0f, 112.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(164.0f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f)
                horizontalLineToRelative(1.8f)
                lineToRelative(-16.7f, 27.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.8f, 11.0f)
                arcTo(8.7f, 8.7f, 0.0f, false, false, 120.0f, 188.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 6.9f, -3.9f)
                lineToRelative(32.2f, -54.0f)
                lineToRelative(0.3f, -0.5f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 164.0f, 112.0f)
                close()
            }
        }
        .build()
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null

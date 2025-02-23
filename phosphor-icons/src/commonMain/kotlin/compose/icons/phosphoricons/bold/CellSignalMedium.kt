package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CellSignalMedium: ImageVector
    get() {
        if (_cellSignalMedium != null) {
            return _cellSignalMedium!!
        }
        _cellSignalMedium = Builder(name = "CellSignalMedium", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.7f, 24.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -21.8f, 4.4f)
                lineTo(13.2f, 193.8f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 27.3f, 228.0f)
                lineTo(192.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(212.0f, 43.3f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 199.7f, 24.8f)
                close()
                moveTo(108.0f, 133.0f)
                verticalLineToRelative(71.0f)
                lineTo(37.0f, 204.0f)
                close()
                moveTo(188.0f, 204.0f)
                lineTo(132.0f, 204.0f)
                lineTo(132.0f, 109.0f)
                lineToRelative(56.0f, -56.0f)
                close()
            }
        }
        .build()
        return _cellSignalMedium!!
    }

private var _cellSignalMedium: ImageVector? = null

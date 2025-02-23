package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.7f, 32.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -15.6f, -4.1f)
                lineTo(21.8f, 80.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -2.6f, 29.9f)
                lineToRelative(85.7f, 40.5f)
                lineToRelative(40.5f, 85.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.4f, 9.1f)
                horizontalLineToRelative(1.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 14.1f, -11.6f)
                lineTo(227.8f, 47.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 223.7f, 32.3f)
                close()
                moveTo(159.9f, 229.9f)
                lineToRelative(-39.4f, -83.1f)
                lineToRelative(41.3f, -41.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.3f, -11.3f)
                lineToRelative(-41.3f, 41.3f)
                lineTo(26.1f, 96.1f)
                lineTo(212.4f, 43.6f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null

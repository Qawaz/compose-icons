package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.WebAsset: ImageVector
    get() {
        if (_webAsset != null) {
            return _webAsset!!
        }
        _webAsset = Builder(name = "WebAsset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _webAsset!!
    }

private var _webAsset: ImageVector? = null

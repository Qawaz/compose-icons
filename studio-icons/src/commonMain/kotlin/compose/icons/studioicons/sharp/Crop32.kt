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

public val SharpGroup.Crop32: ImageVector
    get() {
        if (_crop32 != null) {
            return _crop32!!
        }
        _crop32 = Builder(name = "Crop32", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _crop32!!
    }

private var _crop32: ImageVector? = null

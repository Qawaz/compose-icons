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

public val MaterialDesignIcons.PictureInPictureTopRightOutline: ImageVector
    get() {
        if (_pictureInPictureTopRightOutline != null) {
            return _pictureInPictureTopRightOutline!!
        }
        _pictureInPictureTopRightOutline = Builder(name = "PictureInPictureTopRightOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                moveTo(17.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 20.11f, 1.9f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.91f, 22.1f, 3.0f, 21.0f, 3.0f)
                moveTo(21.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _pictureInPictureTopRightOutline!!
    }

private var _pictureInPictureTopRightOutline: ImageVector? = null

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

public val MaterialDesignIcons.FolderSyncOutline: ImageVector
    get() {
        if (_folderSyncOutline != null) {
            return _folderSyncOutline!!
        }
        _folderSyncOutline = Builder(name = "FolderSyncOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 8.0f)
                verticalLineTo(11.5f)
                curveTo(21.38f, 11.24f, 20.7f, 11.07f, 20.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                curveTo(13.07f, 18.7f, 13.24f, 19.38f, 13.5f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                moveTo(19.0f, 12.0f)
                verticalLineTo(13.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 17.5f)
                curveTo(23.0f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 15.0f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(16.72f, 14.22f)
                curveTo(16.78f, 14.17f, 16.85f, 14.13f, 19.0f, 12.0f)
                moveTo(19.0f, 23.0f)
                verticalLineTo(21.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 17.5f)
                curveTo(15.0f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 20.0f)
                verticalLineTo(18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(21.28f, 20.78f)
                curveTo(21.22f, 20.83f, 21.15f, 20.87f, 19.0f, 23.0f)
                close()
            }
        }
        .build()
        return _folderSyncOutline!!
    }

private var _folderSyncOutline: ImageVector? = null

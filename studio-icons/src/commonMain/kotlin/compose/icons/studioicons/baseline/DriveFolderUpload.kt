package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.DriveFolderUpload: ImageVector
    get() {
        if (_driveFolderUpload != null) {
            return _driveFolderUpload!!
        }
        _driveFolderUpload = Builder(name = "DriveFolderUpload", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(8.0f, 13.01f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11.0f, 12.84f)
                lineTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.16f)
                lineToRelative(1.59f, 1.59f)
                lineTo(16.0f, 13.01f)
                lineTo(12.01f, 9.0f)
                lineTo(8.0f, 13.01f)
                close()
            }
        }
        .build()
        return _driveFolderUpload!!
    }

private var _driveFolderUpload: ImageVector? = null

package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.VolumeLowOutline: ImageVector
    get() {
        if (_volumeLowOutline != null) {
            return _volumeLowOutline!!
        }
        _volumeLowOutline = Builder(name = "VolumeLowOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(189.65f, 192.0f)
                horizontalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(312.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(69.65f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 10.14f, 3.63f)
                lineToRelative(91.47f, 75.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 304.0f, 392.17f)
                verticalLineTo(119.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.74f, -6.44f)
                lineToRelative(-91.47f, 75.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 189.65f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 320.0f)
                curveToRelative(9.74f, -19.41f, 16.0f, -40.81f, 16.0f, -64.0f)
                curveToRelative(0.0f, -23.51f, -6.0f, -44.4f, -16.0f, -64.0f)
            }
        }
        .build()
        return _volumeLowOutline!!
    }

private var _volumeLowOutline: ImageVector? = null

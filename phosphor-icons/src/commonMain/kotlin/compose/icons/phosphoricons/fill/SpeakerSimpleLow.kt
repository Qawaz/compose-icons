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

public val FillGroup.SpeakerSimpleLow: ImageVector
    get() {
        if (_speakerSimpleLow != null) {
            return _speakerSimpleLow!!
        }
        _speakerSimpleLow = Builder(name = "SpeakerSimpleLow", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 32.0f)
                lineTo(160.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.5f, 7.2f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.5f, 0.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.9f, -1.7f)
                lineTo(77.2f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 80.0f)
                lineTo(77.2f, 80.0f)
                lineToRelative(69.9f, -54.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 32.0f)
                close()
                moveTo(192.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(200.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 96.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleLow!!
    }

private var _speakerSimpleLow: ImageVector? = null

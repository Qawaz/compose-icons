package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.SpeakerSimpleLow: ImageVector
    get() {
        if (_speakerSimpleLow != null) {
            return _speakerSimpleLow!!
        }
        _speakerSimpleLow = Builder(name = "SpeakerSimpleLow", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.8f, 28.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -4.3f, 0.4f)
                lineTo(78.6f, 84.0f)
                horizontalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(78.6f)
                lineToRelative(70.9f, 55.2f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.5f, 0.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, -0.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 156.0f, 224.0f)
                verticalLineTo(32.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 153.8f, 28.4f)
                close()
                moveTo(148.0f, 215.8f)
                lineToRelative(-65.5f, -51.0f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 80.0f, 164.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 2.5f, -0.8f)
                lineToRelative(65.5f, -51.0f)
                close()
                moveTo(196.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleLow!!
    }

private var _speakerSimpleLow: ImageVector? = null

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

public val FillGroup.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) {
            return _musicNotesSimple!!
        }
        _musicNotesSimple = Builder(name = "MusicNotesSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 32.0f)
                verticalLineTo(172.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, true, 20.0f, 6.1f)
                verticalLineTo(42.2f)
                lineTo(88.0f, 70.2f)
                verticalLineTo(204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, true, 20.0f, 6.1f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.1f, -7.8f)
                lineToRelative(128.0f, -32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 6.8f, 1.5f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 216.0f, 32.0f)
                close()
            }
        }
        .build()
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null

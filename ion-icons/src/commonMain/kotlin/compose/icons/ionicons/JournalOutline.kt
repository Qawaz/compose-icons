package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.JournalOutline: ImageVector
    get() {
        if (_journalOutline != null) {
            return _journalOutline!!
        }
        _journalOutline = Builder(name = "JournalOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 48.0f)
                lineTo(368.0f, 48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 416.0f, 96.0f)
                lineTo(416.0f, 416.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 368.0f, 464.0f)
                lineTo(144.0f, 464.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 96.0f, 416.0f)
                lineTo(96.0f, 96.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 144.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 60.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 48.0f)
                lineTo(320.0f, 464.0f)
            }
        }
        .build()
        return _journalOutline!!
    }

private var _journalOutline: ImageVector? = null

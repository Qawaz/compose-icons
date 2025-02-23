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

public val IonIcons.TodayOutline: ImageVector
    get() {
        if (_todayOutline != null) {
            return _todayOutline!!
        }
        _todayOutline = Builder(name = "TodayOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 80.0f)
                lineTo(416.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 464.0f, 128.0f)
                lineTo(464.0f, 416.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 416.0f, 464.0f)
                lineTo(96.0f, 464.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 48.0f, 416.0f)
                lineTo(48.0f, 128.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 96.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 48.0f)
                lineTo(128.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 48.0f)
                lineTo(384.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(125.0f, 224.0f)
                lineTo(195.0f, 224.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 208.0f, 237.0f)
                lineTo(208.0f, 307.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 195.0f, 320.0f)
                lineTo(125.0f, 320.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 112.0f, 307.0f)
                lineTo(112.0f, 237.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 125.0f, 224.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 160.0f)
                lineTo(48.0f, 160.0f)
            }
        }
        .build()
        return _todayOutline!!
    }

private var _todayOutline: ImageVector? = null

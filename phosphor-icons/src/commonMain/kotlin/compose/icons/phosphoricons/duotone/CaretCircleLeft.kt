package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.CaretCircleLeft: ImageVector
    get() {
        if (_caretCircleLeft != null) {
            return _caretCircleLeft!!
        }
        _caretCircleLeft = Builder(name = "CaretCircleLeft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                moveToRelative(-96.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -192.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.9f, 86.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -0.5f)
                lineToRelative(-40.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.8f)
                lineToRelative(40.0f, 36.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 144.0f, 172.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.9f, -2.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.5f, -11.3f)
                lineTo(116.0f, 128.0f)
                lineToRelative(33.4f, -30.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 149.9f, 86.6f)
                close()
            }
        }
        .build()
        return _caretCircleLeft!!
    }

private var _caretCircleLeft: ImageVector? = null

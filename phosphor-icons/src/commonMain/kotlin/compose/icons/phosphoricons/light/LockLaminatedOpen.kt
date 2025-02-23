package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.LockLaminatedOpen: ImageVector
    get() {
        if (_lockLaminatedOpen != null) {
            return _lockLaminatedOpen!!
        }
        _lockLaminatedOpen = Builder(name = "LockLaminatedOpen", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 82.0f)
                lineTo(98.0f, 82.0f)
                lineTo(98.0f, 52.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 60.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -84.0f, 0.0f)
                lineTo(86.0f, 82.0f)
                lineTo(48.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 96.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 82.0f)
                close()
                moveTo(46.0f, 126.0f)
                lineTo(210.0f, 126.0f)
                verticalLineToRelative(20.0f)
                lineTo(46.0f, 146.0f)
                close()
                moveTo(46.0f, 158.0f)
                lineTo(210.0f, 158.0f)
                verticalLineToRelative(20.0f)
                lineTo(46.0f, 178.0f)
                close()
                moveTo(48.0f, 94.0f)
                lineTo(208.0f, 94.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineTo(46.0f, 114.0f)
                lineTo(46.0f, 96.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 48.0f, 94.0f)
                close()
                moveTo(208.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 190.0f)
                lineTo(210.0f, 190.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
            }
        }
        .build()
        return _lockLaminatedOpen!!
    }

private var _lockLaminatedOpen: ImageVector? = null

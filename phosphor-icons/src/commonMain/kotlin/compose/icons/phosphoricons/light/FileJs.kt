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

public val LightGroup.FileJs: ImageVector
    get() {
        if (_fileJs != null) {
            return _fileJs!!
        }
        _fileJs = Builder(name = "FileJs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -44.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                lineTo(66.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(121.2f, 185.7f)
                curveToRelative(-7.8f, -2.0f, -11.2f, -3.3f, -11.2f, -5.7f)
                curveToRelative(0.0f, -6.1f, 5.6f, -7.0f, 9.0f, -7.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, 11.2f, 3.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.6f, -9.2f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 119.0f, 161.0f)
                curveToRelative(-12.4f, 0.0f, -21.0f, 7.8f, -21.0f, 19.0f)
                reflectiveCurveToRelative(11.6f, 15.1f, 20.1f, 17.3f)
                reflectiveCurveTo(130.0f, 201.0f, 130.0f, 204.0f)
                reflectiveCurveToRelative(0.0f, 7.0f, -11.0f, 7.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -11.2f, -3.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.6f, 9.2f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 119.0f, 223.0f)
                curveToRelative(14.4f, 0.0f, 23.0f, -7.1f, 23.0f, -19.0f)
                reflectiveCurveTo(129.5f, 187.9f, 121.2f, 185.7f)
                close()
                moveTo(214.0f, 88.2f)
                lineTo(214.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(176.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(202.0f, 94.0f)
                lineTo(152.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(146.0f, 38.0f)
                lineTo(56.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(54.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 26.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 4.2f, 1.8f)
                lineToRelative(56.0f, 55.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 88.0f)
                close()
                moveTo(158.0f, 82.0f)
                horizontalLineToRelative(35.5f)
                lineTo(158.0f, 46.5f)
                close()
            }
        }
        .build()
        return _fileJs!!
    }

private var _fileJs: ImageVector? = null

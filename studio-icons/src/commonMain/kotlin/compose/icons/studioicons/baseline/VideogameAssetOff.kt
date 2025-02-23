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

public val BaselineGroup.VideogameAssetOff: ImageVector
    get() {
        if (_videogameAssetOff != null) {
            return _videogameAssetOff!!
        }
        _videogameAssetOff = Builder(name = "VideogameAssetOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(3.3f, 6.13f)
                curveTo(2.54f, 6.41f, 2.0f, 7.15f, 2.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(4.61f, 4.61f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.83f)
                lineTo(10.17f, 13.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(20.7f, 17.87f)
                curveTo(21.46f, 17.59f, 22.0f, 16.85f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.83f)
                lineTo(20.7f, 17.87f)
                close()
                moveTo(17.5f, 9.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f)
                reflectiveCurveTo(16.0f, 11.33f, 16.0f, 10.5f)
                reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f)
                close()
            }
        }
        .build()
        return _videogameAssetOff!!
    }

private var _videogameAssetOff: ImageVector? = null

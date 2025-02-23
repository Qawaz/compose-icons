package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.1f, 64.8f)
                lineTo(138.7f, 96.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 96.0f, 0.0f, 124.7f, 0.0f, 160.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(448.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(373.3f)
                lineTo(362.9f, 64.8f)
                curveTo(356.4f, 45.2f, 338.1f, 32.0f, 317.4f, 32.0f)
                horizontalLineTo(194.6f)
                curveToRelative(-20.7f, 0.0f, -39.0f, 13.2f, -45.5f, 32.8f)
                close()
                moveTo(384.0f, 256.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(291.3f)
                curveToRelative(-6.2f, 0.0f, -11.3f, -5.1f, -11.3f, -11.3f)
                curveToRelative(0.0f, -3.0f, 1.2f, -5.9f, 3.3f, -8.0f)
                lineTo(307.0f, 229.0f)
                curveToRelative(-13.6f, -13.4f, -31.9f, -21.0f, -51.0f, -21.0f)
                curveToRelative(-19.2f, 0.0f, -37.7f, 7.6f, -51.3f, 21.3f)
                lineTo(185.0f, 249.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(19.7f, -19.7f)
                curveTo(193.4f, 172.7f, 224.0f, 160.0f, 256.0f, 160.0f)
                curveToRelative(31.8f, 0.0f, 62.4f, 12.6f, 85.0f, 35.0f)
                lineToRelative(23.7f, -23.7f)
                curveToRelative(2.1f, -2.1f, 5.0f, -3.3f, 8.0f, -3.3f)
                curveToRelative(6.2f, 0.0f, 11.3f, 5.1f, 11.3f, 11.3f)
                verticalLineTo(256.0f)
                close()
                moveTo(128.0f, 320.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(76.7f)
                curveToRelative(6.2f, 0.0f, 11.3f, 5.1f, 11.3f, 11.3f)
                curveToRelative(0.0f, 3.0f, -1.2f, 5.9f, -3.3f, 8.0f)
                lineTo(205.0f, 347.0f)
                curveToRelative(13.6f, 13.4f, 31.9f, 21.0f, 51.0f, 21.0f)
                curveToRelative(19.2f, 0.0f, 37.7f, -7.6f, 51.3f, -21.3f)
                lineTo(327.0f, 327.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-19.7f, 19.7f)
                curveTo(318.6f, 403.3f, 288.0f, 416.0f, 256.0f, 416.0f)
                curveToRelative(-31.8f, 0.0f, -62.4f, -12.6f, -85.0f, -35.0f)
                lineToRelative(-23.7f, 23.7f)
                curveToRelative(-2.1f, 2.1f, -5.0f, 3.3f, -8.0f, 3.3f)
                curveToRelative(-6.2f, 0.0f, -11.3f, -5.1f, -11.3f, -11.3f)
                verticalLineTo(320.0f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null

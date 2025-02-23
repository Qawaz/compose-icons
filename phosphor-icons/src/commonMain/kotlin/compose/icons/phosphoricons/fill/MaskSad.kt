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

public val FillGroup.MaskSad: ImageVector
    get() {
        if (_maskSad != null) {
            return _maskSad!!
        }
        _maskSad = Builder(name = "MaskSad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.0f, 35.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -14.8f, -1.7f)
                curveTo(188.2f, 38.9f, 159.8f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveTo(67.8f, 38.9f, 53.8f, 33.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.3f)
                lineTo(32.0f, 104.0f)
                curveToRelative(0.0f, 35.8f, 9.7f, 69.5f, 27.2f, 95.0f)
                reflectiveCurveToRelative(42.6f, 41.0f, 68.8f, 41.0f)
                reflectiveCurveToRelative(50.7f, -14.5f, 68.8f, -41.0f)
                reflectiveCurveTo(224.0f, 139.8f, 224.0f, 104.0f)
                lineTo(224.0f, 48.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 217.0f, 35.1f)
                close()
                moveTo(68.2f, 125.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.6f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 0.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 23.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -0.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.6f, 11.3f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, true, -47.6f, 0.0f)
                close()
                moveTo(161.2f, 188.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.1f, 2.3f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, false, -44.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.1f, -2.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 97.0f, 177.3f)
                arcToRelative(56.3f, 56.3f, 0.0f, false, true, 62.0f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 161.2f, 188.4f)
                close()
                moveTo(187.8f, 125.3f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, true, -47.6f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.6f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 0.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 23.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -0.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 187.8f, 125.3f)
                close()
            }
        }
        .build()
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null

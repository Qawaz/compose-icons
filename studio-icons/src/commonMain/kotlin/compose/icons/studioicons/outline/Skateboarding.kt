package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Skateboarding: ImageVector
    get() {
        if (_skateboarding != null) {
            return _skateboarding!!
        }
        _skateboarding = Builder(name = "Skateboarding", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(13.0f, 4.1f, 13.0f, 3.0f)
                close()
                moveTo(7.25f, 22.5f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveTo(6.84f, 24.0f, 7.25f, 24.0f)
                reflectiveCurveTo(8.0f, 23.66f, 8.0f, 23.25f)
                reflectiveCurveTo(7.66f, 22.5f, 7.25f, 22.5f)
                close()
                moveTo(15.75f, 22.5f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveTo(15.34f, 24.0f, 15.75f, 24.0f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveTo(16.16f, 22.5f, 15.75f, 22.5f)
                close()
                moveTo(19.24f, 19.0f)
                curveToRelative(-0.24f, 0.0f, -0.45f, 0.11f, -0.59f, 0.3f)
                curveToRelative(-0.55f, 0.73f, -1.42f, 1.2f, -2.4f, 1.2f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-4.32f, -2.67f)
                lineToRelative(1.8f, -2.89f)
                curveTo(14.63f, 10.78f, 16.68f, 12.0f, 19.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.85f, 0.0f, -3.44f, -1.12f, -4.13f, -2.72f)
                lineToRelative(-0.52f, -1.21f)
                curveTo(14.16f, 5.64f, 13.61f, 5.0f, 12.7f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(4.5f, 9.0f)
                lineToRelative(1.7f, 1.06f)
                lineTo(8.1f, 7.0f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-2.4f, 3.84f)
                curveToRelative(-0.31f, 0.5f, -0.39f, 1.11f, -0.21f, 1.67f)
                lineToRelative(1.34f, 4.15f)
                lineToRelative(-3.12f, 3.76f)
                curveToRelative(-0.7f, -0.16f, -1.3f, -0.57f, -1.71f, -1.12f)
                curveTo(4.21f, 19.11f, 3.99f, 19.0f, 3.75f, 19.0f)
                curveTo(3.31f, 19.0f, 3.0f, 19.36f, 3.0f, 19.75f)
                curveToRelative(0.0f, 0.15f, 0.05f, 0.31f, 0.15f, 0.45f)
                curveToRelative(0.82f, 1.1f, 2.13f, 1.8f, 3.6f, 1.8f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.47f, 0.0f, 2.78f, -0.7f, 3.6f, -1.8f)
                curveToRelative(0.1f, -0.14f, 0.15f, -0.3f, 0.15f, -0.45f)
                curveTo(20.0f, 19.36f, 19.68f, 19.0f, 19.24f, 19.0f)
                close()
                moveTo(14.0f, 20.5f)
                horizontalLineTo(8.6f)
                lineToRelative(2.9f, -3.5f)
                lineToRelative(-1.0f, -3.3f)
                lineToRelative(3.5f, 2.2f)
                verticalLineTo(20.5f)
                close()
            }
        }
        .build()
        return _skateboarding!!
    }

private var _skateboarding: ImageVector? = null

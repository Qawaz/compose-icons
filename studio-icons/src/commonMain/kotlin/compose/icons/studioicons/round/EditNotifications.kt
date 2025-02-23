package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.EditNotifications: ImageVector
    get() {
        if (_editNotifications != null) {
            return _editNotifications!!
        }
        _editNotifications = Builder(name = "EditNotifications", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.58f, 6.25f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(-4.84f, 4.84f)
                curveTo(14.42f, 12.95f, 14.29f, 13.0f, 14.16f, 13.0f)
                horizontalLineTo(13.1f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0.0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f)
                lineTo(17.58f, 6.25f)
                close()
                moveTo(20.85f, 5.81f)
                lineToRelative(-1.06f, -1.06f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f)
                lineToRelative(-0.85f, 0.85f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(0.85f, -0.85f)
                curveTo(21.05f, 6.32f, 21.05f, 6.0f, 20.85f, 5.81f)
                close()
                moveTo(20.0f, 18.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.79f, 1.91f, -5.14f, 4.5f, -5.8f)
                verticalLineTo(3.5f)
                curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.7f)
                curveToRelative(0.82f, 0.21f, 1.57f, 0.59f, 2.21f, 1.09f)
                lineToRelative(-4.52f, 4.52f)
                curveToRelative(-0.38f, 0.38f, -0.59f, 0.88f, -0.59f, 1.41f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.77f)
                curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f)
                lineTo(18.0f, 12.2f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(1.0f)
                curveTo(19.55f, 17.0f, 20.0f, 17.45f, 20.0f, 18.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(10.0f, 21.1f, 10.0f, 20.0f)
                close()
            }
        }
        .build()
        return _editNotifications!!
    }

private var _editNotifications: ImageVector? = null

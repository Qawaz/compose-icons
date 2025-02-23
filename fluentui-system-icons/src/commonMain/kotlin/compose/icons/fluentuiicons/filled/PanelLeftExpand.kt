package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PanelLeftExpand: ImageVector
    get() {
        if (_panelLeftExpand != null) {
            return _panelLeftExpand!!
        }
        _panelLeftExpand = Builder(name = "PanelLeftExpand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1925f, 14.7512f)
                curveTo(14.4696f, 15.059f, 14.9438f, 15.0839f, 15.2517f, 14.8069f)
                lineTo(17.7517f, 12.5574f)
                curveTo(17.9098f, 12.4152f, 18.0f, 12.2127f, 18.0f, 12.0001f)
                curveTo(18.0f, 11.7875f, 17.9098f, 11.5849f, 17.7517f, 11.4427f)
                lineTo(15.2517f, 9.1932f)
                curveTo(14.9438f, 8.9162f, 14.4696f, 8.9412f, 14.1925f, 9.249f)
                curveTo(13.9154f, 9.5568f, 13.9404f, 10.0309f, 14.2483f, 10.3079f)
                lineTo(15.2955f, 11.2502f)
                lineTo(11.75f, 11.2502f)
                curveTo(11.3358f, 11.2502f, 11.0f, 11.586f, 11.0f, 12.0001f)
                curveTo(11.0f, 12.4142f, 11.3358f, 12.7499f, 11.75f, 12.7499f)
                horizontalLineTo(15.2955f)
                lineTo(14.2483f, 13.6922f)
                curveTo(13.9404f, 13.9692f, 13.9154f, 14.4434f, 14.1925f, 14.7512f)
                close()
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(9.0f, 5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 18.5f, 20.5f, 17.9404f, 20.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.0596f, 19.9404f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _panelLeftExpand!!
    }

private var _panelLeftExpand: ImageVector? = null

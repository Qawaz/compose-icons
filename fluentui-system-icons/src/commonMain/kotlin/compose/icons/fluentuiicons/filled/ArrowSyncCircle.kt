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

public val FilledGroup.ArrowSyncCircle: ImageVector
    get() {
        if (_arrowSyncCircle != null) {
            return _arrowSyncCircle!!
        }
        _arrowSyncCircle = Builder(name = "ArrowSyncCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(15.2705f, 10.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 10.75f, 13.25f, 11.0858f, 13.25f, 11.5f)
                curveTo(13.25f, 11.9142f, 13.5858f, 12.25f, 14.0f, 12.25f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 12.25f, 17.5f, 11.9142f, 17.5f, 11.5f)
                verticalLineTo(8.25f)
                curveTo(17.5f, 7.8358f, 17.1642f, 7.5f, 16.75f, 7.5f)
                curveTo(16.3358f, 7.5f, 16.0f, 7.8358f, 16.0f, 8.25f)
                verticalLineTo(8.9995f)
                curveTo(15.0879f, 7.7853f, 13.636f, 7.0f, 12.0001f, 7.0f)
                curveTo(10.4632f, 7.0f, 9.096f, 7.6604f, 8.1732f, 8.7706f)
                curveTo(7.9085f, 9.0892f, 7.9521f, 9.562f, 8.2706f, 9.8268f)
                curveTo(8.5892f, 10.0916f, 9.0621f, 10.0479f, 9.3268f, 9.7294f)
                curveTo(9.9632f, 8.9636f, 10.907f, 8.5f, 12.0001f, 8.5f)
                curveTo(13.4924f, 8.5f, 14.7674f, 9.4344f, 15.2705f, 10.75f)
                close()
                moveTo(8.0f, 15.75f)
                verticalLineTo(15.0f)
                curveTo(8.9119f, 16.2143f, 10.3638f, 17.0f, 12.0001f, 17.0f)
                curveTo(13.5252f, 17.0f, 14.9041f, 16.316f, 15.8214f, 15.237f)
                curveTo(16.0897f, 14.9214f, 16.0514f, 14.4481f, 15.7358f, 14.1798f)
                curveTo(15.4202f, 13.9115f, 14.9469f, 13.9499f, 14.6786f, 14.2655f)
                curveTo(14.0368f, 15.0204f, 13.0707f, 15.5f, 12.0001f, 15.5f)
                curveTo(10.6047f, 15.5f, 9.3986f, 14.6829f, 8.8367f, 13.5f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 13.5f, 10.75f, 13.1642f, 10.75f, 12.75f)
                curveTo(10.75f, 12.3358f, 10.4142f, 12.0f, 10.0f, 12.0f)
                horizontalLineTo(7.25f)
                curveTo(6.8358f, 12.0f, 6.5f, 12.3358f, 6.5f, 12.75f)
                verticalLineTo(15.75f)
                curveTo(6.5f, 16.1642f, 6.8358f, 16.5f, 7.25f, 16.5f)
                curveTo(7.6642f, 16.5f, 8.0f, 16.1642f, 8.0f, 15.75f)
                close()
            }
        }
        .build()
        return _arrowSyncCircle!!
    }

private var _arrowSyncCircle: ImageVector? = null

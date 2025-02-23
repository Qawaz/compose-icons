package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CommentArrowRight: ImageVector
    get() {
        if (_commentArrowRight != null) {
            return _commentArrowRight!!
        }
        _commentArrowRight = Builder(name = "CommentArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 1.0f)
                curveTo(20.5376f, 1.0f, 23.0f, 3.4624f, 23.0f, 6.5f)
                curveTo(23.0f, 9.5376f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 14.4624f, 1.0f, 17.5f, 1.0f)
                close()
                moveTo(14.5f, 6.0f)
                curveTo(14.2239f, 6.0f, 14.0f, 6.2239f, 14.0f, 6.5f)
                curveTo(14.0f, 6.7761f, 14.2239f, 7.0f, 14.5f, 7.0f)
                lineTo(19.2929f, 7.0f)
                lineTo(17.6464f, 8.6465f)
                curveTo(17.4512f, 8.8417f, 17.4512f, 9.1583f, 17.6464f, 9.3535f)
                curveTo(17.8417f, 9.5488f, 18.1583f, 9.5488f, 18.3536f, 9.3535f)
                lineTo(20.8536f, 6.8535f)
                curveTo(21.0488f, 6.6583f, 21.0488f, 6.3417f, 20.8536f, 6.1465f)
                lineTo(18.3536f, 3.6465f)
                curveTo(18.1583f, 3.4512f, 17.8417f, 3.4512f, 17.6464f, 3.6465f)
                curveTo(17.4512f, 3.8417f, 17.4512f, 4.1583f, 17.6464f, 4.3535f)
                lineTo(19.2929f, 6.0f)
                lineTo(14.5f, 6.0f)
                close()
                moveTo(20.5f, 14.75f)
                verticalLineTo(12.2678f)
                curveTo(21.051f, 11.9806f, 21.5557f, 11.6168f, 22.0f, 11.1904f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 16.5449f, 20.5449f, 18.0f, 18.75f, 18.0f)
                horizontalLineTo(13.0125f)
                lineTo(7.9987f, 21.7507f)
                curveTo(7.4458f, 22.1642f, 6.6625f, 22.0512f, 6.249f, 21.4984f)
                curveTo(6.0874f, 21.2822f, 6.0f, 21.0196f, 6.0f, 20.7499f)
                lineTo(5.9992f, 18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 18.0f, 2.0f, 16.5449f, 2.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(12.0218f)
                curveTo(11.7253f, 3.4632f, 11.4858f, 3.9665f, 11.3135f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 4.5f, 3.5f, 5.2835f, 3.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(3.5f, 15.7165f, 4.2835f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(7.4988f)
                lineTo(7.4999f, 20.2506f)
                lineTo(12.5135f, 16.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 16.5f, 20.5f, 15.7165f, 20.5f, 14.75f)
                close()
            }
        }
        .build()
        return _commentArrowRight!!
    }

private var _commentArrowRight: ImageVector? = null

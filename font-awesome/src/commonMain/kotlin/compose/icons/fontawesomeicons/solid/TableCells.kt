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

public val SolidGroup.TableCells: ImageVector
    get() {
        if (_tableCells != null) {
            return _tableCells!!
        }
        _tableCells = Builder(name = "TableCells", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(448.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(512.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(152.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 160.0f)
                lineTo(64.0f, 96.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(208.0f, 96.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(64.0f)
                lineTo(208.0f, 160.0f)
                lineTo(208.0f, 96.0f)
                close()
                moveTo(448.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(360.0f, 160.0f)
                lineTo(360.0f, 96.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(64.0f, 224.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 288.0f)
                lineTo(64.0f, 224.0f)
                close()
                moveTo(296.0f, 224.0f)
                verticalLineToRelative(64.0f)
                lineTo(208.0f, 288.0f)
                lineTo(208.0f, 224.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(360.0f, 224.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(64.0f)
                lineTo(360.0f, 288.0f)
                lineTo(360.0f, 224.0f)
                close()
                moveTo(152.0f, 352.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 416.0f)
                lineTo(64.0f, 352.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(208.0f, 352.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(64.0f)
                lineTo(208.0f, 416.0f)
                lineTo(208.0f, 352.0f)
                close()
                moveTo(448.0f, 352.0f)
                verticalLineToRelative(64.0f)
                lineTo(360.0f, 416.0f)
                lineTo(360.0f, 352.0f)
                horizontalLineToRelative(88.0f)
                close()
            }
        }
        .build()
        return _tableCells!!
    }

private var _tableCells: ImageVector? = null

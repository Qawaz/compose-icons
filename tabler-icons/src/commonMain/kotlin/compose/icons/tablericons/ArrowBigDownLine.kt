package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ArrowBigDownLine: ImageVector
    get() {
        if (_arrowBigDownLine != null) {
            return _arrowBigDownLine!!
        }
        _arrowBigDownLine = Builder(name = "ArrowBigDownLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(3.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 1.707f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, -1.707f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
            }
        }
        .build()
        return _arrowBigDownLine!!
    }

private var _arrowBigDownLine: ImageVector? = null

package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FolderSimplePlus: ImageVector
    get() {
        if (_folderSimplePlus != null) {
            return _folderSimplePlus!!
        }
        _folderSimplePlus = Builder(name = "FolderSimplePlus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 74.0f)
                lineTo(130.7f, 74.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.2f, -0.4f)
                lineTo(101.7f, 52.8f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 93.3f, 50.0f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.9f, 214.0f)
                arcTo(13.1f, 13.1f, 0.0f, false, false, 230.0f, 200.9f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(218.0f, 200.9f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.1f, 1.1f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(93.3f, 62.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.2f, 0.4f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 8.4f, 2.8f)
                lineTo(216.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(158.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 150.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 150.0f)
                lineTo(104.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(122.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 144.0f)
                close()
            }
        }
        .build()
        return _folderSimplePlus!!
    }

private var _folderSimplePlus: ImageVector? = null

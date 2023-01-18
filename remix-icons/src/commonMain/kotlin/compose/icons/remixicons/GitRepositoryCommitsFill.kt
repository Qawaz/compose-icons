package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GitRepositoryCommitsFill: ImageVector
    get() {
        if (_gitRepositoryCommitsFill != null) {
            return _gitRepositoryCommitsFill!!
        }
        _gitRepositoryCommitsFill = Builder(name = "GitRepositoryCommitsFill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                lineTo(9.0f, 17.0f)
                lineToRelative(4.0f, -5.0f)
                lineToRelative(4.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.8f)
                lineTo(13.0f, 9.5f)
                lineTo(7.647f, 16.0f)
                lineTo(6.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(10.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.5f, 21.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.0f, 17.5f)
                lineTo(3.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(7.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                close()
            }
        }
        .build()
        return _gitRepositoryCommitsFill!!
    }

private var _gitRepositoryCommitsFill: ImageVector? = null

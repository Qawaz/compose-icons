package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.CardsPlayingDiamondMultiple: ImageVector
    get() {
        if (_cardsPlayingDiamondMultiple != null) {
            return _cardsPlayingDiamondMultiple!!
        }
        _cardsPlayingDiamondMultiple = Builder(name = "CardsPlayingDiamondMultiple", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineTo(22.0f)
                curveTo(3.0f, 23.1f, 3.9f, 24.0f, 5.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                moveTo(19.0f, 0.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 0.0f, 7.0f, 0.9f, 7.0f, 2.0f)
                verticalLineTo(18.0f)
                curveTo(7.0f, 19.1f, 7.9f, 20.0f, 9.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 20.0f, 21.0f, 19.1f, 21.0f, 18.0f)
                verticalLineTo(2.0f)
                curveTo(21.0f, 0.9f, 20.1f, 0.0f, 19.0f, 0.0f)
                moveTo(14.0f, 15.0f)
                lineTo(11.0f, 10.0f)
                lineTo(14.0f, 5.0f)
                lineTo(17.0f, 10.0f)
                lineTo(14.0f, 15.0f)
                close()
            }
        }
        .build()
        return _cardsPlayingDiamondMultiple!!
    }

private var _cardsPlayingDiamondMultiple: ImageVector? = null

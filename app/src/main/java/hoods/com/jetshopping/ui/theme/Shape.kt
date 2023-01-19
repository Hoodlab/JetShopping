package hoods.com.jetshopping.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(
        topStart = 28.0.dp,
        topEnd = 28.0.dp,
        bottomEnd = 28.0.dp,
        bottomStart = 28.0.dp
    )
)
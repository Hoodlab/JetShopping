package hoods.com.jetshopping.ui

import androidx.annotation.DrawableRes
import hoods.com.jetshopping.R

object Utils {
    val category = listOf(
        Category(title = "Drinks", resId = R.drawable.ic_drinks, id = 0),
        Category(title = "Vegetable", resId = R.drawable.ic_vegitables, id = 1),
        Category(title = "Fruits", resId = R.drawable.ic_fruits, id = 2),
        Category(title = "Cleaning", resId = R.drawable.ic_cleaning, id = 3),
        Category(title = "Electronic", resId = R.drawable.ic_electronic, id = 4),
        Category(title = "None", resId =R.drawable.ic_baseline_not_interested_24 ,id = 10001)
    )
}

data class Category(
    @DrawableRes val resId: Int = -1,
    val title: String = "",
    val id: Int = -1,
)
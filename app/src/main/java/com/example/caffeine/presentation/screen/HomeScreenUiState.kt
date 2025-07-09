package com.example.caffeine.presentation.screen

import androidx.compose.ui.graphics.painter.Painter




data class OrderScreenUiState (
val coffeeList : List<Coffee> = emptyList()

)

data class Coffee (
    val id : Int ,
    val type : String ,
    val cup : Painter
)




enum class CupSize (capacity : Int) {
    SMALL (capacity = 150),
    MEDIUM (capacity = 200),
    LARGE (capacity = 400),
}
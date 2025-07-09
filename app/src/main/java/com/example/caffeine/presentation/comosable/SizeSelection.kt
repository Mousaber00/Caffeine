package com.example.caffeine.presentation.comosable

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateValueAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.example.caffeine.presentation.screen.CupSize

@Composable
fun SizeSelection (
    cupSizes : List<CupSize> = CupSize.entries,
    selectedSize : CupSize = CupSize.SMALL,

    ) {
    val selectionAlignment by animateAlignmentAsState(
        targetAlignment = when (selectedSize) {
            CupSize.SMALL -> Alignment.CenterStart
            CupSize.MEDIUM -> Alignment.Center
            CupSize.LARGE ->  Alignment.CenterEnd
        }
    )


    Box(
        modifier = Modifier,

    ){
        Box(modifier = Modifier
            .align(selectionAlignment)
            .clip(CircleShape)
            .background(color = MaterialTheme.colorScheme.onTertiary),)

    }
}
@Preview (showBackground = true)
@Composable
fun SizeSelectionPreview ( ) {
    SizeSelection()
}


@Composable
fun animateAlignmentAsState(
    targetAlignment: Alignment,
): State<Alignment> {
    val biased = targetAlignment as BiasAlignment
    val horizontal by animateFloatAsState(biased.horizontalBias, label = "")
    return remember {
        derivedStateOf {
            BiasAlignment(
                horizontalBias = horizontal,
                verticalBias = 0f
            )
        }
    }
}
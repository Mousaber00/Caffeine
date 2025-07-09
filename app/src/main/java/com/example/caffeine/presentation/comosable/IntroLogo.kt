package com.example.caffeine.presentation.comosable

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.StartOffset
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateValueAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.caffeine.R

@Composable
fun IntroLogo(
    modifier: Modifier = Modifier
) {

    val logoPosition by rememberInfiniteTransition().animateFloat(
        targetValue = 15f,
        initialValue = 0f,
        label = " ",
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000,
                easing = FastOutLinearInEasing,
            ),
            repeatMode = RepeatMode.Reverse
        )
    )
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            contentDescription = null,
            modifier = Modifier.offset(y = logoPosition.dp),
            painter = painterResource(R.drawable.coffee_ghost)
        )
    }
}
@Composable
@Preview
fun IntroLogoPreview() {
    IntroLogo()
}
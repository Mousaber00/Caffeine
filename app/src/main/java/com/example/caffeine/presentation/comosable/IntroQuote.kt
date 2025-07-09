package com.example.caffeine.presentation.comosable

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.R
import com.example.caffeine.ui.theme.urbanest

@Composable
fun IntroQuote( modifier: Modifier = Modifier) {
    val infinite = rememberInfiniteTransition()
    val starColor by infinite.animateColor(
        initialValue = MaterialTheme.colorScheme.onTertiary,
        targetValue = MaterialTheme.colorScheme.tertiary,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = FastOutLinearInEasing),
            repeatMode = RepeatMode.Reverse
        )

    )
//Card (modifier = modifier.fillMaxWidth()){

    Box(modifier = Modifier.width(240.dp).height(200.dp) ,contentAlignment = Alignment.Center)
    {
        Text(
            modifier = Modifier.align(Alignment.Center),
            lineHeight = 50.sp,
            text = " Hocus\nPocus\nI Need Coffee\nto Focus",
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontFamily = urbanest,
            fontSize = 34.sp
        )
        Image(
            contentDescription = null,
            painter = painterResource(R.drawable.star),
            colorFilter = ColorFilter.tint(starColor),
            modifier = Modifier
                .size(15.dp)
                .align(Alignment.TopEnd)
                .offset(x = -30.dp)
        )
        Image(
            contentDescription = null,
            painter = painterResource(R.drawable.star),
            colorFilter = ColorFilter.tint(starColor),
            modifier = Modifier
                .size(15.dp)
                .align(Alignment.BottomEnd)
                .offset(x = -30.dp)
        )
        Image(
            contentDescription = null,
            painter = painterResource(R.drawable.star),
            colorFilter = ColorFilter.tint(starColor),
            modifier = Modifier
                .size(15.dp)
                .align(Alignment.CenterStart)
                .offset(x = 35.dp , y = -15.dp)
        )
    }
}

//}

@Composable
@Preview
fun IntroQuotePreview ( ) {
    IntroQuote()
}
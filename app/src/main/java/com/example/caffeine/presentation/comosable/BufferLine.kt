package com.example.caffeine.presentation.comosable

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.caffeine.R

@Composable
fun BufferLine (
modifier: Modifier = Modifier,
loading : Boolean = false,
)  {

    Box(modifier
        .fillMaxWidth()
        .background(Color.White)) {
        Image(
            painter = painterResource(R.drawable.line),
            contentDescription = null,
        )
        AnimatedVisibility(
            visible = loading,
            enter = slideInHorizontally(
                animationSpec = tween(4000),
                initialOffsetX = { it }),
            exit = slideOutHorizontally(tween(4000)),
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Box(Modifier.animateEnterExit()
                .fillMaxWidth()
                .background(Color.White)) { }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun BufferLinePreview() {
    BufferLine()
}
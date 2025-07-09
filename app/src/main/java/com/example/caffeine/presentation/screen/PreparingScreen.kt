package com.example.caffeine.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.caffeine.R
import com.example.caffeine.presentation.comosable.BufferLine
import kotlinx.coroutines.delay

@Composable
fun PreparingScreen(

    navController: NavController = rememberNavController()
) {

    Column (
        modifier = Modifier.fillMaxSize().background(Color.White).padding(vertical = 64.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        var loading by remember { mutableStateOf(false) }

        LaunchedEffect(key1 = Unit, block = {
            delay(299L)
            loading = true
        })
        Image(
            painter = painterResource(R.drawable.ordered),
            contentDescription = null,
        )
        BufferLine(loading = loading)
        Image(
            painter = painterResource(R.drawable.done),
            contentDescription = null,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreparingScreenPreview() {
    PreparingScreen()
}
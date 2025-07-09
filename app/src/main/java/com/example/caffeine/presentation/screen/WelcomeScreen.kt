package com.example.caffeine.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.caffeine.navigation.Destination
import com.example.caffeine.presentation.comosable.HomeHeader
import com.example.caffeine.presentation.comosable.IntroLogo
import com.example.caffeine.presentation.comosable.IntroQuote
import com.example.caffeine.presentation.comosable.MainButton

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onClick : () -> Unit = {},
    navController: NavController = rememberNavController(),

    ) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        HomeHeader()
        IntroQuote()
        IntroLogo()
        MainButton(modifier = Modifier.padding(bottom = 10.dp) , onClick = onClick )
    }
}

@Composable
@Preview(showBackground = true)
fun WelcomeScreenPreview() {
    WelcomeScreen()
}
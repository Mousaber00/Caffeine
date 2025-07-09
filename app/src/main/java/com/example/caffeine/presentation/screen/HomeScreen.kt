package com.example.caffeine.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.caffeine.R
import com.example.caffeine.presentation.comosable.CupPager
import com.example.caffeine.presentation.comosable.HomeHeader
import com.example.caffeine.presentation.comosable.MainButton
import com.example.caffeine.presentation.comosable.WelcomeCard

@Composable
fun HomeScreen (
modifier: Modifier = Modifier,
navController : NavController = rememberNavController(),
onClick : () -> Unit = {}
)
{
Column (
    modifier = modifier.fillMaxSize(),
    verticalArrangement = Arrangement.spacedBy(12.dp),
    horizontalAlignment = Alignment.CenterHorizontally
){
    HomeHeader()
    WelcomeCard()
    Spacer(modifier = Modifier.padding(30.dp))
CupPager()
MainButton(text = "Continue" , icon = painterResource(R.drawable.arrow) , onClick = onClick)
}



}
@Preview (showBackground = true , showSystemUi = true)
@Composable
fun HomeContentPreview  ( ) {
    HomeScreen()
}
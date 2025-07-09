package com.example.caffeine.presentation.comosable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.ui.theme.urbanest


@Composable
fun WelcomeCard(
    modifier: Modifier = Modifier,
    ) {
    Column(
        modifier = modifier.fillMaxWidth().padding(start = 16.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        Text(
            text = "Good Morning",
            fontSize = 36.sp,
            fontFamily = urbanest,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.secondary,
        )
        Text(
            text = "Mostafa  ☀",
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            fontSize = 36.sp,
            fontFamily = urbanest,
            fontWeight = FontWeight.Medium

        )
        Text(
            text = "What would you like to drink today?",
            fontFamily = urbanest,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            fontSize = 16.sp
        )
    }
}

@Composable
@Preview(showBackground = true)
fun WelcomeCardPreview() {
    WelcomeCard()
}
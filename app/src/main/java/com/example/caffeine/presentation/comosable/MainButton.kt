package com.example.caffeine.presentation.comosable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caffeine.R
import com.example.caffeine.ui.theme.urbanest

@Composable
fun MainButton (
    text : String = "bring my coffee",
    icon: Painter = painterResource(R.drawable.cup),
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
    ) {
    Row (
        modifier = modifier.clip(RoundedCornerShape(30.dp))
            .background(Color.Black)
            .width(250.dp)
            .clickable(onClick = onClick),
        horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,

    ){
        Text(
            modifier = Modifier.padding(top = 20.dp , bottom = 20.dp , end = 10.dp),
            text =text  ,
            color = Color.White,
            fontSize = 18.sp,
            fontFamily = urbanest
        )
        Icon(
            painter = icon ,
            contentDescription = null,
            tint = Color.White,
        )
    }
    }
@Composable
@Preview (showBackground = true)
fun MainButtonPreview ( ) {
MainButton()
}
package com.example.caffeine.presentation.comosable

import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Start
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.caffeine.R


@Composable

fun HomeHeader (
    modifier: Modifier=Modifier,
    onAddClick:()->Unit={}
) {
    Row (
    modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
) {
    Image(
        contentDescription = null ,
        painter = painterResource(R.drawable.user),
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .clip(shape = CircleShape)

    )
Image(
    painter = painterResource(R.drawable.ic_plus),
    contentDescription = null ,
)


}
}

@Preview
@Composable
fun HomeHeaderPreview ( ) {
    HomeHeader()
}
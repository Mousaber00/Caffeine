package com.example.caffeine.presentation.comosable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.caffeine.R

@Composable
fun CupPager (
    modifier: Modifier = Modifier
) {
    val list = listOf(R.drawable.black , R.drawable.latte , R.drawable.macchiato , R.drawable.espresso)
    HorizontalPager(
        modifier = modifier
        .padding(bottom = 100.dp)
        .height(300.dp)
        .clipToBounds(),
        contentPadding = PaddingValues(horizontal = 68.dp),
        pageSpacing = (-30).dp,
        state = rememberPagerState(
            pageCount = { 4 },
        ),
        verticalAlignment = Alignment.CenterVertically,
    ){
        page ->
        Image(
            painter = painterResource(list[page]),
            contentDescription = null,
        )

    }
}
@Composable
@Preview(showBackground = true)
fun CupPagerPreview ( ) {
    CupPager()
}
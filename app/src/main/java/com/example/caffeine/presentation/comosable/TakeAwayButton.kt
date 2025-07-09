package com.example.caffeine.presentation.comosable

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateOffset
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.caffeine.R

@Composable
fun TakeAwayButton() {
    var isTakeAway by remember { mutableStateOf(false) }
    val takeAwayTransition =
        updateTransition(targetState = isTakeAway, label = "takeAwayTransition")
    val clickedButtonColor by takeAwayTransition.animateColor() {
        when (it) {
            true -> Color(0xFFFFEEE7)
            false -> MaterialTheme.colorScheme.onTertiaryContainer
        }
    }
    val clickedButtonAlignment by takeAwayTransition.animateOffset() {
        when (it) {
            true -> Offset(x = 50f, y = 0f)
            false -> Offset(x = 0f, y = 0f)
        }
    }
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(clickedButtonColor)
                .clickable { isTakeAway = !isTakeAway },
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.Center),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Text("OFF")
                Text("ON")
            }
            Image(
                modifier = Modifier.offset(
                    clickedButtonAlignment.x.dp,
                    clickedButtonAlignment.y.dp
                ),
                painter = painterResource(R.drawable.button),
                contentDescription = null,
                contentScale = ContentScale.Fit,
            )
        }
       Image(
           painter = painterResource(R.drawable.type),
           contentDescription = null,
       )
    }
}

@Composable
@Preview(showBackground = true)
fun TakeAwayButtonPreview() {
    TakeAwayButton()
}
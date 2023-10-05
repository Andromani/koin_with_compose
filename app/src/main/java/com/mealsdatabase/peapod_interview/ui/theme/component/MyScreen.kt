package com.mealsdatabase.peapod_interview.ui.theme.component // ktlint-disable package-name

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyScreen() {
//    CustomCard {
//        Text(
//            text = "Hello, Custom Layout!",
//            modifier = Modifier.padding(16.dp),
//        )
//    }

    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Count: $count", fontSize = 24.sp)
        CustomButton(
            onClick = { count++ },
            text = "Increment Count",
        )
    }
}

@Composable
fun CustomCard(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    CustomLayout(
        modifier = modifier.fillMaxWidth().padding(16.dp).background(Color.White)
            .border(1.dp, Color.Gray).padding(8.dp),
    ) {
        content()
    }
}

@Composable
fun CustomLayout(modifier: Modifier, content: @Composable () -> Unit) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        // Your custom layout logic here
        content()
    }
}

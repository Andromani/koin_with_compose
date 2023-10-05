package com.mealsdatabase.peapod_interview.ui.theme.component // ktlint-disable package-name

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    backgroundColor: Color = Color.Blue,
    textColor: Color = Color.White,
) {
    Row(
        modifier = modifier
            .size(200.dp, 60.dp)
            .background(backgroundColor)
            .clickable { onClick() }
            .padding(8.dp),
    ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = textColor)
        Text(
            text = text,
            color = textColor,
            fontSize = 18.sp,
        )
    }
}

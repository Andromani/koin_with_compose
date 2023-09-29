package com.mealsdatabase.peapod_interview.ui.theme.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mealsdatabase.peapod_interview.viewmodel.SeaFoodViewModel

@Composable
fun showSeaList(seaFoodViewModel: SeaFoodViewModel) {
    Surface(modifier = Modifier.background(Color.DarkGray)) {
        LazyColumn {
            items(seaFoodViewModel.seaFoodList.value) { mealItem ->
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Column(Modifier.weight(1f)) {
                            AsyncImage(
                                model = mealItem.strMealThumb,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(CircleShape)
                            )
                        }
                        Spacer(Modifier.width(8.dp))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically)
                                .weight(2f)
                        ) {
                            Text(
                                text = mealItem.strMeal,
                                modifier = Modifier.fillMaxSize(),
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Monospace,
                                textAlign = TextAlign.Start
                            )
                        }
                    }
                }
                Divider(
                    thickness = 0.5.dp,
                    color = Color.DarkGray
                )
            }

        }
    }
}
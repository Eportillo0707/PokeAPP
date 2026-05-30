package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.ui.theme.montserratFamily

@Composable
fun EvolutionMethodLabel(
    method: String,
    itemImageUrl: String?,
    itemWidth: Dp
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .width(itemWidth)
            .padding(top = 4.dp)
    ) {
        if (!itemImageUrl.isNullOrBlank()) {
            SubcomposeAsyncImage(
                model = itemImageUrl,
                contentDescription = method,
                loading = { },
                error = { },
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 2.dp)
            )
        }

        BasicText(
            text = method,
            style = TextStyle(
                color = Color.White.copy(alpha = 0.75f),
                fontFamily = montserratFamily,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            ),
            maxLines = 1,
            softWrap = false,
            autoSize = TextAutoSize.StepBased(
                minFontSize = 7.sp,
                maxFontSize = 13.sp
            ),
            modifier = Modifier.weight(1f)
        )
    }
}

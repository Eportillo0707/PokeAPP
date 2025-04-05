package com.emerson.pokeapp.ui.components

import android.content.res.Configuration
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.emerson.pokeapp.ui.theme.PokeAppTheme
import com.emerson.pokeapp.ui.theme.montserratFamily
import kotlinx.coroutines.delay

@Composable
fun AppLoading(
    modifier: Modifier = Modifier,
    textColor: Color = Color.White
) {
    val loadingText = "Loading"
    val dots = "..."

    var text by remember { mutableStateOf(loadingText) }
    var updates by remember { mutableIntStateOf(0) }

    LaunchedEffect(key1 = Unit) {
        while (true) {
            delay(500)
            updates++
            text = loadingText + dots.take(updates % 4)
        }

    }

    Text(
        text = text,
        fontFamily = montserratFamily,
        fontWeight = FontWeight.Bold,
        color = textColor,
        modifier = modifier

    )
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun LoadingPreview() {
    PokeAppTheme {
        AppLoading()
    }
}
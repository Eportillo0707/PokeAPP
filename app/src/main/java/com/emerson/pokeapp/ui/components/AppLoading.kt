package com.emerson.pokeapp.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emerson.pokeapp.ui.theme.PokeAppTheme
import com.emerson.pokeapp.ui.theme.montserratFamily
import kotlinx.coroutines.delay

@Composable
fun AppLoading(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFF121422),
    indicatorColor: Color = Color.White
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)

    ) {
        CircularProgressIndicator(
            color = indicatorColor,
            strokeWidth = 5.dp
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun LoadingPreview() {
    PokeAppTheme {
        AppLoading()
    }
}
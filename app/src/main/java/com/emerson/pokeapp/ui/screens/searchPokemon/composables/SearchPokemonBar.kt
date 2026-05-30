package com.emerson.pokeapp.ui.screens.searchPokemon.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emerson.pokeapp.ui.screens.pokemonList.composables.FilterButton

@Composable
fun SearchPokemonBar(
    text: String,
    focusRequester: FocusRequester,
    onTextChange: (String) -> Unit,
    onTypeSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    BasicTextField(
        value = text,
        onValueChange = onTextChange,
        modifier = modifier
            .width(350.dp)
            .height(36.dp)
            .border(0.5.dp, Color.Gray, RoundedCornerShape(12.dp))
            .background(Color(0xFF232B4C), RoundedCornerShape(12.dp))
            .focusRequester(focusRequester)
            .padding(horizontal = 12.dp, vertical = 6.dp),
        textStyle = TextStyle(
            color = Color.White,
            fontSize = 14.sp
        ),
        decorationBox = { innerTextField ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxSize()
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    modifier = Modifier.size(18.dp),
                    tint = Color.White
                )

                Spacer(modifier = Modifier.width(8.dp))

                Box(modifier = Modifier.weight(1f)) {
                    if (text.isEmpty()) {
                        Text(
                            text = "Search",
                            color = Color.LightGray,
                            fontSize = 14.sp
                        )
                    }

                    innerTextField()
                }

                FilterButton(onTypeSelected = onTypeSelected)
            }
        }
    )
}

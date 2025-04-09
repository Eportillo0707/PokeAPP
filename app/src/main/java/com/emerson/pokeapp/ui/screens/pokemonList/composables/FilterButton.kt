package com.emerson.pokeapp.ui.screens.pokemonList.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.emerson.pokeapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterButton(
      onTypeSelected: (String) -> Unit,
    modifier: Modifier = Modifier
){
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    var showFilterSheet by remember { mutableStateOf(false) }

    if (showFilterSheet) {
        ModalBottomSheet(
            onDismissRequest = { showFilterSheet = false },
            sheetState = sheetState,
            containerColor = Color(0xFF232B4C)
        ) {
            Box(
                modifier = modifier
                    .fillMaxWidth()

            ) {
                FilterContent(
                    onTypeSelected = { type ->
                        onTypeSelected(type)
                        showFilterSheet = false
                    },
                    modifier = modifier
                        .fillMaxWidth()
                )
            }
        }
    }

    IconButton(
        onClick = {
            showFilterSheet = true

        },
        modifier = Modifier
            .size(30.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_filter),
            contentDescription = "Filter",
            tint = Color.White,
            modifier = Modifier.size(18.dp)

        )
    }
}
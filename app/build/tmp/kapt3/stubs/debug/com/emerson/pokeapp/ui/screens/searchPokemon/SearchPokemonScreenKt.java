package com.emerson.pokeapp.ui.screens.searchPokemon;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\f\u001a\u00020\rH\u0003\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0003\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u0012"}, d2 = {"ScreenContent", "", "onQueryChanged", "Lkotlin/Function1;", "", "searchResultState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/emerson/pokeapp/ui/utils/UiState;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "onPokemonClick", "navController", "Landroidx/navigation/NavController;", "ScreenPreview", "SearchPokemonScreen", "viewModel", "Lcom/emerson/pokeapp/ui/screens/searchPokemon/SearchPokemonViewModel;", "app_debug"})
public final class SearchPokemonScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void SearchPokemonScreen(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.ui.screens.searchPokemon.SearchPokemonViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ScreenContent(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onQueryChanged, kotlinx.coroutines.flow.StateFlow<? extends com.emerson.pokeapp.ui.utils.UiState<? extends kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>>> searchResultState, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onPokemonClick, androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
    @androidx.compose.runtime.Composable()
    private static final void ScreenPreview() {
    }
}
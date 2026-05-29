package com.emerson.pokeapp.ui.screens.searchPokemon;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/ui/screens/searchPokemon/SearchPokemonViewModel;", "Landroidx/lifecycle/ViewModel;", "searchPokemonUseCase", "Lcom/emerson/pokeapp/domain/usecases/SearchPokemonUseCase;", "(Lcom/emerson/pokeapp/domain/usecases/SearchPokemonUseCase;)V", "_searchResults", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/emerson/pokeapp/ui/utils/UiState;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "searchResultState", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchResultState", "()Lkotlinx/coroutines/flow/StateFlow;", "onSearchQueryChanged", "", "query", "", "app_debug"})
public final class SearchPokemonViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.domain.usecases.SearchPokemonUseCase searchPokemonUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.emerson.pokeapp.ui.utils.UiState<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>>> _searchResults = null;
    
    public SearchPokemonViewModel(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.usecases.SearchPokemonUseCase searchPokemonUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.emerson.pokeapp.ui.utils.UiState<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>>> getSearchResultState() {
        return null;
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence query) {
    }
}
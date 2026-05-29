package com.emerson.pokeapp.domain.usecases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t0\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t0\n0\t\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/emerson/pokeapp/domain/usecases/SearchPokemonUseCase;", "", "repository", "Lcom/emerson/pokeapp/domain/repositories/PokemonRepository;", "(Lcom/emerson/pokeapp/domain/repositories/PokemonRepository;)V", "_searchFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "searchResult", "Lkotlinx/coroutines/flow/Flow;", "Lcom/emerson/pokeapp/ui/utils/UiState;", "Landroidx/paging/PagingData;", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "getSearchResult$annotations", "()V", "getSearchResult", "()Lkotlinx/coroutines/flow/Flow;", "performSearch", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchQuery", "", "Companion", "app_debug"})
public final class SearchPokemonUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.domain.repositories.PokemonRepository repository = null;
    @java.lang.Deprecated()
    public static final long DEBOUNCE_DURATION = 300L;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.CharSequence> _searchFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.emerson.pokeapp.ui.utils.UiState<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>>> searchResult = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.emerson.pokeapp.domain.usecases.SearchPokemonUseCase.Companion Companion = null;
    
    public SearchPokemonUseCase(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.repositories.PokemonRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.emerson.pokeapp.ui.utils.UiState<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>>> getSearchResult() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
    @java.lang.Deprecated()
    public static void getSearchResult$annotations() {
    }
    
    public final void searchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence query) {
    }
    
    private final java.lang.Object performSearch(java.lang.String query, kotlin.coroutines.Continuation<? super com.emerson.pokeapp.ui.utils.UiState<? extends kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/emerson/pokeapp/domain/usecases/SearchPokemonUseCase$Companion;", "", "()V", "DEBOUNCE_DURATION", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
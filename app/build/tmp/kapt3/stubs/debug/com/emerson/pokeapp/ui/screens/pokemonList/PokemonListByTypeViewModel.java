package com.emerson.pokeapp.ui.screens.pokemonList;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/emerson/pokeapp/ui/screens/pokemonList/PokemonListByTypeViewModel;", "Landroidx/lifecycle/ViewModel;", "getPokemonByTypeUseCase", "Lcom/emerson/pokeapp/domain/usecases/GetPokemonByTypeUseCase;", "type", "", "(Lcom/emerson/pokeapp/domain/usecases/GetPokemonByTypeUseCase;Ljava/lang/String;)V", "_pokemonList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/emerson/pokeapp/ui/utils/UiState;", "", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "pokemonList", "Lkotlinx/coroutines/flow/StateFlow;", "getPokemonList", "()Lkotlinx/coroutines/flow/StateFlow;", "getType", "()Ljava/lang/String;", "getPokemonByType", "", "app_debug"})
public final class PokemonListByTypeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.domain.usecases.GetPokemonByTypeUseCase getPokemonByTypeUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.emerson.pokeapp.ui.utils.UiState<java.util.List<com.emerson.pokeapp.domain.model.PokemonItem>>> _pokemonList = null;
    
    public PokemonListByTypeViewModel(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.usecases.GetPokemonByTypeUseCase getPokemonByTypeUseCase, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.emerson.pokeapp.ui.utils.UiState<java.util.List<com.emerson.pokeapp.domain.model.PokemonItem>>> getPokemonList() {
        return null;
    }
    
    private final void getPokemonByType(java.lang.String type) {
    }
}
package com.emerson.pokeapp.ui.screens.pokemonList;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/emerson/pokeapp/ui/screens/pokemonList/PokemonListViewModel;", "Landroidx/lifecycle/ViewModel;", "getPokemonListUseCase", "Lcom/emerson/pokeapp/domain/usecases/GetPokemonListUseCase;", "(Lcom/emerson/pokeapp/domain/usecases/GetPokemonListUseCase;)V", "_pokemonList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "pokemonItem", "Lkotlinx/coroutines/flow/StateFlow;", "getPokemonItem", "()Lkotlinx/coroutines/flow/StateFlow;", "app_debug"})
public final class PokemonListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>> _pokemonList = null;
    
    public PokemonListViewModel(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.usecases.GetPokemonListUseCase getPokemonListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>> getPokemonItem() {
        return null;
    }
}
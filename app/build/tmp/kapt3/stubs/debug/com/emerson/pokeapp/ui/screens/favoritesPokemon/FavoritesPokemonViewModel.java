package com.emerson.pokeapp.ui.screens.favoritesPokemon;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/emerson/pokeapp/ui/screens/favoritesPokemon/FavoritesPokemonViewModel;", "Landroidx/lifecycle/ViewModel;", "getFavoritePokemonUseCase", "Lcom/emerson/pokeapp/domain/usecases/GetFavoritePokemonUseCase;", "(Lcom/emerson/pokeapp/domain/usecases/GetFavoritePokemonUseCase;)V", "_favoritesPokemon", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "favoritesPokemon", "getFavoritesPokemon", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getFavorites", "", "app_debug"})
public final class FavoritesPokemonViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.domain.usecases.GetFavoritePokemonUseCase getFavoritePokemonUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.emerson.pokeapp.domain.model.PokemonItem>> _favoritesPokemon = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.emerson.pokeapp.domain.model.PokemonItem>> favoritesPokemon = null;
    
    public FavoritesPokemonViewModel(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.usecases.GetFavoritePokemonUseCase getFavoritePokemonUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.emerson.pokeapp.domain.model.PokemonItem>> getFavoritesPokemon() {
        return null;
    }
    
    private final void getFavorites() {
    }
}
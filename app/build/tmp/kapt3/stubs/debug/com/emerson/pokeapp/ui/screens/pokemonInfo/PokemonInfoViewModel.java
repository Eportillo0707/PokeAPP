package com.emerson.pokeapp.ui.screens.pokemonInfo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\u0019\u001a\u00020\u0018R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/emerson/pokeapp/ui/screens/pokemonInfo/PokemonInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "getPokemonInfoUseCase", "Lcom/emerson/pokeapp/domain/usecases/GetPokemonInfoUseCase;", "updateFavoritePokemonUseCase", "Lcom/emerson/pokeapp/domain/usecases/UpdateFavoritePokemonUseCase;", "typeCalculatorUseCase", "Lcom/emerson/pokeapp/domain/usecases/TypeCalculatorUseCase;", "pokemonName", "", "(Lcom/emerson/pokeapp/domain/usecases/GetPokemonInfoUseCase;Lcom/emerson/pokeapp/domain/usecases/UpdateFavoritePokemonUseCase;Lcom/emerson/pokeapp/domain/usecases/TypeCalculatorUseCase;Ljava/lang/String;)V", "_pokemonInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/emerson/pokeapp/ui/utils/UiState;", "Lcom/emerson/pokeapp/domain/model/PokemonInfo;", "_resistances", "Lcom/emerson/pokeapp/domain/model/TypeEffectiveness;", "pokemonInfo", "Lkotlinx/coroutines/flow/StateFlow;", "getPokemonInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "resistances", "getResistances", "loadPokemonInfo", "", "onFavoriteButtonClicked", "app_debug"})
public final class PokemonInfoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.domain.usecases.GetPokemonInfoUseCase getPokemonInfoUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.domain.usecases.UpdateFavoritePokemonUseCase updateFavoritePokemonUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.domain.usecases.TypeCalculatorUseCase typeCalculatorUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pokemonName = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.emerson.pokeapp.ui.utils.UiState<com.emerson.pokeapp.domain.model.PokemonInfo>> _pokemonInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.emerson.pokeapp.domain.model.TypeEffectiveness> _resistances = null;
    
    public PokemonInfoViewModel(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.usecases.GetPokemonInfoUseCase getPokemonInfoUseCase, @org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.usecases.UpdateFavoritePokemonUseCase updateFavoritePokemonUseCase, @org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.usecases.TypeCalculatorUseCase typeCalculatorUseCase, @org.jetbrains.annotations.NotNull()
    java.lang.String pokemonName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.emerson.pokeapp.ui.utils.UiState<com.emerson.pokeapp.domain.model.PokemonInfo>> getPokemonInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.emerson.pokeapp.domain.model.TypeEffectiveness> getResistances() {
        return null;
    }
    
    private final void loadPokemonInfo(java.lang.String pokemonName) {
    }
    
    public final void onFavoriteButtonClicked() {
    }
}
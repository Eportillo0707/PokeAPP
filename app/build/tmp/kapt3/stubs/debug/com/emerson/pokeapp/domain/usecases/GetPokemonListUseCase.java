package com.emerson.pokeapp.domain.usecases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086B\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/emerson/pokeapp/domain/usecases/GetPokemonListUseCase;", "", "repository", "Lcom/emerson/pokeapp/domain/repositories/PokemonRepository;", "(Lcom/emerson/pokeapp/domain/repositories/PokemonRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "offset", "", "query", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetPokemonListUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.domain.repositories.PokemonRepository repository = null;
    
    public GetPokemonListUseCase(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.repositories.PokemonRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int offset, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>> $completion) {
        return null;
    }
}
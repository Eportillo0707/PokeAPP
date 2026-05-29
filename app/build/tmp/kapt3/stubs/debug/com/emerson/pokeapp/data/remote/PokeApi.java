package com.emerson.pokeapp.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J4\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/emerson/pokeapp/data/remote/PokeApi;", "", "getPokemonInfo", "Lcom/emerson/pokeapp/domain/model/PokemonInfo;", "pokemonName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemonList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "limit", "", "offset", "query", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PokeApi {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPokemonList(int limit, int offset, @org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPokemonInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String pokemonName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.emerson.pokeapp.domain.model.PokemonInfo> $completion);
}
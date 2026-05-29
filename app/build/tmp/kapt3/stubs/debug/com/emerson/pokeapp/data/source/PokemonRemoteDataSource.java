package com.emerson.pokeapp.data.source;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J4\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0096@\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/emerson/pokeapp/data/source/PokemonRemoteDataSource;", "Lcom/emerson/pokeapp/data/remote/PokeApi;", "pokeApiService", "Lcom/emerson/pokeapp/data/remote/PokeApiService;", "pokemonMapper", "Lcom/emerson/pokeapp/data/remote/mappers/PokemonMapper;", "(Lcom/emerson/pokeapp/data/remote/PokeApiService;Lcom/emerson/pokeapp/data/remote/mappers/PokemonMapper;)V", "getMegaEvolutionsFromEvolutionSpecies", "", "Lcom/emerson/pokeapp/domain/model/PokemonSpecies;", "evolutionSpecies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemonByType", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "type", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemonInfo", "Lcom/emerson/pokeapp/domain/model/PokemonInfo;", "pokemonName", "getPokemonList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "limit", "", "offset", "query", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PokemonRemoteDataSource implements com.emerson.pokeapp.data.remote.PokeApi {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.data.remote.PokeApiService pokeApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.data.remote.mappers.PokemonMapper pokemonMapper = null;
    
    public PokemonRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.remote.PokeApiService pokeApiService, @org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.remote.mappers.PokemonMapper pokemonMapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPokemonList(int limit, int offset, @org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.emerson.pokeapp.domain.model.PokemonItem>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPokemonInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String pokemonName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.emerson.pokeapp.domain.model.PokemonInfo> $completion) {
        return null;
    }
    
    private final java.lang.Object getMegaEvolutionsFromEvolutionSpecies(java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> evolutionSpecies, kotlin.coroutines.Continuation<? super java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPokemonByType(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.emerson.pokeapp.domain.model.PokemonItem>> $completion) {
        return null;
    }
}
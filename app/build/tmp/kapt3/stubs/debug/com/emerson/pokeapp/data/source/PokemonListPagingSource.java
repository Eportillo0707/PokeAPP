package com.emerson.pokeapp.data.source;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\tH\u0082@\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J(\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/emerson/pokeapp/data/source/PokemonListPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "pokeApiService", "Lcom/emerson/pokeapp/data/remote/PokeApiService;", "pokemonMapper", "Lcom/emerson/pokeapp/data/remote/mappers/PokemonMapper;", "query", "", "(Lcom/emerson/pokeapp/data/remote/PokeApiService;Lcom/emerson/pokeapp/data/remote/mappers/PokemonMapper;Ljava/lang/String;)V", "getFilteredPokemonList", "", "Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class PokemonListPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.emerson.pokeapp.domain.model.PokemonItem> {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.data.remote.PokeApiService pokeApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.data.remote.mappers.PokemonMapper pokemonMapper = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String query = null;
    private static final int DEFAULT_LIMIT = 60;
    private static final int ALL_POKEMON_LIMIT = 20000;
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto> allPokemonCache;
    @org.jetbrains.annotations.NotNull()
    public static final com.emerson.pokeapp.data.source.PokemonListPagingSource.Companion Companion = null;
    
    public PokemonListPagingSource(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.remote.PokeApiService pokeApiService, @org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.remote.mappers.PokemonMapper pokemonMapper, @org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.emerson.pokeapp.domain.model.PokemonItem> state) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.emerson.pokeapp.domain.model.PokemonItem>> $completion) {
        return null;
    }
    
    private final java.lang.Object getFilteredPokemonList(java.lang.String query, kotlin.coroutines.Continuation<? super java.util.List<com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/emerson/pokeapp/data/source/PokemonListPagingSource$Companion;", "", "()V", "ALL_POKEMON_LIMIT", "", "DEFAULT_LIMIT", "allPokemonCache", "", "Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
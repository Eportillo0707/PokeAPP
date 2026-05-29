package com.emerson.pokeapp.data.repositories;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/emerson/pokeapp/data/repositories/PokemonRepositoryImpl;", "Lcom/emerson/pokeapp/domain/repositories/PokemonRepository;", "remoteDataSource", "Lcom/emerson/pokeapp/data/source/PokemonRemoteDataSource;", "pokemonDao", "Lcom/emerson/pokeapp/data/local/PokemonDao;", "(Lcom/emerson/pokeapp/data/source/PokemonRemoteDataSource;Lcom/emerson/pokeapp/data/local/PokemonDao;)V", "deleteFavorite", "", "pokemonItem", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "(Lcom/emerson/pokeapp/domain/model/PokemonItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoritePokemon", "Lkotlinx/coroutines/flow/Flow;", "", "getPokemonByType", "type", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemonInfo", "Lcom/emerson/pokeapp/domain/model/PokemonInfo;", "pokemonName", "getPokemonList", "Landroidx/paging/PagingData;", "offset", "", "query", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavorite", "app_debug"})
public final class PokemonRepositoryImpl implements com.emerson.pokeapp.domain.repositories.PokemonRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.data.source.PokemonRemoteDataSource remoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.data.local.PokemonDao pokemonDao = null;
    
    public PokemonRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.source.PokemonRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.local.PokemonDao pokemonDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPokemonList(int offset, @org.jetbrains.annotations.NotNull()
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.emerson.pokeapp.domain.model.PokemonItem>> getFavoritePokemon() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertFavorite(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.model.PokemonItem pokemonItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteFavorite(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.model.PokemonItem pokemonItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPokemonByType(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.emerson.pokeapp.domain.model.PokemonItem>> $completion) {
        return null;
    }
}
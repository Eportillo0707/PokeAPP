package com.emerson.pokeapp.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/emerson/pokeapp/data/remote/PokeApiService;", "", "getAbility", "Lcom/emerson/pokeapp/data/remote/dto/AbilityDto;", "nameOrId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEvolutionChain", "Lcom/emerson/pokeapp/data/remote/dto/EvolutionChainDto;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemonByType", "Lcom/emerson/pokeapp/data/remote/dto/TypeDto;", "getPokemonDetail", "Lcom/emerson/pokeapp/data/remote/dto/PokemonDetailDto;", "getPokemonList", "Lcom/emerson/pokeapp/data/remote/dto/PokemonListResponseDto;", "limit", "offset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemonSpecies", "Lcom/emerson/pokeapp/data/remote/dto/PokemonSpeciesDto;", "app_debug"})
public abstract interface PokeApiService {
    
    @retrofit2.http.GET(value = "pokemon")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPokemonList(@retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.emerson.pokeapp.data.remote.dto.PokemonListResponseDto> $completion);
    
    @retrofit2.http.GET(value = "pokemon/{nameOrId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPokemonDetail(@retrofit2.http.Path(value = "nameOrId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String nameOrId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.emerson.pokeapp.data.remote.dto.PokemonDetailDto> $completion);
    
    @retrofit2.http.GET(value = "pokemon-species/{nameOrId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPokemonSpecies(@retrofit2.http.Path(value = "nameOrId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String nameOrId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.emerson.pokeapp.data.remote.dto.PokemonSpeciesDto> $completion);
    
    @retrofit2.http.GET(value = "ability/{nameOrId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAbility(@retrofit2.http.Path(value = "nameOrId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String nameOrId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.emerson.pokeapp.data.remote.dto.AbilityDto> $completion);
    
    @retrofit2.http.GET(value = "evolution-chain/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEvolutionChain(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.emerson.pokeapp.data.remote.dto.EvolutionChainDto> $completion);
    
    @retrofit2.http.GET(value = "type/{nameOrId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPokemonByType(@retrofit2.http.Path(value = "nameOrId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String nameOrId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.emerson.pokeapp.data.remote.dto.TypeDto> $completion);
}
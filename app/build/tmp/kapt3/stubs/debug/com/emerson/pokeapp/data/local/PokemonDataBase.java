package com.emerson.pokeapp.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/emerson/pokeapp/data/local/PokemonDataBase;", "Landroidx/room/RoomDatabase;", "()V", "pokemonDao", "Lcom/emerson/pokeapp/data/local/PokemonDao;", "getPokemonDao", "()Lcom/emerson/pokeapp/data/local/PokemonDao;", "app_debug"})
@androidx.room.Database(entities = {com.emerson.pokeapp.data.local.model.FavoriteEntity.class}, version = 3)
@androidx.room.TypeConverters(value = {com.emerson.pokeapp.data.local.converters.StringListConverter.class})
public abstract class PokemonDataBase extends androidx.room.RoomDatabase {
    
    public PokemonDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emerson.pokeapp.data.local.PokemonDao getPokemonDao();
}
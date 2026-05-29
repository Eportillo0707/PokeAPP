package com.emerson.pokeapp.data.local.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/emerson/pokeapp/data/local/model/FavoriteEntity;", "", "pokemonItem", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "(Lcom/emerson/pokeapp/domain/model/PokemonItem;)V", "id", "", "name", "", "pokemonTypes", "", "(ILjava/lang/String;Ljava/util/List;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPokemonTypes", "()Ljava/util/List;", "app_debug"})
@androidx.room.Entity(tableName = "favorite_pokemon")
public final class FavoriteEntity {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "id")
    private final int id = 0;
    @androidx.room.ColumnInfo(name = "name")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "pokemon_types")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> pokemonTypes = null;
    
    public FavoriteEntity(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> pokemonTypes) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPokemonTypes() {
        return null;
    }
    
    public FavoriteEntity(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.domain.model.PokemonItem pokemonItem) {
        super();
    }
}
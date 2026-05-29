package com.emerson.pokeapp.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0014H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u00c6\u0003J\u0015\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\nH\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u00c6\u0003J\u00a5\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001J\u0013\u00104\u001a\u00020\u00142\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u0003H\u00d6\u0001J\t\u00107\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019\u00a8\u00068"}, d2 = {"Lcom/emerson/pokeapp/domain/model/PokemonInfo;", "", "id", "", "name", "", "height", "weight", "baseExperience", "stats", "", "Lcom/emerson/pokeapp/domain/model/PokemonStat;", "types", "evolutionChain", "Lcom/emerson/pokeapp/domain/model/PokemonSpecies;", "megaEvolutions", "abilities", "Lcom/emerson/pokeapp/domain/model/PokemonAbility;", "description", "isFavored", "", "(ILjava/lang/String;IIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getAbilities", "()Ljava/util/List;", "getBaseExperience", "()I", "getDescription", "()Ljava/lang/String;", "getEvolutionChain", "getHeight", "getId", "()Z", "setFavored", "(Z)V", "getMegaEvolutions", "getName", "getStats", "getTypes", "getWeight", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class PokemonInfo {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int height = 0;
    private final int weight = 0;
    private final int baseExperience = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.emerson.pokeapp.domain.model.PokemonStat> stats = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> types = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies>> evolutionChain = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> megaEvolutions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.emerson.pokeapp.domain.model.PokemonAbility> abilities = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private boolean isFavored;
    
    public PokemonInfo(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int height, int weight, int baseExperience, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.domain.model.PokemonStat> stats, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> types, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies>> evolutionChain, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> megaEvolutions, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.domain.model.PokemonAbility> abilities, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean isFavored) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final int getWeight() {
        return 0;
    }
    
    public final int getBaseExperience() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.domain.model.PokemonStat> getStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies>> getEvolutionChain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> getMegaEvolutions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.domain.model.PokemonAbility> getAbilities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final boolean isFavored() {
        return false;
    }
    
    public final void setFavored(boolean p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.domain.model.PokemonAbility> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.domain.model.PokemonStat> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies>> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.domain.model.PokemonInfo copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int height, int weight, int baseExperience, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.domain.model.PokemonStat> stats, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> types, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies>> evolutionChain, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> megaEvolutions, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.domain.model.PokemonAbility> abilities, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean isFavored) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}
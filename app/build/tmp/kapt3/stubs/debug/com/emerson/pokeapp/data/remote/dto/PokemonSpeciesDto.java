package com.emerson.pokeapp.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00c6\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/emerson/pokeapp/data/remote/dto/PokemonSpeciesDto;", "", "id", "", "name", "", "flavorTextEntries", "", "Lcom/emerson/pokeapp/data/remote/dto/FlavorTextEntryDto;", "evolutionChain", "Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;", "varieties", "Lcom/emerson/pokeapp/data/remote/dto/PokemonVarietyDto;", "(ILjava/lang/String;Ljava/util/List;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Ljava/util/List;)V", "getEvolutionChain", "()Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;", "getFlavorTextEntries", "()Ljava/util/List;", "getId", "()I", "getName", "()Ljava/lang/String;", "getVarieties", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class PokemonSpeciesDto {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "flavor_text_entries")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.emerson.pokeapp.data.remote.dto.FlavorTextEntryDto> flavorTextEntries = null;
    @com.google.gson.annotations.SerializedName(value = "evolution_chain")
    @org.jetbrains.annotations.Nullable()
    private final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto evolutionChain = null;
    @com.google.gson.annotations.SerializedName(value = "varieties")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.emerson.pokeapp.data.remote.dto.PokemonVarietyDto> varieties = null;
    
    public PokemonSpeciesDto(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.FlavorTextEntryDto> flavorTextEntries, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto evolutionChain, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.PokemonVarietyDto> varieties) {
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
    public final java.util.List<com.emerson.pokeapp.data.remote.dto.FlavorTextEntryDto> getFlavorTextEntries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto getEvolutionChain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.data.remote.dto.PokemonVarietyDto> getVarieties() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.data.remote.dto.FlavorTextEntryDto> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.data.remote.dto.PokemonVarietyDto> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.data.remote.dto.PokemonSpeciesDto copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.FlavorTextEntryDto> flavorTextEntries, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto evolutionChain, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.PokemonVarietyDto> varieties) {
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
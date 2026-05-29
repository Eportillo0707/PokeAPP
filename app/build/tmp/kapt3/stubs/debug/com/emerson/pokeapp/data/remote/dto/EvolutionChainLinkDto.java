package com.emerson.pokeapp.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/emerson/pokeapp/data/remote/dto/EvolutionChainLinkDto;", "", "species", "Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;", "evolutionDetails", "", "Lcom/emerson/pokeapp/data/remote/dto/EvolutionDetailDto;", "evolvesTo", "(Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Ljava/util/List;Ljava/util/List;)V", "getEvolutionDetails", "()Ljava/util/List;", "getEvolvesTo", "getSpecies", "()Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class EvolutionChainLinkDto {
    @org.jetbrains.annotations.NotNull()
    private final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto species = null;
    @com.google.gson.annotations.SerializedName(value = "evolution_details")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionDetailDto> evolutionDetails = null;
    @com.google.gson.annotations.SerializedName(value = "evolves_to")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionChainLinkDto> evolvesTo = null;
    
    public EvolutionChainLinkDto(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto species, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionDetailDto> evolutionDetails, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionChainLinkDto> evolvesTo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionDetailDto> getEvolutionDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionChainLinkDto> getEvolvesTo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionDetailDto> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionChainLinkDto> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.data.remote.dto.EvolutionChainLinkDto copy(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto species, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionDetailDto> evolutionDetails, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.EvolutionChainLinkDto> evolvesTo) {
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
package com.emerson.pokeapp.data.remote.mappers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\n2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001dJ\f\u0010%\u001a\u00020\u0006*\u00020\u0006H\u0002\u00a8\u0006&"}, d2 = {"Lcom/emerson/pokeapp/data/remote/mappers/PokemonMapper;", "", "()V", "extractEvolutionChainId", "", "url", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "extractIdFromUrl", "flattenEvolutionChain", "", "Lcom/emerson/pokeapp/domain/model/PokemonSpecies;", "link", "Lcom/emerson/pokeapp/data/remote/dto/EvolutionChainLinkDto;", "evolvesFromSpeciesId", "(Lcom/emerson/pokeapp/data/remote/dto/EvolutionChainLinkDto;Ljava/lang/Integer;)Ljava/util/List;", "formatApiName", "value", "formatEvolutionMethod", "detail", "Lcom/emerson/pokeapp/data/remote/dto/EvolutionDetailDto;", "getItemSpriteUrl", "itemName", "mapEvolutionSpecies", "evolutionChain", "Lcom/emerson/pokeapp/data/remote/dto/EvolutionChainDto;", "mapToInfo", "Lcom/emerson/pokeapp/domain/model/PokemonInfo;", "pokemon", "Lcom/emerson/pokeapp/data/remote/dto/PokemonDetailDto;", "species", "Lcom/emerson/pokeapp/data/remote/dto/PokemonSpeciesDto;", "abilities", "Lcom/emerson/pokeapp/data/remote/dto/AbilityDto;", "extraEvolutionForms", "mapToItem", "Lcom/emerson/pokeapp/domain/model/PokemonItem;", "cleanText", "app_debug"})
public final class PokemonMapper {
    
    public PokemonMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.domain.model.PokemonItem mapToItem(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.remote.dto.PokemonDetailDto pokemon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.domain.model.PokemonInfo mapToInfo(@org.jetbrains.annotations.NotNull()
    com.emerson.pokeapp.data.remote.dto.PokemonDetailDto pokemon, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.PokemonSpeciesDto species, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.EvolutionChainDto evolutionChain, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.data.remote.dto.AbilityDto> abilities, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> extraEvolutionForms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> mapEvolutionSpecies(@org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.EvolutionChainDto evolutionChain) {
        return null;
    }
    
    private final java.util.List<com.emerson.pokeapp.domain.model.PokemonSpecies> flattenEvolutionChain(com.emerson.pokeapp.data.remote.dto.EvolutionChainLinkDto link, java.lang.Integer evolvesFromSpeciesId) {
        return null;
    }
    
    public final int extractIdFromUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer extractEvolutionChainId(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        return null;
    }
    
    private final java.lang.String cleanText(java.lang.String $this$cleanText) {
        return null;
    }
    
    private final java.lang.String formatEvolutionMethod(com.emerson.pokeapp.data.remote.dto.EvolutionDetailDto detail) {
        return null;
    }
    
    private final java.lang.String getItemSpriteUrl(java.lang.String itemName) {
        return null;
    }
    
    private final java.lang.String formatApiName(java.lang.String value) {
        return null;
    }
}
package com.emerson.pokeapp.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010+\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u00aa\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020\u000fH\u00d6\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b&\u0010!\u00a8\u0006:"}, d2 = {"Lcom/emerson/pokeapp/data/remote/dto/EvolutionDetailDto;", "", "minLevel", "", "trigger", "Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;", "item", "heldItem", "knownMove", "knownMoveType", "location", "minHappiness", "minBeauty", "minAffection", "timeOfDay", "", "needsOverworldRain", "", "turnUpsideDown", "(Ljava/lang/Integer;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getHeldItem", "()Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;", "getItem", "getKnownMove", "getKnownMoveType", "getLocation", "getMinAffection", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinBeauty", "getMinHappiness", "getMinLevel", "getNeedsOverworldRain", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimeOfDay", "()Ljava/lang/String;", "getTrigger", "getTurnUpsideDown", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Lcom/emerson/pokeapp/data/remote/dto/NamedApiResourceDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/emerson/pokeapp/data/remote/dto/EvolutionDetailDto;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class EvolutionDetailDto {
    @com.google.gson.annotations.SerializedName(value = "min_level")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer minLevel = null;
    @org.jetbrains.annotations.Nullable()
    private final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto trigger = null;
    @org.jetbrains.annotations.Nullable()
    private final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto item = null;
    @com.google.gson.annotations.SerializedName(value = "held_item")
    @org.jetbrains.annotations.Nullable()
    private final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto heldItem = null;
    @com.google.gson.annotations.SerializedName(value = "known_move")
    @org.jetbrains.annotations.Nullable()
    private final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto knownMove = null;
    @com.google.gson.annotations.SerializedName(value = "known_move_type")
    @org.jetbrains.annotations.Nullable()
    private final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto knownMoveType = null;
    @org.jetbrains.annotations.Nullable()
    private final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto location = null;
    @com.google.gson.annotations.SerializedName(value = "min_happiness")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer minHappiness = null;
    @com.google.gson.annotations.SerializedName(value = "min_beauty")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer minBeauty = null;
    @com.google.gson.annotations.SerializedName(value = "min_affection")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer minAffection = null;
    @com.google.gson.annotations.SerializedName(value = "time_of_day")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String timeOfDay = null;
    @com.google.gson.annotations.SerializedName(value = "needs_overworld_rain")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean needsOverworldRain = null;
    @com.google.gson.annotations.SerializedName(value = "turn_upside_down")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean turnUpsideDown = null;
    
    public EvolutionDetailDto(@org.jetbrains.annotations.Nullable()
    java.lang.Integer minLevel, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto trigger, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto item, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto heldItem, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto knownMove, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto knownMoveType, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto location, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minHappiness, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minBeauty, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minAffection, @org.jetbrains.annotations.Nullable()
    java.lang.String timeOfDay, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean needsOverworldRain, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean turnUpsideDown) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMinLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto getTrigger() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto getItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto getHeldItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto getKnownMove() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto getKnownMoveType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMinHappiness() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMinBeauty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMinAffection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimeOfDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getNeedsOverworldRain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getTurnUpsideDown() {
        return null;
    }
    
    public EvolutionDetailDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.data.remote.dto.EvolutionDetailDto copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer minLevel, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto trigger, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto item, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto heldItem, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto knownMove, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto knownMoveType, @org.jetbrains.annotations.Nullable()
    com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto location, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minHappiness, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minBeauty, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minAffection, @org.jetbrains.annotations.Nullable()
    java.lang.String timeOfDay, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean needsOverworldRain, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean turnUpsideDown) {
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
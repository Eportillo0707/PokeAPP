package com.emerson.pokeapp.data.remote.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0010"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter;", "", "()V", "Data", "Pokemon_v2_ability", "Pokemon_v2_abilityflavortext", "Pokemon_v2_evolutionchain", "Pokemon_v2_pokemon", "Pokemon_v2_pokemonability", "Pokemon_v2_pokemonspeciesflavortext", "Pokemon_v2_pokemonspecy", "Pokemon_v2_pokemonspecy1", "Pokemon_v2_pokemonstat", "Pokemon_v2_pokemontype", "Pokemon_v2_stat", "Pokemon_v2_type", "app_debug"})
public final class GetPokemonInfoQuery_ResponseAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter INSTANCE = null;
    
    private GetPokemonInfoQuery_ResponseAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Data;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Data implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Data> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Data INSTANCE = null;
        
        private Data() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Data fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Data value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_ability;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_ability;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_ability implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_ability> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_ability INSTANCE = null;
        
        private Pokemon_v2_ability() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_ability fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_ability value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_abilityflavortext;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_abilityflavortext;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_abilityflavortext implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_abilityflavortext> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_abilityflavortext INSTANCE = null;
        
        private Pokemon_v2_abilityflavortext() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_abilityflavortext fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_abilityflavortext value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_evolutionchain;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_evolutionchain;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_evolutionchain implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_evolutionchain> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_evolutionchain INSTANCE = null;
        
        private Pokemon_v2_evolutionchain() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_evolutionchain fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_evolutionchain value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_pokemon;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_pokemon;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_pokemon implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemon> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_pokemon INSTANCE = null;
        
        private Pokemon_v2_pokemon() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemon fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemon value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_pokemonability;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_pokemonability;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_pokemonability implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonability> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_pokemonability INSTANCE = null;
        
        private Pokemon_v2_pokemonability() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonability fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonability value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_pokemonspeciesflavortext;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_pokemonspeciesflavortext;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_pokemonspeciesflavortext implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspeciesflavortext> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_pokemonspeciesflavortext INSTANCE = null;
        
        private Pokemon_v2_pokemonspeciesflavortext() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspeciesflavortext fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspeciesflavortext value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_pokemonspecy;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_pokemonspecy;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_pokemonspecy implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspecy> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_pokemonspecy INSTANCE = null;
        
        private Pokemon_v2_pokemonspecy() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspecy fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspecy value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_pokemonspecy1;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_pokemonspecy1;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_pokemonspecy1 implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspecy1> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_pokemonspecy1 INSTANCE = null;
        
        private Pokemon_v2_pokemonspecy1() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspecy1 fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonspecy1 value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_pokemonstat;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_pokemonstat;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_pokemonstat implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonstat> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_pokemonstat INSTANCE = null;
        
        private Pokemon_v2_pokemonstat() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonstat fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemonstat value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_pokemontype;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_pokemontype;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_pokemontype implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemontype> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_pokemontype INSTANCE = null;
        
        private Pokemon_v2_pokemontype() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemontype fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_pokemontype value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_stat;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_stat;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_stat implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_stat> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_stat INSTANCE = null;
        
        private Pokemon_v2_stat() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_stat fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_stat value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/emerson/pokeapp/data/remote/adapter/GetPokemonInfoQuery_ResponseAdapter$Pokemon_v2_type;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/emerson/pokeapp/data/remote/GetPokemonInfoQuery$Pokemon_v2_type;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "app_debug"})
    public static final class Pokemon_v2_type implements com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_type> {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.data.remote.adapter.GetPokemonInfoQuery_ResponseAdapter.Pokemon_v2_type INSTANCE = null;
        
        private Pokemon_v2_type() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_type fromJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override()
        public void toJson(@org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull()
        com.emerson.pokeapp.data.remote.GetPokemonInfoQuery.Pokemon_v2_type value) {
        }
    }
}
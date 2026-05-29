package com.emerson.pokeapp.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005&\'()*B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u00c6\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u00c6\u0001J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0004H\u00d6\u0001J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006+"}, d2 = {"Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery;", "Lcom/apollographql/apollo3/api/Query;", "Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Data;", "limit", "", "offset", "query", "Lcom/apollographql/apollo3/api/Optional;", "", "(IILcom/apollographql/apollo3/api/Optional;)V", "getLimit", "()I", "getOffset", "getQuery", "()Lcom/apollographql/apollo3/api/Optional;", "adapter", "Lcom/apollographql/apollo3/api/Adapter;", "component1", "component2", "component3", "copy", "document", "equals", "", "other", "", "hashCode", "id", "name", "rootField", "Lcom/apollographql/apollo3/api/CompiledField;", "serializeVariables", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toString", "Companion", "Data", "Pokemon_v2_pokemon", "Pokemon_v2_pokemontype", "Pokemon_v2_type", "app_debug"})
public final class GetPokemonListQuery implements com.apollographql.apollo3.api.Query<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Data> {
    private final int limit = 0;
    private final int offset = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.apollographql.apollo3.api.Optional<java.lang.String> query = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OPERATION_ID = "ac714b4f151701386d4efa42393f8dfbb8ebb3b659d5ebcd74ccd7a40131c6bc";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OPERATION_NAME = "getPokemonList";
    @org.jetbrains.annotations.NotNull()
    public static final com.emerson.pokeapp.data.remote.GetPokemonListQuery.Companion Companion = null;
    
    public GetPokemonListQuery(int limit, int offset, @org.jetbrains.annotations.NotNull()
    com.apollographql.apollo3.api.Optional<java.lang.String> query) {
        super();
    }
    
    public final int getLimit() {
        return 0;
    }
    
    public final int getOffset() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.apollographql.apollo3.api.Optional<java.lang.String> getQuery() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String id() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String document() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String name() {
        return null;
    }
    
    @java.lang.Override()
    public void serializeVariables(@org.jetbrains.annotations.NotNull()
    com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull()
    com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.apollographql.apollo3.api.Adapter<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Data> adapter() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.apollographql.apollo3.api.CompiledField rootField() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.apollographql.apollo3.api.Optional<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emerson.pokeapp.data.remote.GetPokemonListQuery copy(int limit, int offset, @org.jetbrains.annotations.NotNull()
    com.apollographql.apollo3.api.Optional<java.lang.String> query) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Companion;", "", "()V", "OPERATION_DOCUMENT", "", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_ID", "OPERATION_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOPERATION_DOCUMENT() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Data;", "Lcom/apollographql/apollo3/api/Query$Data;", "pokemon_v2_pokemon", "", "Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Pokemon_v2_pokemon;", "(Ljava/util/List;)V", "getPokemon_v2_pokemon", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    @com.apollographql.apollo3.annotations.ApolloAdaptableWith(adapter = com.emerson.pokeapp.data.remote.adapter.GetPokemonListQuery_ResponseAdapter.Data.class)
    public static final class Data implements com.apollographql.apollo3.api.Query.Data {
        
        /**
         * fetch data from the table: "pokemon_v2_pokemon"
         */
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemon> pokemon_v2_pokemon = null;
        
        public Data(@org.jetbrains.annotations.NotNull()
        java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemon> pokemon_v2_pokemon) {
            super();
        }
        
        /**
         * fetch data from the table: "pokemon_v2_pokemon"
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemon> getPokemon_v2_pokemon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemon> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emerson.pokeapp.data.remote.GetPokemonListQuery.Data copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemon> pokemon_v2_pokemon) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Pokemon_v2_pokemon;", "", "id", "", "name", "", "pokemon_v2_pokemontypes", "", "Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Pokemon_v2_pokemontype;", "(ILjava/lang/String;Ljava/util/List;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPokemon_v2_pokemontypes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class Pokemon_v2_pokemon {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        /**
         * An array relationship
         */
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemontype> pokemon_v2_pokemontypes = null;
        
        public Pokemon_v2_pokemon(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemontype> pokemon_v2_pokemontypes) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        /**
         * An array relationship
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemontype> getPokemon_v2_pokemontypes() {
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
        public final java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemontype> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemon copy(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.util.List<com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemontype> pokemon_v2_pokemontypes) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Pokemon_v2_pokemontype;", "", "pokemon_v2_type", "Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Pokemon_v2_type;", "(Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Pokemon_v2_type;)V", "getPokemon_v2_type", "()Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Pokemon_v2_type;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Pokemon_v2_pokemontype {
        
        /**
         * An object relationship
         */
        @org.jetbrains.annotations.Nullable()
        private final com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_type pokemon_v2_type = null;
        
        public Pokemon_v2_pokemontype(@org.jetbrains.annotations.Nullable()
        com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_type pokemon_v2_type) {
            super();
        }
        
        /**
         * An object relationship
         */
        @org.jetbrains.annotations.Nullable()
        public final com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_type getPokemon_v2_type() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_type component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_pokemontype copy(@org.jetbrains.annotations.Nullable()
        com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_type pokemon_v2_type) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/emerson/pokeapp/data/remote/GetPokemonListQuery$Pokemon_v2_type;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Pokemon_v2_type {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public Pokemon_v2_type(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emerson.pokeapp.data.remote.GetPokemonListQuery.Pokemon_v2_type copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
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
}
package com.emerson.pokeapp.data.local.converters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/emerson/pokeapp/data/local/converters/StringListConverter;", "", "()V", "fromStringList", "", "list", "", "toStringList", "string", "Companion", "app_debug"})
@androidx.room.ProvidedTypeConverter()
public final class StringListConverter {
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String SEPARATOR = ",";
    @org.jetbrains.annotations.NotNull()
    private static final com.emerson.pokeapp.data.local.converters.StringListConverter.Companion Companion = null;
    
    public StringListConverter() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fromStringList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> toStringList(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/emerson/pokeapp/data/local/converters/StringListConverter$Companion;", "", "()V", "SEPARATOR", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
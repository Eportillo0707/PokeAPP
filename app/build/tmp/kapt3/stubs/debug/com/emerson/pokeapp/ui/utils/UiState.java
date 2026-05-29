package com.emerson.pokeapp.ui.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/emerson/pokeapp/ui/utils/UiState;", "T", "", "()V", "Error", "Loading", "Result", "Lcom/emerson/pokeapp/ui/utils/UiState$Error;", "Lcom/emerson/pokeapp/ui/utils/UiState$Loading;", "Lcom/emerson/pokeapp/ui/utils/UiState$Result;", "app_debug"})
public abstract class UiState<T extends java.lang.Object> {
    
    private UiState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/emerson/pokeapp/ui/utils/UiState$Error;", "Lcom/emerson/pokeapp/ui/utils/UiState;", "", "()V", "app_debug"})
    public static final class Error extends com.emerson.pokeapp.ui.utils.UiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.ui.utils.UiState.Error INSTANCE = null;
        
        private Error() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/emerson/pokeapp/ui/utils/UiState$Loading;", "Lcom/emerson/pokeapp/ui/utils/UiState;", "", "()V", "app_debug"})
    public static final class Loading extends com.emerson.pokeapp.ui.utils.UiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.emerson.pokeapp.ui.utils.UiState.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/emerson/pokeapp/ui/utils/UiState$Result;", "T", "", "Lcom/emerson/pokeapp/ui/utils/UiState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Result<T extends java.lang.Object> extends com.emerson.pokeapp.ui.utils.UiState<T> {
        @org.jetbrains.annotations.NotNull()
        private final T data = null;
        
        public Result(@org.jetbrains.annotations.NotNull()
        T data) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T getData() {
            return null;
        }
    }
}
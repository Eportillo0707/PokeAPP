package com.emerson.pokeapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.emerson.pokeapp.data.local.model.FavoriteEntity
import kotlinx.coroutines.flow.Flow

@Dao
internal interface PokemonDao {
    @Query("SELECT * FROM favorite_pokemon")
    fun getAllFavorites(): Flow<List<FavoriteEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(entity: FavoriteEntity)

    @Delete
    suspend fun deleteFavorite(entity: FavoriteEntity)

}
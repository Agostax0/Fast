package com.agosta.fast.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert
import com.agosta.fast.data.model.FoodEntity
import com.agosta.fast.data.model.FoodEntityTableName
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {

    @Query("SELECT * FROM ${FoodEntityTableName.tableName}")
    suspend fun getAll(): List<FoodEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(entity: FoodEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(entities: Collection<FoodEntity>)

    @Upsert
    fun upsert(entity: FoodEntity)

    @Upsert
    fun upsertAll(entities: Collection<FoodEntity>)

    @Delete
    fun delete(entity: FoodEntity)

    @Delete
    fun deleteAll(entities: Collection<FoodEntity>)

}
package com.agosta.fast.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.agosta.fast.data.dao.FoodDao
import com.agosta.fast.data.model.FoodEntity

@Database(
    entities = [FoodEntity::class],
    version = 1,
    exportSchema = true
)
internal abstract class FastDatabase : RoomDatabase() {
    abstract fun foodDao(): FoodDao
}
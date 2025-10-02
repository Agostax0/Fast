package com.agosta.fast.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "FoodEntity"
)
data class FoodEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,

    @ColumnInfo
    val name: String,

    val description: String,

    val barcode: String
)

object FoodEntityTableName {
    const val tableName: String =  "FoodEntity"
}

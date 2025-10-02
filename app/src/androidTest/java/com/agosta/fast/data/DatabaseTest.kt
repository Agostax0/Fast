package com.agosta.fast.data

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.agosta.fast.data.dao.FoodDao
import org.junit.After
import org.junit.Before

internal abstract class DatabaseTest {
    private lateinit var db: FastDatabase
    protected lateinit var foodDao: FoodDao

    @Before
    fun setup(){
        db = run {
            val context = ApplicationProvider.getApplicationContext<Context>()
            Room.inMemoryDatabaseBuilder(context, FastDatabase::class.java).build()
        }

        foodDao = db.foodDao()
    }

    @After
    fun teardown() = db.close()
}
package com.agosta.fast.data

import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Test

internal class FoodDaoTest : DatabaseTest() {
    @Test
    fun getFoods_allEntries_getAllEntriesInitiallyEmpty(): Unit = runTest {
        assertTrue(foodDao.getAll().isEmpty())
    }
}
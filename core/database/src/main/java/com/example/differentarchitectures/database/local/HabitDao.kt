package com.example.differentarchitectures.database.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface HabitDao {
    @Insert
    fun insert(entityHabit: EntityHabit)

    @Delete
    fun delete(entityHabit: EntityHabit)

    @Update
    fun update(entityHabit: EntityHabit)

    @Query("SELECT * FROM EntityHabit")
    fun getAll(): List<EntityHabit>
}
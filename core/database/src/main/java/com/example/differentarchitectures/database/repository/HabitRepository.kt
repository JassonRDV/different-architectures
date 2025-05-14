package com.example.differentarchitectures.database.repository

import com.example.differentarchitectures.database.local.EntityHabit

interface HabitRepository {
    fun insert(entityHabit: EntityHabit)
    fun delete(entityHabit: EntityHabit)
    fun update(entityHabit: EntityHabit)
    fun getAll(): List<EntityHabit>
}
package com.example.differentarchitectures.database.repository

import com.example.differentarchitectures.database.local.EntityHabit
import com.example.differentarchitectures.database.local.HabitDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HabitRepositoryImpl @Inject constructor(
   private val habitDao: HabitDao
) : HabitRepository {

    override fun insert(entityHabit: EntityHabit) = habitDao.insert(entityHabit)

    override fun delete(entityHabit: EntityHabit) = habitDao.delete(entityHabit)

    override fun update(entityHabit: EntityHabit) = habitDao.update(entityHabit)

    override fun getAll(): List<EntityHabit> = habitDao.getAll()
}
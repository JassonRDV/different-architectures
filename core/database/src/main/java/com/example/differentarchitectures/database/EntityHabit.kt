package com.example.differentarchitectures.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habit_table")
data class EntityHabit(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "habit_name") val habitName: String,
    @ColumnInfo(name = "habit_local") val habitLocal: String
)

package com.example.differentarchitectures.database.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.differentarchitectures.database.local.model.HabitDays

@Entity
data class EntityHabit(
    @PrimaryKey(autoGenerate = true) val id : Long = 0L,
    @ColumnInfo(name = "title") val habitTitle : String,
    @ColumnInfo(name = "description") val habitDescription : String,
    @ColumnInfo(name = "days") val habitDays : Set<HabitDays>
)
package com.example.differentarchitectures.database.local

import androidx.room.TypeConverter
import com.example.differentarchitectures.database.local.model.HabitDays

class Converter {

    @TypeConverter
    fun fromHabitDays(days: Set<HabitDays>): String {
        return days.joinToString(",") { it.name }
    }

    @TypeConverter
    fun fromString(value: String): Set<HabitDays> {
        return value.split(",").map { HabitDays.valueOf(it) }.toSet()
    }
}
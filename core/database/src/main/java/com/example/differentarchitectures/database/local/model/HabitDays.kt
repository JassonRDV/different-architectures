package com.example.differentarchitectures.database.local.model

enum class HabitDays(val dayInt: Int) {
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4);

    companion object {
        fun fromInt(value: Int) = HabitDays.entries.firstOrNull() { it.dayInt == value }
    }
}

data class Habit(
    val id: Long = 0L,
    val habitTitle: String,
    val habitDescription: String,
    val habitDays: Set<HabitDays>
)
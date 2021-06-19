package ru.geekbrains.weather.room

import androidx.room.Entity
import androidx.room.PrimaryKey

const val ID = "id"
const val CITY = "city"
const val TEMPERATURE = "temperature"

@Entity
data class HistoryEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val city: String = "",
    val condition: String = "",
    val temperature: Int = 0,
    val humidity: Int = 0
)

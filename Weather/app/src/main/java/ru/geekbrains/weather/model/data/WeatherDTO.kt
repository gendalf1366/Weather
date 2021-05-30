package ru.geekbrains.weather.model.data

import java.util.*

data class WeatherDTO(
    val fact: FactDTO?
)

data class FactDTO(
    val condition: String?,
    val temp: Int?,
    val humidity: Int?,
    val feels_like: Int?
)
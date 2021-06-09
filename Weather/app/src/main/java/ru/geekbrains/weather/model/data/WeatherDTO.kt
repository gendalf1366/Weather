package ru.geekbrains.weather.model.data

data class WeatherDTO(
    val fact: FactDTO?
)

data class FactDTO(
    val condition: String?,
    val temp: Int?,
    val humidity: Int?,
    val feels_like: Int,
    val icon: String?
)

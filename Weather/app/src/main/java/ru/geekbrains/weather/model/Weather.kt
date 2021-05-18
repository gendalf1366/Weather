package ru.geekbrains.weather.model

data class Weather(
    val city: String = "Москва",
    val conditionText: String = "облачно",
    val dateTime: String = "18 Марта 2021",
    val temperature: Int = 0,
    val feelsLike: Int = 0,
    val humidity: Int = 70,
    val pressure: Int = 1001,
    val visibility: Int = 4
)



package ru.geekbrains.weather.utils

import ru.geekbrains.weather.model.Weather
import ru.geekbrains.weather.model.data.FactDTO
import ru.geekbrains.weather.model.data.WeatherDTO
import ru.geekbrains.weather.model.getDefaultCity


fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(Weather(getDefaultCity(), fact.condition, fact.temp!!,  fact.humidity!!,
        fact.feels_like, fact.icon))
}

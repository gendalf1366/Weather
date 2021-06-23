package ru.geekbrains.weather.utils

import ru.geekbrains.weather.model.Weather
import ru.geekbrains.weather.model.data.City
import ru.geekbrains.weather.model.data.FactDTO
import ru.geekbrains.weather.model.data.WeatherDTO
import ru.geekbrains.weather.model.getDefaultCity
import ru.geekbrains.weather.room.HistoryEntity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(
        Weather(
            getDefaultCity(),
            fact.condition!!,
            fact.temp!!,
            fact.humidity!!,
            fact.feels_like,
            fact.icon
        )
    )
}

fun convertHistoryEntityToWeather(entityList: List<HistoryEntity>): List<Weather> {
    return entityList.map {
        Weather(City(it.city, 0.0, 0.0), it.condition, it.temperature, it.humidity)
    }
}

fun convertWeatherToEntity(weather: Weather): HistoryEntity {
    return HistoryEntity(0, weather.city.city, weather.conditionText.toString(), weather.temperature, weather.humidity)
}

package ru.geekbrains.weather.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import ru.geekbrains.weather.model.data.City
import ru.geekbrains.weather.model.data.Condition
import ru.geekbrains.weather.model.data.DataTime

@Parcelize
data class Weather(
    val city: City = getDefaultCity(),
    val conditionText: Condition = getDefaultCondition(),
    val dateTime: DataTime = getDefaultDataTime(),
    val temperature: Int = 0,
    val humidity: Int = 70,
    val pressure: Int = 1001,
    val visibility: Int = 4
) : Parcelable

fun getDefaultCity() = City("Москва")
fun getDefaultCondition() = Condition("облачно")
fun getDefaultDataTime() = DataTime("18 Марта 2021")

fun getWorldCities(): List<Weather> {
    return listOf(
        Weather(City("Лондон"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Токио"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Париж"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Берлин"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Рим"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Минск"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Стамбул"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Вашингтон"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Киев"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Пекин"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000)
    )
}

fun getRussianCities(): List<Weather> {
    return listOf(
        Weather(City("Москва"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Санкт-Петербург"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Новосибирск"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Екатеринбург"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Нижний Новгород"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Казань"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Челябинск"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Омск"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Ростов-на-Дону"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000),
        Weather(City("Уфа"), (Condition("дождь")), (DataTime("18 Марта 2021")), 10, 100, 80, 1000)
    )
}



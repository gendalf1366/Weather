package ru.geekbrains.weather.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import ru.geekbrains.weather.model.data.City

@Parcelize
data class Weather(
    val city: City = getDefaultCity(),
    val conditionText: String? = "дождь",
    val temperature: Int = 0,
    val humidity: Int = 0,
    val feelsLike: Int = 0,
    val icon: String? = "bkn_n"
) : Parcelable

fun getDefaultCity() = City("Москва", 55.755826, 37.617299900000035)

fun getWorldCities(): List<Weather> {
    return listOf(
        Weather(City("Лондон", 51.5085300, -0.1257400), "дождь", 10, 100, 80),
        Weather(City("Токио", 35.6895000, 139.6917100), "дождь", 10, 100, 80),
        Weather(City("Париж", 48.8534100, 2.3488000), "дождь", 10, 100, 80),
        Weather(City("Берлин", 52.52000659999999, 13.404953999999975), "дождь", 10, 100, 80),
        Weather(City("Рим", 41.9027835, 12.496365500000024), "дождь", 10, 100, 80),
        Weather(City("Минск", 53.90453979999999, 27.561524400000053), "дождь", 10, 100, 80),
        Weather(City("Стамбул", 41.0082376, 28.97835889999999), "дождь", 10, 100, 80),
        Weather(City("Вашингтон", 38.9071923, -77.03687070000001), "дождь", 10, 100, 80),
        Weather(City("Киев", 50.4501, 30.523400000000038), "дождь", 10, 100, 80),
        Weather(City("Пекин", 39.90419989999999, 116.40739630000007), "дождь", 10, 100, 80)
    )
}

fun getRussianCities(): List<Weather> {
    return listOf(
        Weather(City("Москва", 55.755826, 37.617299900000035), "дождь", 10, 100, 80),
        Weather(City("Санкт-Петербург", 59.9342802, 30.335098600000038), "дождь", 10, 100, 80),
        Weather(City("Новосибирск", 55.00835259999999, 82.93573270000002), "дождь", 10, 100, 80),
        Weather(City("Екатеринбург", 56.83892609999999, 60.60570250000001), "дождь", 10, 100, 80),
        Weather(City("Нижний Новгород", 56.2965039, 43.936059), "дождь", 10, 100, 80),
        Weather(City("Казань", 55.8304307, 49.06608060000008), "дождь", 10, 100, 80),
        Weather(City("Челябинск", 55.1644419, 61.4368432), "дождь", 10, 100, 80),
        Weather(City("Омск", 54.9884804, 73.32423610000001), "дождь", 10, 100, 80),
        Weather(City("Ростов-на-Дону", 47.2357137, 39.701505), "дождь", 10, 100, 80),
        Weather(City("Уфа", 54.7387621, 55.972055400000045), "дождь", 10, 100, 80)
    )
}



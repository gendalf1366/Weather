package ru.geekbrains.weather.view.main

import ru.geekbrains.weather.model.Weather

// передача данных из адаптера
interface OnItemViewClickListener {
    fun onItemViewClick(weather: Weather)
}

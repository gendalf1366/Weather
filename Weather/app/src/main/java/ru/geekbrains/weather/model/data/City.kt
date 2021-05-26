package ru.geekbrains.weather.model.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class City(
    val city: String
) : Parcelable
package ru.geekbrains.weather.model.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataTime(
    val dataTime : String
) : Parcelable

package ru.geekbrains.weather.view.details

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import ru.geekbrains.weather.R
import ru.geekbrains.weather.databinding.FragmentDetailsBinding
import ru.geekbrains.weather.model.Weather
import ru.geekbrains.weather.model.data.WeatherDTO


class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var weatherBundle: Weather
    private val onLoadListener: WeatherLoader.WeatherLoaderListener =
        object : WeatherLoader.WeatherLoaderListener {

            override fun onLoaded(weatherDTO: WeatherDTO) {
                displayWeather(weatherDTO)
            }

            override fun onFailed(throwable: Throwable) {
                Log.e("onLoadListener.OnFailed",
                    getString(R.string.server_connection_error), throwable)
                throwable.printStackTrace()
                Snackbar.make(
                    binding.mainView,
                    getString(R.string.server_connection_error),
                    Snackbar.LENGTH_INDEFINITE).show()
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        weatherBundle = arguments?.getParcelable(BUNDLE_EXTRA) ?: Weather()

        binding.mainView.visibility = View.GONE
        binding.loadingLayout.visibility = View.VISIBLE
        val loader = WeatherLoader(onLoadListener, weatherBundle.city.lat, weatherBundle.city.lon)
        loader.loadWeather()
    }

    private fun displayWeather(weatherDTO: WeatherDTO) {
        with(binding) {
            mainView.visibility = View.VISIBLE
            loadingLayout.visibility = View.GONE



            val city = weatherBundle.city
            binding.cityName.text = city.city
            binding.temperatureValue.text = weatherDTO.fact?.temp.toString()
            binding.weatherConditionText.text= weatherDTO.fact?.condition
            binding.humidityValue.text=weatherDTO.fact?.humidity.toString()
            binding.feelsLikeValue.text=weatherDTO.fact?.feels_like.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        const val BUNDLE_EXTRA = "weather"

        fun newInstance(bundle: Bundle): DetailsFragment {
            val fragment = DetailsFragment()
            fragment.arguments = bundle
            return fragment
        }
    }
}


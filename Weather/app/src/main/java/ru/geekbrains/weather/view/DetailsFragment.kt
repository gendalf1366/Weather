package ru.geekbrains.weather.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_details.view.*
import ru.geekbrains.weather.databinding.FragmentDetailsBinding
import ru.geekbrains.weather.model.Weather


class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.getRoot()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)
        val weather = arguments?.getParcelable<Weather>(BUNDLE_EXTRA)
        if (weather != null) {
            val city = weather.city
            val dateTime = weather.dateTime
            val conditionText = weather.conditionText


            binding.cityName.text = city.city
            binding.temperatureValue.text = weather.temperature.toString()
            binding.dateTime.text = dateTime.dataTime
            binding.weatherConditionText.text= conditionText.сonditionText
            binding.humidityValue.text=weather.humidity.toString()
            binding.pressureValue.text=weather.pressure.toString()
            binding.visibilityValue.text=weather.visibility.toString()
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


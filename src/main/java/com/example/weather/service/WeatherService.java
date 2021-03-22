package com.example.weather.service;

import com.example.weather.model.WeatherDto;
import com.example.weather.webclient.weather.WeatherClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private final WeatherClient weatherClient;

    @Autowired
    public WeatherService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    public WeatherDto getWeather() {
        return weatherClient.getWeatherForCity("warszawa");
    }


}

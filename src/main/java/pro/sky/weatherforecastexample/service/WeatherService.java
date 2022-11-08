package pro.sky.weatherforecastexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.weatherforecastexample.component.WeatherRestMap;
import pro.sky.weatherforecastexample.model.WeatherNow;

import java.io.IOException;

@Service
public class WeatherService {
    @Autowired
    private WeatherRestMap weatherRestMap;

    public boolean isCity(String city) throws IOException {
        return weatherRestMap.isCity(city);
    }

    public WeatherNow getCurrentWeather(String city){
        return weatherRestMap.getNowWeather(city);
    }
}

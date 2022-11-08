package pro.sky.weatherforecastexample.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pro.sky.weatherforecastexample.model.WeatherNow;
import pro.sky.weatherforecastexample.service.BotConfigService;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
public class WeatherRestMap {
    private RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private BotConfigService botConfigService;

    //получение текущей погоды
    public WeatherNow getNowWeather(String city){
        try {
            return restTemplate.getForObject(botConfigService.getNowApiTemp()
                            .replace("{city}",city),
                    WeatherNow.class);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //проверка существования города
    public boolean isCity(String city) throws IOException {

        URL weatherApiUrl = new URL(botConfigService.getNowApiTemp().replace("{city}",city));

        HttpURLConnection weatherApiConnection = (HttpURLConnection)weatherApiUrl.openConnection();
        weatherApiConnection.setRequestMethod("GET");
        weatherApiConnection.connect();
        return weatherApiConnection.getResponseCode() == HttpURLConnection.HTTP_OK;
    }
}

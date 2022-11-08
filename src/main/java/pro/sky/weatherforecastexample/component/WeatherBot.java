package pro.sky.weatherforecastexample.component;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import pro.sky.weatherforecastexample.service.BotConfigService;

@Component
public class WeatherBot extends TelegramLongPollingBot {
    @Autowired
    private BotConfigService botConfigService;
    @Autowired
    private WeatherBotFacade weatherBotFacade;

    @Override
    public String getBotUsername() {
        return botConfigService.getBotUsername();
    }

    @Override
    public String getBotToken() {
        return botConfigService.getBotAccessToken();
    }


    @SneakyThrows //отслеживание Exceptions
    @Override
    public void onUpdateReceived(Update update) {
        weatherBotFacade.handleUpdate(update);
    }
}

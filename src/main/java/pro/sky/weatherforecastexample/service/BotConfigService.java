package pro.sky.weatherforecastexample.service;

import org.springframework.stereotype.Service;
import pro.sky.weatherforecastexample.config.Command;
import pro.sky.weatherforecastexample.repository.BotConfigRepo;

import java.util.List;

@Service
public class BotConfigService {
    //пустой интерфейс, наследуемый от MongoRepository<BotConfig, BigInteger>
    private final BotConfigRepo botConfigRepo;

    public BotConfigService(BotConfigRepo botConfigRepo) {
        this.botConfigRepo = botConfigRepo;
    }

    public String getTelegramCallbackAnswerTemp(){
        return this.botConfigRepo.findAll().get(0).getTelegramCallbackAnswerTemp();
    }

    public String getNowApiTemp(){
        return this.botConfigRepo.findAll().get(0).getNowWeatherApiTemp();
    }

    public List<Command> getAllCommands(){
        return botConfigRepo.findAll().get(0).getCommands();
    }

    public String getBotUsername(){
        return botConfigRepo.findAll().get(0).getName();
    }

    public String getBotAccessToken(){
        return botConfigRepo.findAll().get(0).getAccessToken();
    }
}
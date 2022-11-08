package pro.sky.weatherforecastexample.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigInteger;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
// @Document(collection = "bot_config")
@Entity
public class BotConfig {
    @Id
    private BigInteger id;

    //имя бота, которое вы указали при регистрации
    private String name;

    //токен
    private String accessToken;

    //http://api.openweathermap.org/data/2.5/weather?q={city}&appid=ВАШ_КЛЮЧ&units=metric&lang=ru
    private String nowWeatherApiTemp;

    //подробнее о данной ссылке ниже
    //https://api.telegram.org/bot{token}/answerCallbackQuery?callback_query_id={id}
    private String telegramCallbackAnswerTemp;

    @OneToMany
    private List<Command> commands;

}

package pro.sky.weatherforecastexample.config;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
// @Document(collection = "chats_config")
@Entity
public class ChatConfig {

    @Id
    private BigInteger id;

    @NonNull
    private Long chatId;

    @NonNull
//  @Field(targetType = FieldType.STRING)
    private BotState botState;

    //стандартный город для пользователя
    private String city;

}


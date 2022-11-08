package pro.sky.weatherforecastexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.weatherforecastexample.config.ChatConfig;

import java.math.BigInteger;

@Repository
public interface ChatConfigRepo extends JpaRepository<ChatConfig, BigInteger> {
    ChatConfig findAllByChatId(Long chatId);
    void deleteByChatId(Long chatId);
}

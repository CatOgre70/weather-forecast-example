package pro.sky.weatherforecastexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.weatherforecastexample.config.BotConfig;

import java.math.BigInteger;

@Repository
public interface BotConfigRepo extends JpaRepository<BotConfig, BigInteger> {
}
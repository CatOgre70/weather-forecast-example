package pro.sky.weatherforecastexample.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Command {
    @Id
    private BigInteger id;
    private String name;    // /command
    private String description;  //  bla bla bla
}

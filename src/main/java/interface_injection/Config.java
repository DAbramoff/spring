package interface_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public SqlService sqlService(){
        return new SqlService();
    }
}

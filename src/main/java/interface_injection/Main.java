package interface_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Main implements CommandLineRunner {
//  Not Works without concrete @Bean in Configuration
    @Autowired
    MyService service;

//    Works
//    public Main(@Autowired SqlService service) {
//        this.service = service;
//    }

//    Works
//    @Autowired
//    public void setService(SqlService service) {
//        this.service = service;
//    }

//    Or
//    @Primary, @Qualifier for MyService.class implementations

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        service.execute();
    }
}

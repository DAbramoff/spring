package application_contexts.xml_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RunnableApplication {
    public static void main(String[] args) {
        SpringApplication.run(new Class[]{RunnableApplication.class, XmlWebApplicationRunnableInitializer.class}, args);
    }
}

package application_contexts.annotation_config_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RunnableApplication {
    public static void main(String[] args) {
        SpringApplication.run(new Class[]{AnnotationWebConfig.class, AnnotationWebApplicationRunnableInitializer.class}, args);
    }
}

package application_contexts.annotation_config_web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "application_contexts.annotation_config_web")
public class AnnotationWebConfig {
    @Bean
    public SqlService sqlService() {
        return new SqlService();
    }
}

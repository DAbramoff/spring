package application_contexts.annotation_config;

import org.springframework.stereotype.Service;

@Service
public class SqlService {
    public void execute() {
        System.out.println("******************************");
        System.out.println("* SqlService execute command *");
        System.out.println("******************************");
    }
}

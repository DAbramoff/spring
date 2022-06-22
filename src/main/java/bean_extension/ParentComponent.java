package bean_extension;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("main")
public class ParentComponent implements ComponentInterface {

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct parent method");
    }

    @Override
    public void execute(){
        System.out.println("Execute parent method");
    }
}

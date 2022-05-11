package application_contexts.annotation_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnnotationConfigApplication {
    @Autowired
    private SqlService sqlService;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("application_contexts.annotation_config");
        context.refresh();

        AnnotationConfigApplication bean = context.getBean(AnnotationConfigApplication.class);
        bean.execute();

        context.close();
    }

    public void execute(){
        System.out.println("************ ANNOTATION *************");
        sqlService.execute();
    }
}

package application_contexts.classpath_xml;

import application_contexts.annotation_config.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ClasspathXmlConfigApplication {
    @Autowired
    private SqlService sqlService;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClasspathXmlConfigApplication bean = context.getBean(ClasspathXmlConfigApplication.class);
        bean.execute();
        context.close();
    }

    public void execute(){
        System.out.println("************ CLASSPATH *************");
        sqlService.execute();
    }
}

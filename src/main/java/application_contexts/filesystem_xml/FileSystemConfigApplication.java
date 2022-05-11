package application_contexts.filesystem_xml;

import application_contexts.annotation_config.SqlService;
import application_contexts.classpath_xml.ClasspathXmlConfigApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FileSystemConfigApplication {
    @Autowired
    private SqlService sqlService;

    public static void main(String[] args) {
        String path = "D:/SandBox/spring/src/main/java/application_contexts/filesystem_xml/applicationContext.xml";
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(path);
        ClasspathXmlConfigApplication bean = context.getBean(ClasspathXmlConfigApplication.class);
        bean.execute();
        context.close();
    }

    public void execute(){
        System.out.println("************ FILESYSTEM *************");
        sqlService.execute();
    }
}

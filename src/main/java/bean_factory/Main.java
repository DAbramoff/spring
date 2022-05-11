package bean_factory;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/java/bean_factory/beanfactory-example.xml"));
        Employee emp_1 = (Employee) beanFactory.getBean("employee");
        System.out.println(emp_1);

        //Добавление BeanPostProcessor и BeanFactoryPostProcessor
        ConfigurableListableBeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/java/bean_factory/beanfactory-example.xml"));

        BeanPostProcessor beanPostProcessor = new BeanNameAutoProxyCreator();
        factory.addBeanPostProcessor(beanPostProcessor);

        BeanFactoryPostProcessor beanFactoryPostProcessor = new PropertySourcesPlaceholderConfigurer();
        beanFactoryPostProcessor.postProcessBeanFactory(factory);

        Employee emp_2 = (Employee) factory.getBean("employee");
        System.out.println(emp_2);
        emp_2.execute();
    }
}

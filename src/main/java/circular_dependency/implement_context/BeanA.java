package circular_dependency.implement_context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements ApplicationContextAware, InitializingBean {
    BeanB beanB;

    ApplicationContext context;

    public BeanB getBeanB() {
        return beanB;
    }


    @Override
    public void afterPropertiesSet() {
        beanB = context.getBean(BeanB.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}

package circular_dependency.post_construct;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanB {
    BeanA beanA;

    @PostConstruct
    public void init() {
        beanA.setBeanB(this);
    }

    public BeanA getBeanA() {
        return beanA;
    }
}

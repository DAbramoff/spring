package circular_dependency.problem;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    BeanB beanB;

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }
}

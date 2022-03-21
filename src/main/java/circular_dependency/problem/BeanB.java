package circular_dependency.problem;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    BeanA beanA;

    public BeanB(BeanA beanA) {
        this.beanA = beanA;
    }
}

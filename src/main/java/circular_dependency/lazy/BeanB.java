package circular_dependency.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    BeanA beanA;

    public BeanB(@Lazy BeanA beanA) {
        this.beanA = beanA;
    }
}

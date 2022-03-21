package circular_dependency.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    BeanB beanB;

    public BeanA(@Lazy BeanB beanB) {
        this.beanB = beanB;
    }
}

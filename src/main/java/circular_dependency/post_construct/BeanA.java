package circular_dependency.post_construct;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    BeanB beanB;

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}

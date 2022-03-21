package circular_dependency.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    BeanA beanA;

    @Autowired
    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }
}

package circular_dependency.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    BeanB beanB;

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}

package bean_extension;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//OVERRIDE PAREN @Qualifier PARENT BEAN IS NOT CREATED
// PAREN BEAN SHOULD HAVE @Qualifier("main") or @Component("main")
@Component
@Qualifier("main")
public class SubBean_4 extends ParentComponent {

    // PARENT @PostConstruct METHOD NOT CALLED
    @Override
    public void postConstruct(){
        System.out.println("PostConstruct sub_4 method");
    }

    // PARENT @PostConstruct METHOD NOT CALLED
    @PostConstruct
    public void postConstruct_4(){
        System.out.println("PostConstruct_4 sub_4 method");
    }

    @Override
    public void execute(){
        System.out.println("Execute sub_4 method");
    }
}

package bean_extension;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Primary
public class SubBean_3 extends ParentComponent {

    // CALLED BEFORE @PostConstruct PARENT METHOD
    @Override
    public void postConstruct(){
        System.out.println("PostConstruct sub_3 method");
    }

    // CALLED BEFORE PARENT @PostConstruct METHOD, BUT AFTER this.postConstruct()
    @PostConstruct
    public void postConstruct_3(){
        System.out.println("PostConstruct_3 sub_3 method");
    }

    @Override
    public void execute(){
        System.out.println("Execute sub_3 method");
    }
}

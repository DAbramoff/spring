package bean_extension;

import org.springframework.stereotype.Component;

// NOT WORK, BEAN DEFINITION DUPLICATION
@Component
public class SubBean_2 extends ParentComponent {
    @Override
    public void execute(){
        System.out.println("Execute sub_2 method");
    }
}

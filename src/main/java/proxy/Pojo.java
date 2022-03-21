package proxy;

import org.springframework.stereotype.Component;

@Component
public class Pojo {

    @Loggable
    public void test(){
        System.out.println("[Method] test method called");
        this.testUtil();
    }

    @Loggable
    public void testUtil(){
        System.out.println("[Method] testUtil method called");
    }

}

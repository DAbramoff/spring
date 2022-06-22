package bean_extension;

// NOT WORK, CALLED PARENT METHOD
public class SubBean_1 extends ParentComponent {
    @Override
    public void execute(){
        System.out.println("Execute sub_1 method");
    }
}

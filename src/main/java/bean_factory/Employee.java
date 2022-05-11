package bean_factory;

import interface_injection.MyService;
import interface_injection.SqlService;

public class Employee {
    private String name;
    private int age;
    private MyService service;

    public void setService(SqlService service) {
        this.service = service;
    }

    public void execute() {
        service.execute();
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

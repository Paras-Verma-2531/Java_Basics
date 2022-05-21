package Interfaces_prac;

public class ServiceProvider implements Interf{
    @Override
    // one should keep in mind the by default methods in interfaces are abstract and public therefore while overriding one should not change
    // the scope of modifier i,e not forget to write public
    public void feature1() {
        System.out.println("hello this is method 1");
    }

    @Override
    public void feature2() {
        System.out.println("hello this is method 2");
    }
}

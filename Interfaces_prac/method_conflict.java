package Interfaces_prac;

public class method_conflict implements Interf,Interf3{
    @Override
    // since both interface contains method with same signature therefore only one implementation is sufficient
    public void feature1() {
        System.out.println("hello this is feature 1");
        // works for both interfaces(both should have same return type and signature)
    }

    @Override
    public void feature2() {
        System.out.println("hello this is feature 2");
    }
}

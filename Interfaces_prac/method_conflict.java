package Interfaces_prac;

public class method_conflict implements Interf,Interf3{
    @Override
    // since both interface contains method with same signature therefore only one implementation is sufficient
    public void feature1() {
        System.out.println("hello this is feature 1");
        // works for both interfaces(both should have same return type and signature)
        // it is impossible to implement two interfaces simultaneously if they have same method signature but different return type
    }
    @Override
    public void feature2() {
        System.out.println("hello this is feature 2");
    }

    public static void main(String[] args) {
        // since both interfaces contains same interface variable therefore there reference is ambiguous
        // can be prevented using interface name along with variable
        System.out.println(Interf.x);
        System.out.println(Interf3.x);
    }
}

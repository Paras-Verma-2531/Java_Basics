package Interfaces_prac;

public class interf2_class implements  Interf2{

    public static void main(String[] args) {
        //age=23; cannot change the final variable
        System.out.println(age);
        interf2_class ir =new interf2_class();
        ir.m1();
        ir.m2();
    }
    public void m1()
    {
        System.out.println("hello");
    }
    public void m2()
    {
        System.out.println("hiii");
    }
}

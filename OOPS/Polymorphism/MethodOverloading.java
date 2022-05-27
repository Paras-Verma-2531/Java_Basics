package OOPS.Polymorphism;
// Overloading also known as Compile time polymorphism
public class MethodOverloading {
    public void m1()
    {
        System.out.println("no arg method");
    }
    public void m1(int a)
    {
        System.out.println("int arg method");
    }
    public void m1(double a)
    {
        System.out.println("double arg method");
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        // In method overloading :: method resolution(which method to call) is done by compiler through reference type
        mo.m1();
        mo.m1(12);
        mo.m1(12.2);
    }
}

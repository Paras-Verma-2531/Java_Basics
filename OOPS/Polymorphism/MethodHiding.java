package OOPS.Polymorphism;
// In Method Hiding i,e overriding for static methods there is no overriding as method res. is done by compiler with the help of reference type
class Parent_P
{
    public static void m1()
    {
        System.out.println("parent");
    }
}
class Child_C extends Parent_P
{
    public static void m1()
    {
        System.out.println("child");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        Parent_P p =new Parent_P();
        p.m1();
        Child_C c= new Child_C();
        c.m1();
        Parent_P p1= new Child_C();
        p1.m1();// will call parent method due to reference type hence(it is not overriding)
    }
}

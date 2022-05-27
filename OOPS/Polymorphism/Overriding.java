package OOPS.Polymorphism;
class Parent
{
    public void property()
    {
        System.out.println("cash+gold+land");
    }
    public void marry()
    {
        System.out.println("xyz");
    }
}
class Child extends Parent
{
    @Override
    public void marry() {
        System.out.println("abc");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Child cl = new Child();
        cl.marry();
        Parent pr= new Parent();
        pr.marry();
        Parent ps= new Child();
        ps.marry();// method resolution in overriding is done by JVM and therefore runtime obj is considered

    }
}

package OOPS.Polymorphism;

class Animal
{

}
class monkey extends  Animal{

}
public class Overloading2 {
    public void m1(Animal a)
    {
        System.out.println("Animal method");
    }
    public void m1(monkey m)
    {
        System.out.println("Monkey method");
    }

    public static void main(String[] args) {
        Overloading2 ov= new Overloading2();
        ov.m1(new Animal());
        ov.m1(new monkey());
        Animal an = new monkey();// parent reference to store child object
        ov.m1(an);// since method res. is done by compiler therefore reference type is considered::
        
    }
}

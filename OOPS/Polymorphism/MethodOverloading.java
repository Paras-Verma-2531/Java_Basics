package OOPS.Polymorphism;
// Overloading also known as Compile time polymorphism/static polym/Early binding
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
    public void m1(Object o)
    {
        System.out.println("object method");
    }
    public void m1(String s)
    {
        System.out.println("string obj");
    }
    public void m1(StringBuffer s)
    {
        System.out.println("string buffer obj");
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        // In method overloading :: method resolution(which method to call) is done by compiler through reference type
        mo.m1();
        mo.m1(12);
        mo.m1(12.2);
        //mo.m1(new Object());
        mo.m1("paras");
        // out of parent and child(object-String) :: child will get higher priority
       // mo.m1(null);// null is applicable to both object and string
       // mo.m1(null); compile time error since both string and stringBuffer are same level class thus raises ambiguity
    }
}

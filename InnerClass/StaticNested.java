package InnerClass;
public class StaticNested {
    /*
    1.sometimes, we can declare innerclass with static modifier, such classes are known as static nested class
    2.[normal innerclass[non-static] are strongly associated with outer class object i,e we cannot access without outer class object.]
    3.[static inner class are not strongly associated with outer class object]
    ---------------------------------------------------
    class outer
    {
    static class inner
    {
    public void m1()
    {
    sopln("hello");
    }
    }
    p s v m(String[] args)
    {
     inner in= new inner();
     in.m1();//without help of outer class object
     }
     }
     ---------------------
     types:
     =======================
     1.class inside a class
     2.interface inside an interface
     3.interface inside a class
     4.class inside an interface
     */
}

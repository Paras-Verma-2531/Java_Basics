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
     in.m1();
     }
     }
     */
}

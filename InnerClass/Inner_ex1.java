package InnerClass;

public class Inner_ex1 {
    class inner
    {
        public void m1()
        {
            System.out.println("method of inner class");
        }
    }
    public static void main(String[] args) {
        /*Inner_ex1 o= new Inner_ex1();--> outer class object
        Inner_ex1.inner i =o.new inner();--> inner class object
        i.m1();--> method calling
        */
        new Inner_ex1().new inner().m1();
    }
}

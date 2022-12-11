package Multithreading;
public class Inter_Example {
    public static void main(String[] args) {
        final CalculateSum obj;
        obj=new CalculateSum();
        Thread1 t1=new Thread1(obj,10);
        Thread2 t2= new Thread2(obj);
        t2.start();
        t1.start();

    }
}

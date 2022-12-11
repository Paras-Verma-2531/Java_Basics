package Multithreading;
public class Thread2 extends Thread{
    CalculateSum obj;
    public Thread2(CalculateSum obj)
    {
        this.obj=obj;
    }
    public void run()
    {
        try {
            System.out.println("the total is : "+obj.getSum());}
        catch (InterruptedException e) {}
    }
}
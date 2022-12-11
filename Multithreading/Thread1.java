package Multithreading;
public class Thread1 extends Thread{
    CalculateSum obj;private int num;
    public Thread1(CalculateSum obj,int num)
    {
        this.num=num;
        this.obj=obj;
    }
    public void run()
    {
        try {obj.calSum(num);}
        catch(InterruptedException e) {}
    }
}

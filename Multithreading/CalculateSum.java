package Multithreading;
public class CalculateSum {
    private int total=0;
    public synchronized void calSum(int num)throws InterruptedException
    {
        System.out.println("I am calculating sum");
        for(int i=1;i<=num;i++)
        { Thread.sleep(2000);
            total+=i;}
        System.out.println("I am going to notify");
        notify();
    }
    public synchronized int getSum() throws InterruptedException {
        System.out.println("I will wait for other");
        wait();
        System.out.println("I am notified");
        return total;
    }
}

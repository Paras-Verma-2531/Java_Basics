package Multithreading;
public class DeadLock_durga extends Thread {
    A a=new A();
    B b=new B();
    public void m1() throws InterruptedException {
        this.start();// main thread calling another thread
        a.m1(b);//executed by main thread
    }
    public void run()
    {
        try {b.m1(a);}
        catch (InterruptedException e){}
    }
    public static void main(String[] args)throws InterruptedException {
       DeadLock_durga d= new DeadLock_durga();
       d.m1();
    }
}

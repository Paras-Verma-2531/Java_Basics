package Multithreading;

public class thread_example extends Thread{
    public void run()
    {
        System.out.println("no arg method");
    }
    public void run(int i)// overloading possible of run method
    {
        System.out.println("int arg method");
    }
}

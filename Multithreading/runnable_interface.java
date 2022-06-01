package Multithreading;
// using Runnable interface
public class runnable_interface implements Runnable{
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println("child thread");
        }
    }
}

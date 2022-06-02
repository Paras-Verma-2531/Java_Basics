package Multithreading;
public class sleep_method{
    /*
    if a thread does not want to do any operation for particular amount of time , then we can go for sleep() method::
    prototype::
    public static native void sleep(long ms)[millisecond]
    public static void sleep(long ms,int ns)
    every sleep method throws InterruptedException which is checked Exception
    [NOTE]:: InterruptedException should be handled using throws or try catch block.
    thread only comes out of sleep when::
    1. sleep time period expires
    2. if the thread got interrupted
     */
    public static void main(String[] args) throws InterruptedException{
        for(int i=0;i<10;i++)
        {
            System.out.println("slide "+(i+1));
            Thread.sleep(5000);// sleep for 5 sec
        }
    }
}

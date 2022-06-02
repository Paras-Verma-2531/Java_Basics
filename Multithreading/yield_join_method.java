package Multithreading;
public class yield_join_method extends Thread {
    /*
    methods which can be used to prevent thread execution are:
    yield()
    join()
    sleep()
    :: yield() method:-->:
    it pauses the current working thread to give chance to waiting threads of same priority
    if there is no waiting thread , same thread can continue its execution
    yield method rollback the thread from running state to runnable/ready state
     */
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread::");
            Thread.yield();// pauses the current working thread
        }
    }
}

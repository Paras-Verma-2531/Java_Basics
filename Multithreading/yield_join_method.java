package Multithreading;
public class yield_join_method extends Thread {
    /*
    methods which can be used to prevent thread execution are:
    ==============================
    -----------------------------
    1.yield()   :: public static native void yield();[prototype]
    2.join()    :: public final void join();// join(long ms);/join(long ms,int ns);
    3.sleep()
    ===================================================================================================
    :: yield() method:-->:
    it pauses the current working thread to give chance to waiting threads of same priority
    --------------------------------------------------------------------------------
    if there is no waiting thread , same thread can continue its execution
    yield method rollback the thread from running state to runnable/ready state
  --------->>[this method temporarily pauses the execution to give chance to waiting threads of same priority.]]
  =======================================================================================================
  2.join method();
  ---------------------------------
  =================================
  --------------------------------
  unlike yield method, join method waits until completion of execution of current thread.
  :: no matter, how long it may take::
     ================
     if a thread wants to wait until completion of other thread, then we can go for join method.
     [ the thread which wants to wait should call join method]]
     suppose thread t2 has to wait for t1 then t2 should call t1.join();// waits for thread 1
     ---------------------------------------------------------
     */
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread::");
            Thread.yield();// pauses the current working thread
        }
    }public static void main(String[] args) {
        int i=0;
        new yield_join_method().start();
        while(i++<=10)
            System.out.println("main");
    }
}

package Multithreading;
public class Thread_info  {
    /*
    Thread is a lightweight process or can be defined as  flow of control.
    every java program contains at least one thread by default known as main thread
    can be defined using two ways:
    extend thread class
    implement  runnable interface
    ---- extends thread class
    :: override run method
    Job of a Thread:: code written inside the run method

    ----------------------------------------------
    public class MyThread extends Thread
    {
     public void run()
     {
     ////code
     }
     to execute run method one must call the start method
     psvm..
     {
      MyThread mt= new  MyThread();
      mt.start();// starting of a thread
      // main thread starts child thread
      --->main method and main thread both are different
      --> main thread calls main method
      /////////////////////////
      1.Thread Scheduler:it is a part of JVM ,and it decided the order in which different threads are to be executed.
      it schedules the execution of thread (order depend upon JVM to JVM)
      In Multithreading there is no guarantte for particular output.

      ---->IMPORTANT<----

      2. Diff bw start and run method::
      start() method is used to create new thread which internally calls run method.
      if we call run() method instead of start:: then it would be treated as normal method( no thread would be created)

      ----Significance of start method
      1. it is used to register newly created thread with thread scheduler and all other mandatory activities.
      hence,without using start method, there is no chance to start new thread. hence, start method is known as heart of multithreading

     */
}

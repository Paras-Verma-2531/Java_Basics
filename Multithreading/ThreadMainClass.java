package Multithreading;
public class ThreadMainClass {
    public static void main(String[] args) {
        //ThroughThreadClass th = new ThroughThreadClass();
       // th.start();// thread creation 1st method: Thread class
        runnable_interface rn = new runnable_interface(); // rn is runnable object
        Thread t= new Thread(rn);// here rn is target runnable
        // if we do not pass rn in Thread cons: t.start will call empty run method
        //t.start();// now child thread would be created
        yield_join_method yl= new yield_join_method();
        yl.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread");
        }
    }
}

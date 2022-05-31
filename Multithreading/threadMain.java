package Multithreading;

public class threadMain {
    public static void main(String[] args) {
        thread_example ex= new thread_example();
        ex.start();// creates new thread
        // internally call no arg run method
        /*
        ex.run(); would be treated as normal method hence, no thread would be created
        // overloading is always possible but start method will always call no arg run method
         */
    }
}

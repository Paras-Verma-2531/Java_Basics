package Multithreading;
public class ThreadConstructors extends Thread{
    public static void main(String[] args) {
        /*
        Thread t= new Thread();
        Thread t= new Thread(Runnable r);
        Thread t= new Thread("name");
        Thread t= new Thread(Runnable r,String name);
        Thread t= new Thread(ThreadGroup g, String name);
        Thread t= new Thread(ThreadGroup g,Runnable r);
        Thread t= new Thread(ThreadGroup g,Runnable r,String name);
        Thread t= new Thread(ThreadGroup g,Runnable r,String name,long stackSize);
         */
        System.out.println(Thread.currentThread().getName());// main thread
        ThreadConstructors th= new ThreadConstructors();
        System.out.println(th.getName());// child thread
        Thread.currentThread().setName("paras verma");
        System.out.println(Thread.currentThread().getName());// to change the name of current thread
    }
}

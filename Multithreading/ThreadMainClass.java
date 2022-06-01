package Multithreading;

public class ThreadMainClass {
    public static void main(String[] args) {
        ThroughThreadClass th = new ThroughThreadClass();
        th.start();// thread creation
        for(int i=0;i<1000;i++)
        {
            System.out.println("main thread");
        }
    }
}

package Multithreading;
public class A {
    public synchronized void m1(B  b) throws InterruptedException {
        System.out.println("Thread 1 starts execution of m1 method of A");
        Thread.sleep(5000);
        System.out.println("Thread 1 calling b's last method");
        b.last();
    }
    public synchronized void last()
    {
        System.out.println("Inside A's last method");
    }
}

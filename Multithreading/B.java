package Multithreading;
public class B {
    public synchronized void m1(A a) throws InterruptedException {
        System.out.println("Thread 2 starts execution of m1 method of B");
        Thread.sleep(5000);
        System.out.println("Thread 2 calling a's last method");
        a.last();
    }
    public synchronized void last() {
        System.out.println("Inside B's last method");
    }
}
package Multithreading;
public class InterThreadExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a= new ThreadA();
        a.start();// new thread
        /*
        Thread.sleep(10000);
        a.join() ---> main thread will join 'a' thread i,e waiting for "a" to complete first
         */
        synchronized (a)
        {
            System.out.println("Main thread trying to call wait method");
            a.wait();// main thread will wait for updation to complete
        }
        System.out.println(a.total);//waiting for update or result of the loop
        /*
        however calling sleep method is not recommended because it is the wastage of cpu time.
        should not use join method as well [ becoz then main would wait for whole 'a' to complete i,e 1 crore lines of code as well]:
         */

    }
}
class ThreadA extends Thread
{ int total=0;
    @Override
    public void run() {
        //sum of n natural numbers
        for(int i=1;i<=100;i++)
            total+=i;
        synchronized (this) {
            System.out.println("I'm notifying the main thread about the result");
            this.notify();
        }
        // 1 crore lines of code
    }
}

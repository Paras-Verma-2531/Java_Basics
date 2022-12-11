package Multithreading;
public class Deadlock {
    public static void main(String[] args) throws InterruptedException {
        new Thread()
        {
            public void run()
            {
                try {
                    System.out.println(this.getName());
                    this.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
        Thread.currentThread().join();
        System.out.println("will not execute this line");
    }
}

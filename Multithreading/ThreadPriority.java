package Multithreading;
public class ThreadPriority extends Thread {
    /*
    valid range of priority--->(1-10):: HIGHER THE NUMBER, HIGHER IS THE PRIORITY
    min priority:: 1
    max priority:: 10
    normal priority::5
    following constants to represent following priorities:
    :)Thread.MIN_PRIORITY=1
    :)Thread.MAX_PRIORITY=10
    :)Thread.NORM_PRIORITY=5

     */
    public static void main(String[] args) {
        ThreadPriority tp = new ThreadPriority();
        tp.setPriority(9);// set priority
        tp.setName("paras thread");
        System.out.println("name of the thread is " +tp.getName()+" and its priority is "+tp.getPriority());
    }
}

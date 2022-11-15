package Multithreading;
public class Intro {
    public static void main(String[] args) {
        System.out.println("Multithreading:::");
        /*
        MultiThreading can be implemented in two ways:
        1. extending thread class
        2. runnable interface
        ::Multitasking: performing several task simultaneously
              ----process based multitasking----
              each process/task is independent of other task(they all are different programs)[each task is a separate process]
              ----Thread based multitasking----
              executing several threads/process simultaneously where each part is independent of other but is a part of same program.
              [each task is a same process but  different sections]
                eg: A program contains 10k lines of code 5k-5k (we can compile both at same time rather than waiting for 1st to compile)
       ::[[main purpose of multitasking is to reduce the response time and improve the performance of the system]]
executing multiple threads at a same time/simultaneously is known as multithreading
eg:: Animations,video games, server development etc(Applications)
wherever independent job is there, try to use separate threads
==============================
Example::
suppose we need to search a file in our PC then instead of checking one by one, we can create separate threads for each drive
and within them, we can create separate thread for each folder.[[ reduces the time to large extent]]
         */
    }

}

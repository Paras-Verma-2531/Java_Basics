package Multithreading;
public class join_method {
    /*
    if a thread wants to wait until the completion of some other working thread, then we can go for join method.
    eg:
    venue fixing(t1)
    printing card(t2)
    delivering card(t3)
    since printing of card cannot be done without fixing venue therefore t2 has to wait::
    i,e----> t2 will call join method on t1 [t1.join()]
    similarly, delivering card has to wait for t2
    ----> t3 will call join method on t2 [t2.join()]
     */
}

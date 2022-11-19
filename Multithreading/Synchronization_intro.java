package Multithreading;
public class Synchronization_intro {
    /*
    Synchronized keyword is only applicable to methods and block::
    uses lock concept internally:
    Synchronized area can only be access by one thread at a time.
    -----------------------------------------
    :: [when to use syncro] :: wherever state of object is changing such as add,delete,update etc such type of activity should be performed by a single thread one
    at a time[not many on same object at a same time]
    ================
    lock concept is applicable on objects not on methods therefore if any syncro object is in execution so other syncr
     method can be performed on same object becoz the lock is being acquired.
        ==============================================================
    ::->:: if multiple threads tries to access same object simultaneously,it may lead to  data inconsistency problem[race condition]
    this can be prevented using synchronized keyword[gives one by one access nature]
    the biggest advantage of synchronized keyword is it prevents data inconsistency problem.

    ---------------------------------------------------------------------------------------
    main disadvantage is it increases waiting time of thread and creates performance problem.
    [ if not specific required do not go for synchronized block]]
    =============================
     */
}

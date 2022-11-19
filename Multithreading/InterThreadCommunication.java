package Multithreading;
public class InterThreadCommunication {
    /*
    thread can communicate with each other with the help of wait,notify and notifyAll() methods
    :-----------------------------------
    Thread communication is required becoz it can prevent wasting time of the system
    ===================================
    Inter-thread communication or Co-operation is all about allowing synchronized
     threads to communicate with each other
     ----------------------------------
     ---------------------------------
     //All these methods can be called only in the synchronized area or in synchronized block
     [[[[[[[[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
     1.wait method():: thread which is expecting to be notified/ requires to be  updated  should call wait method
     [it will call wait method on the object for which it is waiting to be updated]
     --------------------------------------------------------
     thread can call wait method on any java object therefore, it is available in Object class not in thread class
     similarly notify and notify can be called to any java object thus, present in object class:
     ==================================================
     eg: if a person is waiting for postbox to be updated then he should call wait method on postbox i,e postbox.wait();
       [thread will enter into waiting state]
     --------------------------------------------------------
   ============================================================================
     2.notify method():: thread whose job is to update should call notify method(responsible for updation)
     [waiting threads get the notification and continue it's execution with updated values]
     */
}

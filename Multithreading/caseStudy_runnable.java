package Multithreading;

public class caseStudy_runnable {
    /*
    Runnable interface approach should be used::
     case study::
     myrunnable rn = new myrunnable();
     Thread t= new Thread();
     Thread t2= new Thread(rn);
     1::
         t.start()---> this will create new thread which will call empty run method (not overridden method)
     2::
     t.run();--> no new thread will be created and normal run would be executed
     3::
     t2.start();--> new thread would be created and overridden method would be executed
     4::
     t2.run();---> no thread would be created and run method would be executed as normal method
     */
}

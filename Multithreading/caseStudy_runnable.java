package Multithreading;

public class caseStudy_runnable {
    /*
    Runnable interface approach should be used::
   :::->::: through first method, we could not use the proper inheritance since we have already inherited one class. whereas,
   in the second approach we can inherit other class as well
     case study::
     myRunnable rn = new myRunnable();
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

package InnerClass;
public class StaticNested {
    /*
    1.sometimes, we can declare innerclass with static modifier, such classes are known as static nested class
    2.[normal innerclass[non-static] are strongly associated with outer class object i,e we cannot access without outer class object.]
    3.[static inner class are not strongly associated with outer class object]
    ---------------------------------------------------
    class outer
    {
    static class inner
    {
    public void m1()
    {
    sopln("hello");
    }
    }
    p s v m(String[] args)
    {
     inner in= new inner();
     in.m1();//without help of outer class object
     }
     }
     ---------------------
     types:
     =======================
     1.class inside a class
     ---------------------------
     [whenever object creation of one is not possible without existing another] {department without university is not poss.}
     ===========================================[Normal Regular Inner class [  class uni{class dept{}} ]
     2.interface inside an interface
     ---------------------------------
     we can declare interface inside another. example given below:
     A map is a group of key value pairs which itself is known as Entry:: therefore existence of entry is not possible without map:
     [!!![[[[[!!!]]]]]!!!]
     interface Entry is defined inside Map
     interface Map
     {
     interface Entry
     {
     ::
     }
     }

     3.interface inside a class
     --------------------------------------------
     within a class multiple implementation of interface is required and all these classes are bound to single class
     then we can go for interface inside a class
     [
     class vehicleTypes
     {
     interface vehicle
     {
     public int getNoOfTyres();
     }
     class Bus implements vehicle
     {
     public int getNoOfTypres(){return 6;}
     }
     ..................several vehicles types classes.......//////
     }
     ]
     ==========================================

     4.class inside an interface
     ----------------------------------
     if a functionality of a class is strongly associated with an interface, we cannot use class without interface then we can go
     for class inside an interface...
     -------------------
     ////////////////
     ==================
     interface EmailService
     {
     public void sendEmail(EmailDetails e);
     //here emailDetails is only required for send email which is only required for sendEmail
     [thus we can go for class inside an interface]
     class EmailDetails
     {
     String to_list,cc_list,subject,body;....
     }
     }
     =============================================
     */
}

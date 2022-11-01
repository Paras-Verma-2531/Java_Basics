package InnerClass;
public class intro {
    /*
    Classes inside the classes are known as InnerClasses.
    The main purpose of innerclass were to fix the bug  of GUI in event handling.
    however, it became so popular that programmers started using it in regular coding.
    -----when to use innerclass concept-------
    without existing one type of object, if there is no chance for other object:: then we can use innerclass
    eg::
    class university
    {
       class department
       {
       }

     }
      here department depends on uni:: hence it is inner class
     ======================
     Real Life Example
     -------------------------
     -------------------------
     interface Map
     {
     interface Entry
     {
     }
     }
     ============================
     ----> without the existence of map [existence of entry is not possible]
     ===================================
     ------------------------------
     without existing the outer class object, it is not possible to have inner class object
     ---------------------------------------------------------------------------------
     ---------------------------------------------------------------------------------
     Outerclass and Innerclass shares[Has-A] relation between them.  Also known as composition/Aggregation.
     [TYPES OF INNERCLASS]
     there are 4 types of innerclass::
     1. normal/regular innerclass
     2. method local Innerclass
     3. Anonymous Innerclass
     4. Static nested Innerclass

     whenever we compile a class , the .class for innerclass would be like [outer$inner.class]
     */
}

package InnerClass;
public class MethodLocal {
    /*
    MOST RARELY INNER TYPE CLASS::
    ==============================
    -------------------------------------------
    ==============================
    sometimes, we can declare a class inside a local class, such class is known as MethodLocal innerclass.
    the main objective of MethodLocal class is as follows::
    suppose we need a method inside a method but in java nested method is not possible. but we have 2 possible ways to resolve this::
    1. declare that method outside that method( but  this method is only used inside one method, so why should we declare it in outside the calling method)
    2. we can create inner class inside a method and can declare that method inside inner class.

    ----------------main purpose:::
    [...it provides method specific repeated functionality...]
    ==================================
    
    best suitable---->>[wherever nested method is required, we can go for methodLocal innerclass]
    ::::--->we can access both the static and non-static variables from methodLocal innerclass if a method is instance method.
    ::--> bu if the method is static, we will be getting some compile time error.

     */
    public void m1()
    {
        class inner
        {
            public void sum(int x,int y)
            {
                System.out.println("the sum is "+(x+y));
            }
        }
        inner in = new inner();
        in.sum(10,20);
        in.sum(100,200);
        in.sum(200,400);

    }

    public static void main(String[] args) {
        MethodLocal ml =new MethodLocal();
        ml.m1();
    }
}

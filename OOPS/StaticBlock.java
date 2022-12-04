package OOPS;
public class StaticBlock {
    /*
    if everything in a program is static:: how it will be executed?
    ==========================
    rules for the order of execution of the static block:
    [--------------------------------------------------]
    1.Identification of static members from top to bottom :: here variables are in [RIWO] if used directly may lead to CT error
    STEPS [1-6]:: calling a variable inside function is indirect read whereas outside it, calls direct read which may throw compile time
    error if variable is in RIWO state:
    2. Execution of static member assignments and static blocks from top to bottom [ R&W] :: STEPS[ 7-12]
    3.Execution of main method  :steps [13-15]

     */
    static int i=10;//1 RIW0==0] -> 7[R&W]
    static//2--> 8
    {
        m1(); //--> 0
        System.out.println("first static block");//10
    }
    public static void main(String[] args) {//3
        m1();
        System.out.println("main method");
    }
    public static void m1()//4 --> 9
    {
        System.out.println(j);
    }
    static//5---> 11
    {
        m1();
        System.out.println("second static block");
    }
    static int j=20;//6 RIW0==0]--12 [R&W]
}

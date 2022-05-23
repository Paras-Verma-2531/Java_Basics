package ExceptionHandling;

public class throwAE {
    //static java.lang.ArithmeticException e= new java.lang.ArithmeticException();// throws AE since object is created
    static java.lang.ArithmeticException e1;// throws null pointer Exception
    public static void main(String[] args) {
        //throw e;
        throw e1;

    }
}

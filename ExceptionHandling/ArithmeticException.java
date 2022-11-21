package ExceptionHandling;
public class ArithmeticException {
    public static void main(String[] args) {
        //System.out.println(10/0);// Arithmetic Exception (No try-catch block)
        try {
            System.out.println(10 / 0);// exception handled
        } catch (Exception e) {
            e.printStackTrace();// gives complete information about the exception
            System.out.println(e);// 2nd method
            System.out.println(e.getMessage());// 3rd method


        }
    }
}

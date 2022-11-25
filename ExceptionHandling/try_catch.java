package ExceptionHandling;

public class try_catch {
    public static void main(String[] args) {
       // try
        //System.out.println(10 / 0);
        try {// try-catch cannot be used without curly brackets
            System.out.println(10 / 0);
        }
       // System.out.println(10 / 0); ANYTHING BW TRY-CATCH-FINALLY IS NOT ALLOWED
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

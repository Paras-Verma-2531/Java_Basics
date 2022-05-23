package ExceptionHandling;

public class try_catch {
    public static void main(String[] args) {
        try // try-catch cannot be used without curly brackets
        System.out.println(10/0);
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

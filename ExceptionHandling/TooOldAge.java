package ExceptionHandling;

public class TooOldAge extends  RuntimeException{
    TooOldAge(String s)
    {
        super(s);
    }
}

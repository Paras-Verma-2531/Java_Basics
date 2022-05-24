package ExceptionHandling.CustomisedException;

public class TooYoungAge extends  RuntimeException{
    TooYoungAge(String s)
    {
        super(s);
    }
}

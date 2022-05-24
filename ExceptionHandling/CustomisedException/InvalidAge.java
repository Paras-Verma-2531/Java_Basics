package ExceptionHandling.CustomisedException;
public class InvalidAge extends RuntimeException{
    InvalidAge(String s)
    {
        super(s);
    }
}

package ExceptionHandling.CustomisedException;

public class TooOldAge extends  RuntimeException{
    TooOldAge(String s)
    {
        super(s);//to make discription available to default Exception handler
    }
}

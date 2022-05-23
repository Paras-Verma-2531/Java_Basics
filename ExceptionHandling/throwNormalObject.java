package ExceptionHandling;

public class throwNormalObject extends RuntimeException {
    public static void main(String[] args) {
        // we can only throw throwable objects not objects of normal Java Class
        //throw  new throwNormalObject; :: results in compile time error
        throw  new throwNormalObject();// cn be thrown by extending RuntimeException
    }
}

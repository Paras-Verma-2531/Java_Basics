package ExceptionHandling;
public class throwKeyword {
    public static void main(String[] args) {
        System.out.println("sometimes we may need to create explicit exception and may need to handover it to JVM manually which is done by throw keyword");
        throw  new java.lang.ArithmeticException("/ by zero");
    }
}

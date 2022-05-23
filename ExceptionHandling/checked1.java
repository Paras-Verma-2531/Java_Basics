package ExceptionHandling;

import java.io.PrintWriter;

public class checked1 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("abc.txt");// unreported checked exception ( compiler is responsible)
        pw.println("hello how are you");
        System.out.println("done!!");

    }
}

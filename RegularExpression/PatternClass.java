package RegularExpression;

import java.util.regex.Pattern;

public class PatternClass {
    /*
    different methods of Pattern class::
    1.split():
    whenever, we have to separate a string using particular pattern. we can use split method.
    eg::
    Pattern p = Pattern.compile("\\s");
    String[] st= p.split("paras verma");

     */
    public static void main(String[] args) {
        Pattern p= Pattern.compile("\\s");
        String[] s= p.split("paras verma");
        for(String s1: s)
        {
            System.out.println(s1);
        }
    }
}

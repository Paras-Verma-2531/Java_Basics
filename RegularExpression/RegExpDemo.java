package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {
    /*
    to check whether a pattern is present in given string or not.
    ----------------------------
    ----------------------------
    Step 1)) create a pattern object with given syntax.
    Pattern p =Pattern.compile("ab");--> here, Pattern is the class
    Step 2)) create matcher class object
    Matcher m= p.matcher("abbabba");---> matcher method is present in Pattern class.
    Step 3)) run find method on matcher object
     */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab");// target string{subset}
        Matcher m= p.matcher("abbabba");//{string}
        while(m.find())
        {
            System.out.println(m.start()+"....."+m.end()+"...."+m.group());// prints starting index
        }
    }
    /*
    A pattern object represents compiled version of Regular Expression.


     */
}

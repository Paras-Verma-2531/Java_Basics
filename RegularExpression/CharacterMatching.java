package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterMatching {
    /*
    whenever we want to check whether either of the character is present or not, place the character under "[]"
    [abc] either 'a' or 'b' , 'c'::
    2.[^abc] if other than abc any other character is present, let us know
    3.[a-z] ==> any lower case alphabet symbol between (a-z):
    4.[A-Z] ==> any upper case alphabet symbol between (A-Z):
    5.[a-zA-Z]==> any alphabet symbol either in upper case or in lower case.
    6.[0-9]==> any numeric digit
    7.[0-9a-zA-Z]==> any alphanumeric symbol
    8.[^0-9a-zA-Z]==> except alphanumeric character
    ===================================
    Predefined character Classes:
    ===================================
    -----------------------------------
    9.|s ===> space character
    10.|S ==> except space character
    11. |d ==> any numeric digit
    12. |D ==> except any numeric digit
    13 .|w ==> any word  character(alphanumeric character)
    14. |W ==> except alphanumeric character
     */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[abc]");
        Matcher m= p.matcher("abdcabc");
        while(m.find())
        {
            System.out.println(m.start());// will print the index of a,b,c if present.
        }
    }
}

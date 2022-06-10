package RegularExpression;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    /*
    it is a specially designed class for tokenization activity and is present in java.util package.
   =====>>> The default regex for String tokenizer is space.
    StringTokeenizer st= new StringTokenizer("paras verma");
    while(st.hasmoreToken())
    {
    sopln(st.nextToken());
     */
    public static void main(String[] args) {
        StringTokenizer st= new StringTokenizer("10-6-2022","-");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}

package FileHandling;
import java.io.File;
import java.io.IOException;

public class FirstFile {
    public static void main(String[] args)throws Exception{
        int count=0;
        File f= new File("D://movies");// path name
        String[] s= f.list();// stores file name in array
        for(String s1: s)
        {
            ++count;
        }
        System.out.println(count);
    }
}

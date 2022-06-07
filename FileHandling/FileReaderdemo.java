package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderdemo {
    public static void main(String[] args) throws IOException {

        FileWriter fw= new FileWriter("PARAS.txt");
        fw.write("hello my name is paras");
        fw.close();
        FileReader fr= new FileReader("PARAS.txt");
        int data1=fr.read();
        while(data1!=-1)// prints all character one by one
        {
            System.out.print((char)data1);
            data1=fr.read();
        }
    }
    //---------------------------------
    /*
    second approach
    char[] ch = new char[(int)fw.length()];
    fr.read(ch);
    for(char ch1: ch)
    {
    sout(ch1);
    }
     */

}

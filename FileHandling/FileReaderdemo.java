package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderdemo {
    public static void main(String[] args) throws IOException {
        String data= " hello my name is paras verma";
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

}
